package main.java.com.tanklab.entity;

public class Link {

	
	private Integer id;
	
	private Integer linkId;
	
	private Integer srcSwId;
	
	private Integer dstSwId;
	
	private Integer srcPortId;
	
	private Integer dstPortId;
	
	private Integer bandwith;
	
	private Integer latency;

	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getLinkId() {
		return linkId;
	}

	
	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}

	
	public Integer getSrcSwId() {
		return srcSwId;
	}

	
	public void setSrcSwId(Integer srcSwId) {
		this.srcSwId = srcSwId;
	}

	
	public Integer getDstSwId() {
		return dstSwId;
	}

	
	public void setDstSwId(Integer dstSwId) {
		this.dstSwId = dstSwId;
	}

	
	public Integer getSrcPortId() {
		return srcPortId;
	}

	
	public void setSrcPortId(Integer srcPortId) {
		this.srcPortId = srcPortId;
	}

	
	public Integer getDstPortId() {
		return dstPortId;
	}

	
	public void setDstPortId(Integer dstPortId) {
		this.dstPortId = dstPortId;
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
}