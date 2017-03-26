package main.java.com.tanklab.entity;

public class Link {
    
    private Integer id;

    
    private String linkId;

    
    private String srcSwId;

    
    private String dstSwId;

    
    private String srcPortId;

    
    private String dstPortId;

    
    private String topologyId;

    
    private Integer bandwith;

    
    private Integer latency;

    
    private Integer loss;

    
    private String state;

    public Link(String linkId, String topologyId, String srcSwId, String dstSwId, String srcPortId, String dstPortId ){
    	this.linkId = linkId;
    	this.topologyId = topologyId;
    	this.srcSwId = srcSwId;
    	this.dstSwId = dstSwId;
    	this.srcPortId = srcPortId;
    	this.dstPortId = dstPortId;
    	
    }
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getLinkId() {
        return linkId;
    }

    
    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    
    public String getSrcSwId() {
        return srcSwId;
    }

    
    public void setSrcSwId(String srcSwId) {
        this.srcSwId = srcSwId;
    }

    
    public String getDstSwId() {
        return dstSwId;
    }

    
    public void setDstSwId(String dstSwId) {
        this.dstSwId = dstSwId;
    }

    
    public String getSrcPortId() {
        return srcPortId;
    }

    
    public void setSrcPortId(String srcPortId) {
        this.srcPortId = srcPortId;
    }

    
    public String getDstPortId() {
        return dstPortId;
    }

    
    public void setDstPortId(String dstPortId) {
        this.dstPortId = dstPortId;
    }

    
    public String getTopologyId() {
        return topologyId;
    }

    
    public void setTopologyId(String topologyId) {
        this.topologyId = topologyId;
    }

    
    public Integer getBandwith() {
        return bandwith;
    }

    
    public void setBandwith(Integer bandwith) {
        this.bandwith = bandwith;
    }

    
    public Integer getLatency() {
        return latency;
    }

    
    public void setLatency(Integer latency) {
        this.latency = latency;
    }

    
    public Integer getLoss() {
        return loss;
    }

    
    public void setLoss(Integer loss) {
        this.loss = loss;
    }

    
    public String getState() {
        return state;
    }

    
    public void setState(String state) {
        this.state = state;
    }
}