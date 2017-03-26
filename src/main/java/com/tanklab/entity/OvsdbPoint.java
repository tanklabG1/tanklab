package main.java.com.tanklab.entity;

public class OvsdbPoint extends Point  {
   
    private Integer id;
   
    private String tpId;
   
    private String nodeId;
   
    private String topologyId;

    private String opendaylightTopologyInventoryInventoryNodeConnectorRef;

    private String interfaceUuid;
   
    private Integer ingressPolicingBurst;
   
    private String name;
   
    private Integer ifindex;
   
    private String portUuid;
   
    private Integer ofport;
   
    private Integer ingressPolicingRate;
   
    private String interfaceType;
   
    private String state;
    
    public OvsdbPoint(String tpId,String nodeId, String topologyId, String interfaceUuid, Integer ingressPolicingBurst, String name, Integer ifindex, String portUuid, Integer ofport, Integer ingressPolicingRate, String interfaceType){
    		super();
    		this.tpId = tpId;
    		this.nodeId = nodeId;
    		this.topologyId = topologyId;
    		this.interfaceUuid = interfaceUuid;
    		this.ingressPolicingBurst = ingressPolicingBurst;
    		this.name = name;
    		this.ifindex = ifindex;
    		this.portUuid = portUuid;
    		this.ofport = ofport;
    		this.ingressPolicingRate = ingressPolicingRate;
    		this.interfaceType = interfaceType;  		
    	
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

   
    public String getInterfaceUuid() {
        return interfaceUuid;
    }

   
    public void setInterfaceUuid(String interfaceUuid) {
        this.interfaceUuid = interfaceUuid;
    }

   
    public Integer getIngressPolicingBurst() {
        return ingressPolicingBurst;
    }

   
    public void setIngressPolicingBurst(Integer ingressPolicingBurst) {
        this.ingressPolicingBurst = ingressPolicingBurst;
    }

   
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

   
    public Integer getIfindex() {
        return ifindex;
    }

   
    public void setIfindex(Integer ifindex) {
        this.ifindex = ifindex;
    }

   
    public String getPortUuid() {
        return portUuid;
    }

   
    public void setPortUuid(String portUuid) {
        this.portUuid = portUuid;
    }

   
    public Integer getOfport() {
        return ofport;
    }

   
    public void setOfport(Integer ofport) {
        this.ofport = ofport;
    }

   
    public Integer getIngressPolicingRate() {
        return ingressPolicingRate;
    }

   
    public void setIngressPolicingRate(Integer ingressPolicingRate) {
        this.ingressPolicingRate = ingressPolicingRate;
    }

   
    public String getInterfaceType() {
        return interfaceType;
    }

   
    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

   
    public String getState() {
        return state;
    }

   
    public void setState(String state) {
        this.state = state;
    }
}