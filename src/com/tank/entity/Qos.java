package com.tank.entity;

import java.util.ArrayList;
import java.util.List;

public class Qos {
	public String qosId = null;
	public Queue queue = null;
	public List<String> QosUUID = new ArrayList<String>();
	public String qosBand = "1000000000";


	public String getQosBand() {
		return qosBand;
	}

	public void setQosBand(String qosBand) {
		this.qosBand = qosBand;
	}


	public Qos(String qosId,Queue q){
		this.qosId = qosId;
		this.queue = q;
	}
	
	public Qos(){
		
	}
	
	public String toJson(String queueUuid){
		StringBuffer sb = new StringBuffer();
		sb.append("{\"ovsdb:qos-entries\": [{\"qos-other-config\": [{\"other-config-key\": \"max-rate\",\"other-config-value\": \""+qosBand+"\"}],\"qos-type\":\"ovsdb:qos-type-linux-htb\",\"qos-id\": \""+qosId+"\",");
		sb.append("\"queue-list\": [{\"queue-number\": \""+this.queue.queueNumber+"\",\"queue-uuid\":\""+queueUuid+"\"}]}]}");

		return sb.toString();
	}

	public String getQosId() {
		return qosId;
	}

	public void setQosId(String qosId) {
		this.qosId = qosId;
	}

	public Queue getQueue() {
		return queue;
	}

	public void setQueue(Queue queue) {
		this.queue = queue;
	}
}
