package main.java.com.tanklab.main;

import java.util.List;
import java.util.Map;

import main.java.com.tanklab.entity.Node;
import main.java.com.tanklab.entity.Queue;
import main.java.com.tanklab.entity.Topology;
//import main.java.com.tanklab.entity.dbutil.DBEntity;
import main.java.com.tanklab.modules.route.RouteStrategy;

/**
 * 
 * @author CaiHe
 * @describe this is a Main function 
 */
public class Main {
	public static void main(String [] args){
		//QueueConfig.connectOVSDB();
		TopologyManager.getTopoInfo();
		//Log.error(TopologyManager.topoList.get(0).toString());
		
		String start = "HBSJZ"; String end = "ZJHZ";
		int rst[] = getUniqueIdOfNodeByName(start, end);
		Log.info("calculate path : "+start + " to " + end+ "["+rst[0]+" <--> "+rst[1]+"]");
		List<Integer> path = RouteStrategy.GetRoute(TopologyManager.topoList.get(0).getGraphic(), rst[0], rst[1]);
		printPath(path); //print path
	
		DBEntity dbEntity = new DBEntity(); // general a db entit
		setDBEntityOvsdbIps(path,dbEntity);
		//if(true)return;
		Queue queue = new Queue(200000000,20000000);
		dbEntity.setQueueId(queue.queueId);
		QueueConfig qc = new QueueConfig();
		qc.startConfig(queue,path,dbEntity);
		FlowEntryManager.CreateFlow(null, null, null, null, null, null, null, null, null, null, null, null,null, "172.15.1.63", "172.15.1.62", null, 0, 1);
		FlowEntryManager.dispatchFlow(path,queue,dbEntity);
		RestAPIManager.close();

		Log.info(dbEntity.toString());
	}
	


	public static int[] getUniqueIdOfNodeByName(String startName,String endName){
		Map<String,String>nodesMap = TopologyManager.topoList.get(0).nodeMaps;
		List<Node> nodes = TopologyManager.topoList.get(0).getNodeList();
		int rst[] = new int[2];
		for(int cnt = 0;  cnt < nodes.size() ;++cnt){
			if(nodesMap.get(nodes.get(cnt).nodeId).equals(startName)){
				rst[0] = cnt;
			}else if(nodesMap.get(nodes.get(cnt).nodeId).equals(endName)){
				rst[1] = cnt;
			}
		}
		return rst;
	}
	
	/**
	 * 
	 * @param path
	 * @describe to set dbEntity ovsdbIps
	 * 
	 */
	public static void setDBEntityOvsdbIps(List<Integer> path,DBEntity dbEn){
		Topology topo = TopologyManager.topoList.get(0);

		for(int p : path){
			String ip = topo.ovsdbIpMaps.get( topo.nodesList.get(p).nodeId);
			if(!dbEn.ovsdbIps.contains(ip)){
				dbEn.ovsdbIps.add(ip);
			}
		}
	}
	
	/**
	 * print path
	 */
	public static void printPath(List<Integer> path){
		for(int i : path){
			System.out.print(TopologyManager.topoList.get(0).nodesList.get(i).nodeId + " -->");
		}
		Log.info("");
	}
	
	

}
