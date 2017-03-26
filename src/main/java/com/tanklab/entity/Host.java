package main.java.com.tanklab.entity;

public class Host extends Node{
   
    private Integer id;

   
    private String type = "host";

   
    private String hostId;

   
    private String state;

   
    private String topologyId;

   
    private String hostTrackerServiceId;

   
    private String hostTrackerServiceAddresses;

   
    private String hostTrackerServiceAttachmentPoints;

   
    private String terminationPoint;
    

 
	public Host(String hostId, String topologyId, String hostTrackerServiceId, String hostTrackerServiceAddresses, String hostTrackerServiceAttachmentPoints, String terminationPoint ){
    	this.hostId = hostId;
    	this.topologyId = topologyId;
    	this.hostTrackerServiceId = hostTrackerServiceId;
    	this.hostTrackerServiceAddresses = hostTrackerServiceAddresses;
    	this.hostTrackerServiceAttachmentPoints = hostTrackerServiceAttachmentPoints;
    	this.terminationPoint = terminationPoint;
    }
    public Integer getId() {
        return id;
    }

   
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
 	public String getType() { 		
 		return type;
 	}
   
    public void setType(String type) {
        this.type = type;
    }

   
    public String getHostId() {
        return hostId;
    }

   
    public void setHostId(String hostId) {
        this.hostId = hostId;
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

   
    public String getHostTrackerServiceId() {
        return hostTrackerServiceId;
    }

   
    public void setHostTrackerServiceId(String hostTrackerServiceId) {
        this.hostTrackerServiceId = hostTrackerServiceId;
    }

   
    public String getHostTrackerServiceAddresses() {
        return hostTrackerServiceAddresses;
    }

   
    public void setHostTrackerServiceAddresses(String hostTrackerServiceAddresses) {
        this.hostTrackerServiceAddresses = hostTrackerServiceAddresses;
    }

   
    public String getHostTrackerServiceAttachmentPoints() {
        return hostTrackerServiceAttachmentPoints;
    }

   
    public void setHostTrackerServiceAttachmentPoints(String hostTrackerServiceAttachmentPoints) {
        this.hostTrackerServiceAttachmentPoints = hostTrackerServiceAttachmentPoints;
    }

   
    public String getTerminationPoint() {
        return terminationPoint;
    }

   
    public void setTerminationPoint(String terminationPoint) {
        this.terminationPoint = terminationPoint;
    }
}