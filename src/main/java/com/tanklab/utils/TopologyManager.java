package main.java.com.tanklab.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import main.java.com.tanklab.entity.Link;
import main.java.com.tanklab.entity.Node;
import main.java.com.tanklab.entity.Point;
import main.java.com.tanklab.entity.Topology;


/**
 * 
 * @author CaiHe
 * @describe this module is to collect the info of the topology 
 * @since 2017-2-23
 */
public class TopologyManager {
	private static Logger logger = Logger.getLogger(TopologyManager.class);
	public static List<Topology> topoList = new ArrayList<Topology>();
	//public 
	public static void getTopoInfo(){
		String[] s = RestAPIManager.get("topology");
		String json = RequestManager.request(s[0], s[1], null);
		
		//test
		
		System.out.println(json);
		//test end
		try {
			JSONObject jobj = new JSONObject(json);
			JSONArray topoAry = jobj.getJSONObject("network-topology").getJSONArray("topology");
			
			for(int i = 0; i< topoAry.length() ;++i){
				JSONObject topoObj = topoAry.getJSONObject(i);				
				Topology topo = new Topology();
				List<Node> nodes = new ArrayList<Node>();
				List<Link> links = new ArrayList<Link>();
				
				try{
					String topology_id=null;
					topology_id = topoObj.getString("topology-id");
					if(topology_id.equals("ovsdb:1")){//physical topology
						JSONArray jNodeAry = topoObj.getJSONArray("node");
						 for(int j = 0;  j < jNodeAry.length() ;++j){
							JSONObject nodeObj = jNodeAry.getJSONObject(j);
							
							if(nodeObj.getString("node-id").contains("host")) {
								continue;
							}
						
					}}else if(topology_id.equals("flow:1")){//openflow logical topology
						
						
					}else{
						
						
					}
					
				
//					topo.setTopoId(topoObj.getString("topology-id"));
//					if(topo.topoId.equals("ovsdb:1"))continue;  // if ovsdb:1 skip it
					JSONArray jNodeAry = topoObj.getJSONArray("node");
					for(int j = 0;  j < jNodeAry.length() ;++j){
						JSONObject nodeObj = jNodeAry.getJSONObject(j);
						/*
						 * set host information
						 * 2017.3.21 15:26
						 */
						if(nodeObj.getString("node-id").contains("host")) {
							continue;
						}

//						Node node = new Node(GetUniqueID.getUniqueID(),nodeObj.getString("node-id"),nodeObj.getString("opendaylight-topology-inventory:inventory-node-ref"));
						JSONArray jPointAry = nodeObj.getJSONArray("termination-point");
						for(int w = 0 ; w < jPointAry.length() ;++w){
							JSONObject pointObj = jPointAry.getJSONObject(w);
//							Point point = new Point(pointObj.getString("tp-id"),pointObj.getString("opendaylight-topology-inventory:inventory-node-connector-ref"));
//							node.addPoint(point);
						}
//						nodes.add(node);
					}
//					topo.setNodeList(nodes);
					
					JSONArray jLinkAry = topoObj.getJSONArray("link");
//					topo.generateGraphic(jLinkAry);
//					topo.getMapOfNode();
					topoList.add(topo);
				}catch(JSONException e){
					//do nothing...
					logger.info(e.getMessage());
				}
			}
		} catch (JSONException e) {
			logger.info(e.getMessage());
		}
		
		logger.info("Topology load Success!");
	}
	
	public static List<Topology> updateTopoInfo() {
		List<Topology> res = new ArrayList<Topology>();

		String[] s = RestAPIManager.get("topology");
		String json = RequestManager.request(s[0], s[1], null);

		try {
			JSONObject jobj = new JSONObject(json);
			JSONArray topoAry = jobj.getJSONObject("network-topology").getJSONArray("topology");
			for(int i = 0; i< topoAry.length() ;++i){
				JSONObject topoObj = topoAry.getJSONObject(i);
				Topology topo = new Topology();
				List<Node> nodes = new ArrayList<Node>();
				try{
//					topo.setTopoId(topoObj.getString("topology-id"));
//					if(topo.topoId.equals("ovsdb:1"))	continue;  // if ovsdb:1 skip it
					JSONArray jNodeAry = topoObj.getJSONArray("node");
					for(int j = 0;  j < jNodeAry.length() ;++j){
						JSONObject nodeObj = jNodeAry.getJSONObject(j);
						if(nodeObj.getString("node-id").contains("host")) {
							continue;
						}

//						Node node = new Node(GetUniqueID.getUniqueID(),nodeObj.getString("node-id"),nodeObj.getString("opendaylight-topology-inventory:inventory-node-ref"));
						JSONArray jPointAry = nodeObj.getJSONArray("termination-point");
						for(int w = 0 ; w < jPointAry.length() ;++w){
							JSONObject pointObj = jPointAry.getJSONObject(w);
//							Point point = new Point(pointObj.getString("tp-id"),pointObj.getString("opendaylight-topology-inventory:inventory-node-connector-ref"));
//							node.addPoint(point);
						}
//						nodes.add(node);
					}
//					topo.setNodeList(nodes);
					
					JSONArray jLinkAry = topoObj.getJSONArray("link");
//					topo.generateGraphic(jLinkAry);
					res.add(topo);
				}catch(JSONException e){
					logger.info(e.getMessage());
				}
			}
		} catch (JSONException e) {
			logger.info(e.getMessage());
		}

		return res;
		
	}
	public static void main(String []args){
		getTopoInfo();
		
	}
}
