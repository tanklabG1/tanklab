package com.tank.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author CaiHe
 * @describe node infor
 */
public class Node {
	public int uniqueID = 0;
	public String nodeId = null;
	public String odlNodeRef = null;
	public List<Point> pointsList = new ArrayList<Point>(20);
	public int flowEntryCount = 0;
	
	public Node(int uniqueID,String nodeId ,String odlNodeRef){
		this.nodeId = nodeId;
		this.odlNodeRef = odlNodeRef;
		this.uniqueID = uniqueID;
	}

	public int getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}

	public Node(int uniqueID){
		this.uniqueID = uniqueID;
	}
	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getOdlNodeRef() {
		return odlNodeRef;
	}

	public void setOdlNodeRef(String odlNodeRef) {
		this.odlNodeRef = odlNodeRef;
	}
	
	public void addPoint(Point point){
		this.pointsList.add(point);
	}
	
	public void addPoint(String tpId, String odlNodeConRef){
		this.pointsList.add(new Point(tpId,odlNodeConRef));
	}

	public List<Point> getPointsList() {
		return pointsList;
	}

	public void setPointsList(List<Point> pointsList) {
		this.pointsList = pointsList;
	}
	
	public int getDataPathId(){
		
		return Integer.parseInt(this.nodeId.substring(this.nodeId.lastIndexOf(':')+1,this.nodeId.length()));
	}
	
	public int getFlowEntryCount(){
		flowEntryCount++;
		return flowEntryCount;
	}
}
