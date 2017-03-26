package main.java.com.tanklab.entity;

public class OpenflowPoint  extends Point{
   
    private Integer id;

   
    private String tpId;

   
    private String nodeId;

   
    private String topologyId;

   
    private String opendaylightTopologyInventoryInventoryNodeConnectorRef;

    public OpenflowPoint(String tpId, String nodeId, String topologyId, String opendaylightTopologyInventoryInventoryNodeConnectorRef){
    	this.tpId = tpId;
    	this.nodeId = nodeId;
    	this.topologyId = topologyId;
    	this.opendaylightTopologyInventoryInventoryNodeConnectorRef = opendaylightTopologyInventoryInventoryNodeConnectorRef;
    }
    
    public Integer getId() {
        return id;
    }

   
    public void setId(Integer id) {
        this.id = id;
    }

   
    public String getTpId() {
        return tpId;
    }

   
    public void setTpId(String tpId) {
        this.tpId = tpId;
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

   
    public String getOpendaylightTopologyInventoryInventoryNodeConnectorRef() {
        return opendaylightTopologyInventoryInventoryNodeConnectorRef;
    }

   
    public void setOpendaylightTopologyInventoryInventoryNodeConnectorRef(String opendaylightTopologyInventoryInventoryNodeConnectorRef) {
        this.opendaylightTopologyInventoryInventoryNodeConnectorRef = opendaylightTopologyInventoryInventoryNodeConnectorRef;
    }
}