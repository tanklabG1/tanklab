package com.tank.entity.dbutil;

import com.tank.entity.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.tank.main.Log;
import com.tank.main.RequestManager;
import com.tank.main.RestAPIManager;

public class DBTopology {
	public  String topoId = null;
	public  Link[][]  graphic =  null; 
	public  List<Node> nodesList = null;
	public  Map<String/*openflow:1*/,String/*ZJWZ*/> nodeMaps = new HashMap<String,String>();
	public  Map<String/*openflow:1:1*/,String/*of:1*/> portMaps = new HashMap<String,String>();
	public  Map<String/*openflow:1 */,String> ovsdbIpMaps = new HashMap<String,String>();
	public  Map<String,String> ovsTpDbNameMaps = new HashMap<String,String>();

	public void setTopoId() {

	}

	public void setGraphic() {
		
	} 

	public void setNodeList() {
		
	}

	public void setNodeMaps() {
		
	}

	public void setPortMaps() {
		
	}

	public void setOvsdbIpMaps() {
		
	}

	public void setOvsTpDbNameMaps() {
		
	}

	public String getTopoId() {
		return this.topoId;
	}

	public Link[][] getGraphic() {
		return this.graphic;
	} 

	public void getNodeList() {
		
	}

	public void getNodeMaps() {
		
	}

	public void getPortMaps() {
		
	}

	public void getOvsdbIpMaps() {
		
	}

	public void getOvsTpDbNameMaps() {
		
	}

}
