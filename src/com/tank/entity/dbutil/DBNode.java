package com.tank.entity.dbutil;

import java.util.ArrayList;
import java.util.List;

public class DBNode {
		public String nodeName = null;
		public String nodeId = null;
		public List<String> flowsId = new ArrayList<String>();
		public List<DBPort> ports = new ArrayList<DBPort> ();

		public String getNodeName() {
			return nodeName;
		}
		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}
		public String getNodeId() {
			return nodeId;
		}
		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}
		public List<String> getFlowsId() {
			return flowsId;
		}
		public void setFlowsId(List<String> flowsId) {
			this.flowsId = flowsId;
		}
		public List<DBPort> getPorts() {
			return ports;
		}
		public void setPorts(List<DBPort> ports) {
			this.ports = ports;
		}

}
