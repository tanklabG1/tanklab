package main.java.com.tanklab.utils;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.gson.Gson;
import main.java.com.tanklab.entity.Host;
import main.java.com.tanklab.entity.Link;
import main.java.com.tanklab.entity.Node;
import main.java.com.tanklab.entity.OpenflowNode;
import main.java.com.tanklab.entity.OpenflowPoint;
import main.java.com.tanklab.entity.OvsdbNode;
import main.java.com.tanklab.entity.OvsdbPoint;
import main.java.com.tanklab.entity.Point;
import main.java.com.tanklab.entity.Topology;

public class TopologyManager {
	private static Logger logger = Logger.getLogger(TopologyManager.class);
	public static  List<Topology> TopoList = new ArrayList<Topology>();	
	public static List<Topology> getTopoList() {
		return TopoList;
	}

	public static void setTopoList(List<Topology> topoList) {
		TopoList = topoList;
	}
	public static void getTopoChange(){
		List<Topology> updatedTopoInfo = getTopoInfo();
		/*
		 * by comparing TopoList and updatedTopoInfo to get the topo change
		 */
		
	}
	public static void updateTopo(){
		TopoList = null;
		setTopoList(getTopoInfo());
	}
	//public 
	public static List<Topology> getTopoInfo(){
		List<Topology> topologyList = new ArrayList<Topology>();
		String[] s = RestAPIManager.get("topology");
		String json = RequestManager.request(s[0], s[1], null);
		
		System.out.println(json);
		
		try {
			JSONObject jobj = new JSONObject(json);
			JSONArray topoAry = jobj.getJSONObject("network-topology").getJSONArray("topology");
			
			for(int i = 0; i< topoAry.length() ;++i){//for_1 start
				JSONObject topoObj = topoAry.getJSONObject(i);
				try{					
					String topology_id = topoObj.getString("topology-id");		
	
					if(topology_id.equals("ovsdb:1")){//physical topology
						Topology phyTopology = new Topology();
						phyTopology.setTopologyId("ovsdb:1");			
						
						JSONArray jNodeAry = topoObj.getJSONArray("node");						
						 for(int j = 0;  j < jNodeAry.length() ;++j){//for_2 start							 
							JSONObject nodeObj = jNodeAry.getJSONObject(j);				
							if(nodeObj.isNull("ovsdb:db-version")){//not ovsdb node
								String bridgeOtherConfigs = "";
								if(!nodeObj.isNull("bridge-other-configs")){
									bridgeOtherConfigs = nodeObj.getJSONArray("bridge-other-configs").toString();
								}
								String controllerEntry = "";
								if(!nodeObj.isNull("ovsdb:controller-entry")){
									controllerEntry = nodeObj.getJSONArray("ovsdb:controller-entry").toString();
								}
								String fabricCapableDeviceSupportedFabric = "";
								if(!nodeObj.isNull("fabric-capable-device:supported-fabric")){
									fabricCapableDeviceSupportedFabric = nodeObj.getJSONArray("fabric-capable-device:supported-fabric").toString();
								}
								String fabricCapableDeviceCapabilitySupported = "";
								if(!nodeObj.isNull("fabric-capable-device:capability-supported")){
									fabricCapableDeviceCapabilitySupported = nodeObj.getJSONArray("fabric-capable-device:capability-supported").toString();
								}
								String bridge_openflow_node_ref = "";
								if(!nodeObj.isNull("ovsdb:bridge-openflow-node-ref")){
									bridge_openflow_node_ref = nodeObj.getString("ovsdb:bridge-openflow-node-ref").toString();
								}
								System.out.println(nodeObj.getString("node-id"));

								
								JSONArray tpAry = nodeObj.getJSONArray("termination-point");//add phy_terminationPointNames to phy_node
								String terminationPointNames = "";							
								for(int k =0 ; k < tpAry.length(); k++){
									JSONObject tp = tpAry.getJSONObject(k);
									if(k != tpAry.length() -1 ){
										terminationPointNames = terminationPointNames + tp.getString("tp-id")+",";
										}
									else{
										terminationPointNames = terminationPointNames + tp.getString("tp-id");								
									}	
								}
								OvsdbNode phyNode = new OvsdbNode(nodeObj.getString("node-id"),nodeObj.getString("ovsdb:bridge-name"),"ovsdb:1",nodeObj.getString("ovsdb:fail-mode"),bridge_openflow_node_ref,bridgeOtherConfigs,nodeObj.getString("ovsdb:bridge-uuid"),nodeObj.getString("ovsdb:datapath-id"),nodeObj.getString("ovsdb:datapath-type"), nodeObj.getString("ovsdb:managed-by"),controllerEntry,terminationPointNames,fabricCapableDeviceSupportedFabric,fabricCapableDeviceCapabilitySupported );
								for(int m =0 ; m < tpAry.length(); m++){	//add phy_OvsdbPoint to phy_node start		
									JSONObject oneTp = tpAry.getJSONObject(m);
									String interfaceType = "";
									if(!oneTp.isNull("ovsdb:interface-type")){
										interfaceType = oneTp.getString("ovsdb:interface-type");
										}											
									OvsdbPoint ovsdbPoint =  new OvsdbPoint(oneTp.getString("tp-id"),nodeObj.getString("node-id"), "ovsdb:1", oneTp.getString("ovsdb:interface-uuid"), Integer.parseInt(oneTp.getString("ovsdb:ingress-policing-burst")), oneTp.getString("ovsdb:name"), Integer.parseInt(oneTp.getString("ovsdb:ifindex")), oneTp.getString("ovsdb:port-uuid"), Integer.parseInt(oneTp.getString("ovsdb:ofport")), Integer.parseInt(oneTp.getString("ovsdb:ingress-policing-rate")),interfaceType);
									phyNode.addPoint(ovsdbPoint);
								}//	//add phy_OvsdbPoint to phy_node end								
								phyTopology.addNode(phyNode);//add phy_node to phy_topology								
							}/*not ovsdb node end*/else{//ovsdb node
//								从ovsdbnode中解析出qos、queue
							}
						 }//for_2 end
						 topologyList.add(phyTopology);
					}else //physical topology end
						if(topology_id.equals("flow:1")){//openflow logical topology
							Topology ofTopology = new Topology();
							ofTopology.setTopologyId("flow:1");								
							JSONArray jNodeAry = topoObj.getJSONArray("node");						
							for(int j = 0;  j < jNodeAry.length() ;++j){//deal node objects	start						 
								JSONObject nodeObj = jNodeAry.getJSONObject(j);								
								if(nodeObj.get("node-id").toString().contains("openflow:")){
									JSONArray tpAry = nodeObj.getJSONArray("termination-point");//add of_terminationPointNames to of_node
									String terminationPointNames = "";							
									for(int k =0 ; k < tpAry.length(); k++){
										JSONObject tp = tpAry.getJSONObject(k);
										if(k != tpAry.length() -1 ){
											terminationPointNames = terminationPointNames + tp.getString("tp-id")+",";
											}
										else{
											terminationPointNames = terminationPointNames + tp.getString("tp-id");								
										}								
									}								
									OpenflowNode ofNode = new OpenflowNode(nodeObj.getString("node-id"), "flow:1", terminationPointNames, nodeObj.getString("opendaylight-topology-inventory:inventory-node-ref"));								
															
									for(int m =0 ; m < tpAry.length(); m++){	//add openflowPoint to of_node		
										JSONObject oneTp = tpAry.getJSONObject(m);	
										OpenflowPoint ofPoint =  new OpenflowPoint(oneTp.getString("tp-id"),nodeObj.getString("node-id"), "flow:1", oneTp.getString("opendaylight-topology-inventory:inventory-node-connector-ref"));
										ofNode.addPoint(ofPoint);
									}									
									ofTopology.addNode(ofNode);//add of_switch_node to of_topology									
								}else 
									if(nodeObj.get("node-id").toString().contains("host:")){
										Host host = new Host(nodeObj.getString("node-id"), "flow:1", nodeObj.getString("host-tracker-service:id"), nodeObj.getJSONArray("host-tracker-service:addresses").toString(), nodeObj.getJSONArray("host-tracker-service:attachment-points").toString(), nodeObj.getJSONArray("termination-point").toString());
										ofTopology.addNode(host);//add host to of_topology
									}
							}//deal node objects end
							JSONArray jLinkAry = topoObj.getJSONArray("link");	
							for(int m = 0;  m < jNodeAry.length(); ++m){//deal link objects start
								String source_port = null;
								String des_port = null;
								JSONObject linkObj = jLinkAry.getJSONObject(m);
								JSONObject source = linkObj.getJSONObject("source");
								JSONObject destination = linkObj.getJSONObject("destination");								
								String []spArray = source.getString("source-tp").split(":");
								source_port = spArray[spArray.length-1];
								String []dpArray = source.getString("source-tp").split(":");
								des_port = dpArray[dpArray.length-1];								
								Link link = new Link(linkObj.getString("link-id"),"flow:1",source.getString("source-node"),destination.getString("dest-node"),source_port,des_port);
								ofTopology.addLink(link);
							}
							topologyList.add(ofTopology);
					}else{						
						logger.info("no topology information is got!");
					}
					
				}catch(JSONException e){					
					logger.info(e.getMessage());
				}
				
			}//for_1 end
		} catch (JSONException e) {
			logger.info(e.getMessage());
		}		
		logger.info("Topology load Success!");
		return topologyList;
	}		

	public static void writeTopoinfoIntoDB(List<Topology> topoList){
		for(int i=0; i<topoList.size(); i++){
			if(DBManager.writeTpinfoToDb(topoList.get(i)) == true){
				 logger.info("write topology information into database successfully!");
			}
			else{
				 logger.info("write topology information into database failed!");
			}		
		}
		
	}
	
	public static void main(String []args){
		updateTopo();
		writeTopoinfoIntoDB(TopoList);		
	}	
}
