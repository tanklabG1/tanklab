package main.java.com.tanklab.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import main.java.com.tanklab.entity.FlowEntry;
import main.java.com.tanklab.entity.Link;
import main.java.com.tanklab.entity.Queue;
import main.java.com.tanklab.entity.Topology;
//import main.java.com.tanklab.dbutil.DBEntity;

/**
 * 
 * @author hqwhqwhq
 * @describe this module si to implement to send the flow entry to switchs
 * @since 2017-2-23
 */
public class FlowEntryManager {
	private static FlowEntry flow;
	
	public static void CreateFlow(String tpSrc, String protocol, String vlanId, String vlanPriority
			, String idleTimeout, String ingressPort, String tosBits, String name, String hardTimeout
			, String dlDst, String installInHw, String cookie, String dlSrc, String nwSrc, String nwDst
			, String tpDst,int outPort,int queue){
		flow = new FlowEntry();
		flow.setTpSrc(tpSrc);
		flow.setProtocol(protocol);
		flow.setVlanId(vlanId);
		flow.setVlanPriority(vlanPriority);
		flow.setIdleTimeout("0");
		flow.setIngressPort(ingressPort);
		flow.setTosBits(tosBits);
		flow.setName(name);
		flow.setHardTimeout("0");
		flow.setDlDst(dlDst);
		flow.setInstallInHw(installInHw);
		flow.setCookie(cookie);
		flow.setDlSrc(dlSrc);
		flow.setNwSrc(nwSrc);
		flow.setNwDst(nwDst);
		flow.setTpDst(tpDst);
		flow.setPriority("120");
		List<String> actions = new ArrayList<String>();
		actions.add("set-queue:"+queue);
		//actions.add("output:"+outPort);
		flow.setActions(actions);

	}

	public static void dispatchFlow(List<Integer> nodes,Queue queue,DBEntity dbEn){
		Log.info("dispatch to nodes ...");
		int flowEntryCount = 0;
		Map<String,String>nodesName = TopologyManager.topoList.get(0).nodeMaps;
		//forward direction
		for(int i = 0 ; i < nodes.size() -1  ; ++i) {
			int ii = nodes.get(i);
			int jj = nodes.get(i+1);
			Link link = TopologyManager.topoList.get(0).graphic[ii][jj];
			flowEntryCount = TopologyManager.topoList.get(0).nodesList.get(nodes.get(i)).getFlowEntryCount(); 
			flow.getActions().clear();
			flow.getActions().add("{\"set-queue-action\":{\"queue-id\":\""+queue.queueNumber+"\"},\"order\":\""+flow.getActions().size()+"\"}");
			flow.getActions().add("{\"output-action\":{\"output-node-connector\":\""+link.getSrcTp().substring(link.getSrcTp().lastIndexOf(":")+1)+"\",\"max-length\":\"65535\"},\"order\":\""+flow.getActions().size()+"\"}");
			flow.setFlowId(flowEntryCount+"");
			
			dbEn.nodes.get(i).flowsId.add(flowEntryCount+""); //record to db
			
			String[] s = RestAPIManager.get("addflow");
			s[0] = s[0].replace("{node-id}", TopologyManager.topoList.get(0).nodesList.get(nodes.get(i)).nodeId);
			s[0] = s[0].replace("{table-id}", "0");
			s[0] = s[0].replace("{flow-id}",flowEntryCount+"");

			Log.info("dispatch to node: " +nodesName.get(TopologyManager.topoList.get(0).nodesList.get(nodes.get(i)).nodeId)+"\tactions:"+flow.getActions().toString() + " flow id = " +flowEntryCount);
			
			RequestManager.request(s[0], s[1], flow.toJson()); 
		}
		
		String src = flow.getNwDst();
		String dst = flow.getNwSrc();
		flow.setNwSrc(src);
		flow.setNwDst(dst);
		//back direction
		for(int i = nodes.size()-1 ; i > 0  ; --i) {
			int ii = nodes.get(i);
			int jj = nodes.get(i-1);
			Link link = TopologyManager.topoList.get(0).graphic[ii][jj];
			flowEntryCount = TopologyManager.topoList.get(0).nodesList.get(nodes.get(i)).getFlowEntryCount(); 
			flow.getActions().clear();
			flow.getActions().add("{\"set-queue-action\":{\"queue-id\":\""+queue.queueNumber+"\"},\"order\":\""+flow.getActions().size()+"\"}");
			flow.getActions().add("{\"output-action\":{\"output-node-connector\":\""+link.getSrcTp().substring(link.getSrcTp().lastIndexOf(":")+1)+"\",\"max-length\":\"65535\"},\"order\":\""+flow.getActions().size()+"\"}");
			flow.setFlowId(flowEntryCount+"");

			dbEn.nodes.get(i).flowsId.add(flowEntryCount+""); //record to db
			
			String[] s = RestAPIManager.get("addflow");
			s[0] = s[0].replace("{node-id}", TopologyManager.topoList.get(0).nodesList.get(nodes.get(i)).nodeId);
			s[0] = s[0].replace("{table-id}", "0");
			s[0] = s[0].replace("{flow-id}",flowEntryCount+"");

			Log.info("dispatch to node: " +nodesName.get(TopologyManager.topoList.get(0).nodesList.get(nodes.get(i)).nodeId)+"\tactions:"+flow.getActions().toString() + " flow id = " +flowEntryCount);
			RequestManager.request(s[0], s[1], flow.toJson()); 
		} 
		Log.info("dispatch to nodes success !");
	}
	

}
