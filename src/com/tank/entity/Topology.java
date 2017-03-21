package com.tank.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.tank.main.Log;
import com.tank.main.RequestManager;
import com.tank.main.RestAPIManager;

/**
 * 
 * @author CaiHe
 * @describe to generate the topo informatiom
 */
public class Topology {
	public  String topoId = null;
	public  Link[][]  graphic =  null; 
	public  List<Node> nodesList = null;
	public  Map<String/*openflow:1*/,String/*ZJWZ*/> nodeMaps = new HashMap<String,String>();
	public  Map<String/*openflow:1:1*/,String/*of:1*/> portMaps = new HashMap<String,String>();
	public  Map<String/*openflow:1 */,String> ovsdbIpMaps = new HashMap<String,String>();
	public  Map<String,String> ovsTpDbNameMaps = new HashMap<String,String>();

	/*
	 * override euals of Topology
	 */
	public boolean equals(Topology b){
		if(this.nodesList.size() != b.nodesList.size()) 
			return false;
		int n = this.nodesList.size();
		for(int i = 0;i < n;i ++) {
			for(int j = 0;j < n;j ++) {
				if(this.graphic[i][j].equals(b.graphic[i][j]) == false)
					return false;
			}
		}
		return true;
	}

	public String getTopoId() {
		return topoId;
	}

	public void setTopoId(String topoId) {
		this.topoId = topoId;
	}

	public  List<Node> getNodeList() {
		return nodesList;
	}

	public  void setNodeList(List<Node> nodeList) {
		this.nodesList = nodeList;
		this.graphic = new Link[this.nodesList.size()][this.nodesList.size()];
	}

