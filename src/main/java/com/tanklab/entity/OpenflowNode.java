package main.java.com.tanklab.entity;

import java.util.ArrayList;
import java.util.List;

public class OpenflowNode extends Node {
   
    private Integer id;

   
    private String nodeId;

   
    private String topologyId;

   
    private String terminationPointNames;

   
    private String opendaylightTopologyInventoryInventoryNodeRef;

   
    private String type = "switch";   
    
    private List<Point> pointsList = new ArrayList<Point>();
    
    public void addPoint(Point point){
        this.pointsList.add(point);
    }
    
    @Override
    public List<Point> getPointList() {
        // TODO Auto-generated method stub
        return this.pointsList;
    }

    public  OpenflowNode(String nodeId, String topologyId, String terminationPointNames, String opendaylightTopologyInventoryInventoryNodeRef ){
        this.nodeId = nodeId;
        this.topologyId = topologyId;
        this.terminationPointNames = terminationPointNames;
        this.opendaylightTopologyInventoryInventoryNodeRef = opendaylightTopologyInventoryInventoryNodeRef;
    }

	public Integer getId() {
        return id;
    }

   
    public void setId(Integer id) {
        this.id = id;
    }

   
    public String getNodeId() {
        return nodeId;
    }

   
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

   
    public String getTopologyId() {
        return topologyId;
    }

   
    public void setTopologyId(String topologyId) {
        this.topologyId = topologyId;
    }

   
    public String getTerminationPointNames() {
        return terminationPointNames;
    }

   
    public void setTerminationPointNames(String terminationPointNames) {
        this.terminationPointNames = terminationPointNames;
    }

   
    public String getOpendaylightTopologyInventoryInventoryNodeRef() {
        return opendaylightTopologyInventoryInventoryNodeRef;
    }

   
    public void setOpendaylightTopologyInventoryInventoryNodeRef(String opendaylightTopologyInventoryInventoryNodeRef) {
        this.opendaylightTopologyInventoryInventoryNodeRef = opendaylightTopologyInventoryInventoryNodeRef;
    }

   
    @Override
	public String getType() {
		return type;
	}

   
    public void setType(String type) {
        this.type = type;
    }
}