package main.java.com.tanklab.entity;

import java.util.ArrayList;
import java.util.List;



public class OvsdbNode extends Node {
    
    private Integer id;

    
    private String nodeId;

    
    private String bridgeName;

    
    private String type = "switch";

    
    private String state = "";

    
    private String topologyId;

    
    private String failMode;

    
    private String bridgeOpenflowNodeRef;

    
    private String bridgeOtherConfigs;

    
    private String bridgeUuid;

    
    private String datapathId;

    
    private String datapathType;

    
    private String managedBy;

    
    private String controllerEntry;

    
    private String terminationPointNames;

    
    private String fabricCapableDeviceSupportedFabric;

    
    private String fabricCapableDeviceCapabilitySupported;
    
    private List<Point> pointsList = new ArrayList<Point>();
    
    
    public void addPoint(OvsdbPoint ovsdbPoint){
    	this.pointsList.add(ovsdbPoint);
    }
     
    @Override
	public List<Point> getPointList() {
		// TODO Auto-generated method stub
    	return this.pointsList;
	}

	public OvsdbNode(String nodeId, String bridgeName, String topologyId, String failMode, String bridgeOpenflowNodeRef, String bridgeOtherConfigs, String bridgeUuid,String datapathId,String datapathType, String managedBy, String controllerEntry, String terminationPointNames, String fabricCapableDeviceSupportedFabric, String fabricCapableDeviceCapabilitySupported  ){
    	this.nodeId = nodeId;
    	this.bridgeName = bridgeName;    	
    	this.topologyId = topologyId;
    	this.failMode = failMode;
    	this.bridgeOpenflowNodeRef = bridgeOpenflowNodeRef;
    	this.bridgeOtherConfigs = bridgeOtherConfigs;
    	this.bridgeUuid = bridgeUuid;
    	this.datapathId = datapathId;
    	this.datapathType = datapathType;
    	this.managedBy = managedBy;
    	this.controllerEntry = controllerEntry;
    	this.terminationPointNames = terminationPointNames;
    	this.fabricCapableDeviceSupportedFabric = fabricCapableDeviceSupportedFabric;
    	this.fabricCapableDeviceCapabilitySupported = fabricCapableDeviceCapabilitySupported;   	
    	
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

    
    public String getBridgeName() {
        return bridgeName;
    }

    
    public void setBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
    }

    
    public String getType() {
        return type;
    }

    
    public void setType(String type) {
        this.type = type;
    }

    
    public String getState() {
        return state;
    }

    
    public void setState(String state) {
        this.state = state;
    }

    
    public String getTopologyId() {
        return topologyId;
    }

    
    public void setTopologyId(String topologyId) {
        this.topologyId = topologyId;
    }

    
    public String getFailMode() {
        return failMode;
    }

    
    public void setFailMode(String failMode) {
        this.failMode = failMode;
    }

    
    public String getBridgeOpenflowNodeRef() {
        return bridgeOpenflowNodeRef;
    }

    
    public void setBridgeOpenflowNodeRef(String bridgeOpenflowNodeRef) {
        this.bridgeOpenflowNodeRef = bridgeOpenflowNodeRef;
    }

    
    public String getBridgeOtherConfigs() {
        return bridgeOtherConfigs;
    }

    
    public void setBridgeOtherConfigs(String bridgeOtherConfigs) {
        this.bridgeOtherConfigs = bridgeOtherConfigs;
    }

    
    public String getBridgeUuid() {
        return bridgeUuid;
    }

    
    public void setBridgeUuid(String bridgeUuid) {
        this.bridgeUuid = bridgeUuid;
    }

    
    public String getDatapathId() {
        return datapathId;
    }

    
    public void setDatapathId(String datapathId) {
        this.datapathId = datapathId;
    }

    
    public String getDatapathType() {
        return datapathType;
    }

    
    public void setDatapathType(String datapathType) {
        this.datapathType = datapathType;
    }

    
    public String getManagedBy() {
        return managedBy;
    }

    
    public void setManagedBy(String managedBy) {
        this.managedBy = managedBy;
    }

    
    public String getControllerEntry() {
        return controllerEntry;
    }

    
    public void setControllerEntry(String controllerEntry) {
        this.controllerEntry = controllerEntry;
    }

    
    public String getTerminationPointNames() {
        return terminationPointNames;
    }

    
    public void setTerminationPointNames(String terminationPointNames) {
        this.terminationPointNames = terminationPointNames;
    }

    
    public String getFabricCapableDeviceSupportedFabric() {
        return fabricCapableDeviceSupportedFabric;
    }

    
    public void setFabricCapableDeviceSupportedFabric(String fabricCapableDeviceSupportedFabric) {
        this.fabricCapableDeviceSupportedFabric = fabricCapableDeviceSupportedFabric;
    }

    
    public String getFabricCapableDeviceCapabilitySupported() {
        return fabricCapableDeviceCapabilitySupported;
    }

    
    public void setFabricCapableDeviceCapabilitySupported(String fabricCapableDeviceCapabilitySupported) {
        this.fabricCapableDeviceCapabilitySupported = fabricCapableDeviceCapabilitySupported;
    }
}