	public  void setGraphic(Link[][] graphic) {
		this.graphic = graphic;
	}

	
	public  void generateGraphic(JSONArray jLinkAry){
		for(int i = 0 ; i < jLinkAry.length() ;++i){
			try {
				JSONObject linkObj = jLinkAry.getJSONObject(i);
				Link link = new Link();
				if(linkObj.getString("link-id").contains("host"))continue;
				link.setLinkID(linkObj.getString("link-id"));
				JSONObject sourceObj = linkObj.getJSONObject("source");
				link.setSrcNodeId(sourceObj.getString("source-node"));
				link.setSrcTp(sourceObj.getString("source-tp"));
				
				JSONObject dstObj = linkObj.getJSONObject("destination");
				link.setDstNodeId(dstObj.getString("dest-node"));
				link.setDstTp(dstObj.getString("dest-tp"));
				
				graphic[getNodeUniqueByNodeId(link.srcNodeId)][getNodeUniqueByNodeId(link.dstNodeId)] = link;
				
			}catch (JSONException e) {
				Log.error(e.getMessage());
			}
		}
		
		Log.info("Graphic Has been generate!");
		//getMapOfNode(); // getMapsOfnodes
		Log.info(this.toString());
	}
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("xxxxxxxxxxxxx");
		sb.append("    ");
		for(int i = 0 ;i < nodesList.size() ;++i){
			sb.append(nodesList.get(i).getNodeId()+"  ");
			sb.append("    ");
		}
		sb.append("\n");
		for(int i = 0; i < nodesList.size() ;++i){
			sb.append(nodesList.get(i).nodeId);
			sb.append("    ");
			for(int j = 0 ; j < nodesList.size() ;++j){
				
				if(graphic[i][j] != null)
					sb.append(graphic[i][j].linkID);
				else
					sb.append("xxxxxxxxxxxxx");
				sb.append("    ");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	public  Link[][] getGraphic(){
		return graphic;
	}
	
	private int getNodeUniqueByNodeId(String nodeId){
		if(nodesList != null){
			for(int i = 0 ; i < nodesList.size() ;++i){
				if(nodesList.get(i).getNodeId().equals(nodeId)){
					return nodesList.get(i).getUniqueID();
				}
			}
		}
		return -1;
	}

	/**
	 * get the node name map to abstract name (openflow:1->BJ)
	 */

	public void getMapOfNode(){
		//RestAPIManager.loadProperties();
		String s[] = RestAPIManager.get("nodesMap");
		//Log.error(nodeJson);
		// for  loop 3 times
		String ovsdbIps[] = RestAPIManager.get("ovsdbIp");
		String ovsdbPort[] = RestAPIManager.get("ovsdbPort");
		// loop
		for(String ovsdbIp:ovsdbIps){
			
		List<String> nodeNameList = new ArrayList<String>();
		
		try {
			String nodeJson = RequestManager.request(s[0].replace("{ovsdb-ip}", ovsdbIp).replace("{ovsdb-port}", ovsdbPort[0]), s[1], null);
			JSONObject jobj = new JSONObject(nodeJson);
			JSONArray nodes = jobj.getJSONArray("node");
			JSONObject jOvsDBNode = nodes.getJSONObject(0);
			JSONArray jnodeAry = jOvsDBNode.getJSONArray("ovsdb:managed-node-entry");
			for(int i = 0 ; i < jnodeAry.length() ; ++i){
				JSONObject jnodeEntry= jnodeAry.getJSONObject(i);
				String brigeReg = jnodeEntry.getString("bridge-ref");
				int start = brigeReg.lastIndexOf('/') +1 ;
				int end = brigeReg.lastIndexOf('\'');
				//Log.info(brigeReg.substring(start,end));
				nodeNameList.add(brigeReg.substring(start,end));
			}
			
			// get NodeInfo
			for(String name : nodeNameList){
				nodeJson = RequestManager.request(s[0].replace("{ovsdb-ip}", ovsdbIp).replace("{ovsdb-port}", ovsdbPort[0])+"%2Fbridge%2F"+name,s[1] , null);
				//Log.info(nodeJson);
				JSONObject jNode = new JSONObject(nodeJson);
				JSONArray jNodeAry = jNode.getJSONArray("node");
				JSONObject jNodeObj = jNodeAry.getJSONObject(0);
				JSONArray jbrigeConfig = jNodeObj.getJSONArray("ovsdb:bridge-other-configs");
				for(int i =0; i < jbrigeConfig.length() ;++i){
					JSONObject bgCongigEle = jbrigeConfig.getJSONObject(i);
					if(bgCongigEle.getString("bridge-other-config-key").equals("datapath-id")){
						String bgConfigValue = bgCongigEle.getString("bridge-other-config-value");
						//Log.info(bgConfigValue + "\n" + Integer.parseInt(bgConfigValue, 16));
						int dpId = Integer.parseInt(bgConfigValue, 16);
						//make-maps
						for(Node node: nodesList){
							if(node.getDataPathId() == dpId){
								nodeMaps.put(node.nodeId, name);
								//map node-ovsdbIp
								ovsdbIpMaps.put(node.nodeId, ovsdbIp);

								JSONArray jtpAry = jNodeObj.getJSONArray("termination-point");
								for(int tpCnt = 0 ; tpCnt < jtpAry.length() ;++tpCnt){
									try{
										JSONObject tpObj = jtpAry.getJSONObject(tpCnt);
										int tpId = tpObj.getInt("ovsdb:ofport");
											for(Point point : node.pointsList){
												if(point.getDatapathId() == tpId){
													portMaps.put(point.tpId, tpObj.getString("tp-id"));
													ovsTpDbNameMaps.put(point.tpId, tpObj.getString("ovsdb:name"));
													break;
												}
											}
									}catch(JSONException e){
										Log.error(e.getMessage());
									}
								}
								break;
							}
						}
						break;
					}
				}//jbridge config
				
			}
		} catch (JSONException e) {
			Log.error(e.getMessage());
		}
	}
		Log.info("Node name mapSuccess");
//		Log.info(nodeMaps.toString());
//		Log.info(portMaps.toString());
//		Log.info(ovsTpDbNameMaps.toString());
//		int total = 0;
//		for(Node node: nodesList){
//			total += node.pointsList.size();
//		}
//		Log.info("Port total: " + (total -8) + "\n" + portMaps.size());
	}
	
}
