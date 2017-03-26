package main.java.com.tanklab.main;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.tank.entity.Link;
import com.tank.entity.Node;
import com.tank.entity.Point;
import com.tank.entity.Topology;
import com.tank.utils.GetUniqueID;

/**
 * 
 * @author CaiHe
 * @describe this module is to collect the info of the topology 
 * @since 2017-2-23
 */
public class TopologyManager {
	
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
				try{
					topo.setTopoId(topoObj.getString("topology-id"));
					if(topo.topoId.equals("ovsdb:1"))continue;  // if ovsdb:1 skip it
					JSONArray jNodeAry = topoObj.getJSONArray("node");
					for(int j = 0;  j < jNodeAry.length() ;++j){
						JSONObject nodeObj = jNodeAry.getJSONObject(j);
						if(nodeObj.getString("node-id").contains("host"))continue;
						Node node = new Node(GetUniqueID.getUniqueID(),nodeObj.getString("node-id"),nodeObj.getString("opendaylight-topology-inventory:inventory-node-ref"));
						JSONArray jPointAry = nodeObj.getJSONArray("termination-point");
						for(int w = 0 ; w < jPointAry.length() ;++w){
							JSONObject pointObj = jPointAry.getJSONObject(w);
							Point point = new Point(pointObj.getString("tp-id"),pointObj.getString("opendaylight-topology-inventory:inventory-node-connector-ref"));
							node.addPoint(point);
						}
						nodes.add(node);
					}
					topo.setNodeList(nodes);
					
					JSONArray jLinkAry = topoObj.getJSONArray("link");
					topo.generateGraphic(jLinkAry);
					topoList.add(topo);
				}catch(JSONException e){
					//do nothing...
					Log.info(e.getMessage());
				}
			}
		} catch (JSONException e) {
			Log.info(e.getMessage());
		}
		
		Log.info("Topology load Success!");
	}
	

}
