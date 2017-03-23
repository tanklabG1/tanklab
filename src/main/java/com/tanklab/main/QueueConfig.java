package main.java.com.tanklab.main;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.tank.entity.Link;
import com.tank.entity.Qos;
import com.tank.entity.Queue;
import com.tank.entity.Topology;
import com.tank.entity.dbutil.DBEntity;
import com.tank.entity.dbutil.DBNode;
import com.tank.entity.dbutil.DBPort;

/**
 * 
 * @author CaiHe
 * @describe this module is to implement to config the queue of switch's port after get the route strategy is got
 * @since 2017-2-23 
 */
public class QueueConfig {
	public Qos qos = new Qos();
	public static String QosId = "QOS-1";
	public static boolean isConnectedToOVSDB = false;
	public DBEntity dbEn = null;

	public static void connectOVSDB(){
		if(isConnectedToOVSDB)return;
		String ovsdbIps [] = RestAPIManager.get("ovsdbIp");
		String ovsdbPort[] = RestAPIManager.get("ovsdbPort");
		String [] s = RestAPIManager.get("connectOVSDB"); // get url
		//loop 3 times
		for(String ovsdbIp: ovsdbIps){
			
			String jsonConOVSDB = "{\"network-topology:node\":[{\"node-id\": \"ovsdb://"+ovsdbIp+":"+ovsdbPort[0]+"\",\"connection-info\": {\"ovsdb:remote-port\": "+ovsdbPort[0]+",\"ovsdb:remote-ip\": \""+ovsdbIp+"\"}}]}";
			System.out.println(jsonConOVSDB);
			RequestManager.request(s[0], s[1], jsonConOVSDB);
		}
		
		isConnectedToOVSDB = true;
	}
	
	/**
	 * test main
	 * @param args
	 */
	public static  void main(String [] args){
		connectOVSDB();
		
	}
	
	public void addQueueToOVS(Queue q){
		
		String ovsdbPort[] = RestAPIManager.get("ovsdbPort");

		Log.info(q.toJson());
		
		Log.info("add queue to ovsdb....");
		
		//loop for three times
	for(String ovsdbIp:dbEn.ovsdbIps){
		String s[] = RestAPIManager.get("addToQueue");
		RequestManager.request(s[0].replace("{ovsdb-ip}", ovsdbIp).replace("{ovsdb-port}", ovsdbPort[0]).replace("{queue-id}",q.queueId ), s[1], q.toJson()); //  add queue to OVSDB
		Log.info("Queue success!");
		
		Log.info("get queue uuid ....");
		s = RestAPIManager.get("getQueueUuid"); //get uuid
		String jsonQueueUUID = RequestManager.request(s[0].replace("{ovsdb-ip}", ovsdbIp).replace("{ovsdb-port}", ovsdbPort[0]).replace("{queue-id}",q.queueId ), s[1], q.toJson()); //  add queue to OVSDB
		JSONObject obj;
		try {
			obj = new JSONObject(jsonQueueUUID);

			JSONArray qAry = obj.getJSONArray("ovsdb:queues");
			for(int i = 0 ;i < qAry.length() ;++i){
				JSONObject qobj = qAry.getJSONObject(i);
				if(qobj.getString("queue-id").equals(q.queueId)){
					q.uuid.add(qobj.getString("queue-uuid"));
					break;
				}
			}
		} catch (JSONException e) {
			Log.error(e.getMessage());
		} // get uuid
		
		if(q.uuid != null){
			// config queue to Qos 
			Log.info("config queue to qos ...");
			qos.setQosId(QosId);
			dbEn.QosId = qos.qosId;
			qos.setQueue(q);
			s = RestAPIManager.get("addQueueToQos");
			RequestManager.request(s[0].replace("{ovsdb-ip}", ovsdbIp).replace("{ovsdb-port}", ovsdbPort[0]).replace("{qos-id}",qos.qosId ), s[1], qos.toJson(q.uuid.get(q.uuid.size()-1))); //  add queue to OVSDB
			
			// get QOS uuid
			s = RestAPIManager.get("getQosUUID");
			String qosData = RequestManager.request(s[0].replace("{ovsdb-ip}", ovsdbIp).replace("{ovsdb-port}", ovsdbPort[0]).replace("{qos-id}",qos.qosId ), s[1], qos.toJson(q.uuid.get(q.uuid.size()-1))); //  add queue to OVSDB
			Log.info("Qos load success !"+ qosData);
			try {
				JSONObject qosObj = new JSONObject(qosData);
				JSONArray qosAry = qosObj.getJSONArray("ovsdb:qos-entries");
				for(int i = 0 ;i < qosAry.length(); ++i){
					JSONObject jQos = qosAry.getJSONObject(i);
					if(jQos.getString("qos-id").equals(qos.qosId)){
						qos.QosUUID.add(jQos.getString("qos-uuid"));
						break;
					}
				}
			} catch (JSONException e) {
				Log.error(e.getMessage());
			}
		}
	}
		
}
	
