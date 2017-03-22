package main.java.com.tanklab.utils;

import com.tank.entity.Topology;
import com.tank.entity.dbutil.DBEntity;
import com.tank.entity.dbutil.DBNode;
import com.tank.entity.dbutil.DBPort;

public class ClearManager {
	
	/**
	 * 
	 * @param dbEn
	 * @describe del flows on path
	 */
	public static void delFlows(DBEntity dbEn){
		String [] s = RestAPIManager.get("delFlows");
		for(DBNode node : dbEn.nodes){
			http://192.168.1.108:8181/restconf/config/opendaylight-inventory:nodes/node/{node-id}/flow-node-inventory:table/0/flow/{flow-id},\
			for(String flowId : node.flowsId){
				RequestManager.request(s[0].replace("{node-id}",node.nodeId ).replace("{flow-id}",flowId), s[1], null);
			}
		}
		
	}
	
	/**
	 * 
	 * @param dbEn
	 * @describe del qos from point
	 */
	public static void delQosFromPoint(DBEntity dbEn){
		String s[] = RestAPIManager.get("delQosFromPoint");
		String data = "{\"network-topology:termination-point\": [{\"ovsdb:name\": \"{ovsdbName}\",\"tp-id\": \"{tp-id}\"}]}";
		String ovsdbPort[] = RestAPIManager.get("ovsdbPort");
		Topology topo = TopologyManager.topoList.get(0);
		for(DBNode node : dbEn.nodes){
			for(DBPort point: node.ports){
				RequestManager.request(s[0].replace("{ovsdb-ip}", topo.ovsdbIpMaps.get(node.nodeId)).replace("{ovsdb-port}", ovsdbPort[0]).replace("{node-name}",node.nodeName).replace("{tp-id}", point.tp_id), s[1], data.replace("{ovsdbName}", point.ovsdbName).replace("{tp-id}", point.tp_id));
			}
		}
	}
	
	/**
	 * 
	 * @param dbEn
	 * @describe del queue
	 */
	public static void delQueue(DBEntity dbEn){
		String [] s = RestAPIManager.get("delQueue");
		String ovsdbPort[] = RestAPIManager.get("ovsdbPort");
		for(String ovsdbIp : dbEn.ovsdbIps){
			RequestManager.request(s[0].replace("{ovsdb-ip}", ovsdbIp).replace("{ovsdb-port}", ovsdbPort[0]).replace("{queue-id}", dbEn.QueueId), s[1], null);
		}
	}
}
