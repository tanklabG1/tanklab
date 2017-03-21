package com.tank.entity.dbutil;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class DBEntity {
	public static int UNIQUE_ID = 0;
	public List<String>ovsdbIps = new ArrayList<String>();
	public String id = null;
	public String QosId = null;
	public List<String> getOvsdbIps() {
		return ovsdbIps;
	}
	public void setOvsdbIps(List<String> ovsdbIps) {
		this.ovsdbIps = ovsdbIps;
	}

	public String QueueId = null;
	public List<DBNode> nodes = new ArrayList<DBNode>();
	
	public DBEntity(){
		id = DBEntity.getUniqueID()+"";
	}
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getQosId() {
		return QosId;
	}


	public void setQosId(String qosId) {
		QosId = qosId;
	}


	public String getQueueId() {
		return QueueId;
	}


	public void setQueueId(String queueId) {
		QueueId = queueId;
	}


	public List<DBNode> getNodes() {
		return nodes;
	}


	public void setNodes(List<DBNode> nodes) {
		this.nodes = nodes;
	}


	public static int getUniqueID(){
		return UNIQUE_ID++;
	}
	
	public int getIndexByIP(String ip){
		for(int i = 0 ; i < ovsdbIps.size() ;++i ){
			if(ovsdbIps.get(i).equals(ip))
				return i;
		}
		return -1;
	}
	@Override
	public String toString(){
		String json = new Gson().toJson(this);
		return json;
	}
	
	/**
	 * 
	 * @param json
	 * @return
	 * @describe get object from json string
	 */
	public static DBEntity buildFromJson(String json){
		
		return null;
	}
}