	/**
	 * to config path's port with qos
	 * @param path
	 */
	public void configQosPathPorts(List<Integer> path){
		Log.info("config qos to path ports ...");

		StringBuffer sb = new StringBuffer();
		Topology topo = TopologyManager.topoList.get(0);
		sb.append("{\"network-topology:termination-point\": [");
		// qos add to port
		String [] s = RestAPIManager.get("qosToPort");
		String []ovsdbPort = RestAPIManager.get("ovsdbPort");
		String temps = null;
		String endStr = "/termination-point/";
		for(int i = 0 ;i < path.size() - 1; ++i){

			Link link = topo.graphic[path.get(i)][path.get(i+1)];
			temps = "{\"ovsdb:name\":\""+ topo.ovsTpDbNameMaps.get(link.getSrcTp()) + "\",\"tp-id\":\""+topo.portMaps.get(link.getSrcTp()) +"\",\"qos\":\""+ qos.QosUUID.get(dbEn.getIndexByIP(topo.ovsdbIpMaps.get(link.getSrcNodeId())))+"\"}";
			RequestManager.request(s[0].replace("{ovsdb-ip}", topo.ovsdbIpMaps.get(link.getSrcNodeId())).replace("{ovsdb-port}", ovsdbPort[0])+topo.nodeMaps.get(link.getSrcNodeId())+endStr+topo.portMaps.get(link.getSrcTp()) , s[1], sb.toString()+temps+"]}");

			temps = "{\"ovsdb:name\":\""+ topo.ovsTpDbNameMaps.get(link.getDstTp()) + "\",\"tp-id\":\""+topo.portMaps.get(link.getDstTp()) +"\",\"qos\":\""+qos.QosUUID.get(dbEn.getIndexByIP(topo.ovsdbIpMaps.get(link.getDstNodeId())))+"\"}";
			RequestManager.request(s[0].replace("{ovsdb-ip}", topo.ovsdbIpMaps.get(link.getDstNodeId())).replace("{ovsdb-port}", ovsdbPort[0])+topo.nodeMaps.get(link.getDstNodeId())+endStr+topo.portMaps.get(link.getDstTp()) , s[1], sb.toString()+temps+"]}");

			//add to dbnodeinfo
			if(dbEn.nodes.size() != 0){
				DBPort portSrc = new DBPort();
				portSrc.tpId = link.getSrcTp();
				portSrc.tp_id = topo.portMaps.get(link.getSrcTp());
				portSrc.ovsdbName = topo.ovsTpDbNameMaps.get(link.getSrcTp());
				dbEn.nodes.get(dbEn.nodes.size()-1).ports.add(portSrc);			
			}else{

				DBNode dbnodeSrc = new DBNode();
				dbnodeSrc.nodeId = link.getSrcNodeId();
				dbnodeSrc.nodeName = topo.nodeMaps.get(link.getSrcNodeId());
				dbEn.nodes.add(dbnodeSrc);
				DBPort portSrc = new DBPort();
				portSrc.tpId = link.getSrcTp();
				portSrc.tp_id = topo.portMaps.get(link.getSrcTp());
				portSrc.ovsdbName = topo.ovsTpDbNameMaps.get(link.getSrcTp());
				dbnodeSrc.ports.add(portSrc);			

			}

			DBNode dbnodeDst = new DBNode();
			dbnodeDst.nodeId = link.getSrcNodeId();
			dbnodeDst.nodeName = topo.nodeMaps.get(link.getSrcNodeId());
			DBPort portDst = new DBPort();
			portDst.tpId = link.getSrcTp();
			portDst.tp_id = topo.portMaps.get(link.getSrcTp());
			portDst.ovsdbName = topo.ovsTpDbNameMaps.get(link.getSrcTp());
			
			dbnodeDst.ports.add(portDst);
			dbEn.nodes.add(dbnodeDst);
					
		}

		Log.info("qos-apply to port success !");
		
		//test
		getQosPortInfo(path);
	}
	
	
	/**
	 * get qos info of port
	 */
	public void getQosPortInfo(List<Integer> path){
		Log.info("print qos with port test information...");

		String [] s = RestAPIManager.get("qosToPort");
		String ovsdbPort[] = RestAPIManager.get("ovsdbPort");
		String endStr = "/termination-point/";
		Topology topo = TopologyManager.topoList.get(0);
		String rst = null;
		for(int i = 0 ;i < path.size() - 1; ++i){
			Link link = topo.graphic[path.get(i)][path.get(i+1)];
			rst = RequestManager.request(s[0].replace("{ovsdb-ip}", topo.ovsdbIpMaps.get(link.getSrcNodeId())).replace("{ovsdb-port}", ovsdbPort[0])+topo.nodeMaps.get(link.getSrcNodeId())+endStr+topo.portMaps.get(link.getSrcTp()) ,"GET",null);
			Log.info("port with qos info : " +rst);
			rst = RequestManager.request(s[0].replace("{ovsdb-ip}", topo.ovsdbIpMaps.get(link.getDstNodeId())).replace("{ovsdb-port}", ovsdbPort[0])+topo.nodeMaps.get(link.getDstNodeId())+endStr+topo.portMaps.get(link.getDstTp()) ,"GET", null);
			Log.info("port with qos info : " +rst);
		}
	} 
	

	
	/**
	 * config main
	 */
	public void startConfig(Queue q,List<Integer> path,DBEntity dbEn){
		QueueConfig.connectOVSDB();
		this.dbEn = dbEn;
		addQueueToOVS(q);
		configQosPathPorts(path);
	}
}
