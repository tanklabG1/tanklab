package main.java.com.tanklab.entity;

/**
 * 
 * @author CaiHe
 * @describe link information
 */
public class Link {
	public String linkID = null;
	public String srcNodeId = null;
	public String srcTp = null;
	public String dstNodeId = null;
	public String dstTp = null;
	public int bandwidth = 0;
	public int latency = 0;
	
	public Link(String linkId,String srcNodeId,String srcTp,String dstNodeId,String dstTp,int bandwidth,int latency){
		this.linkID = linkId;
		this.srcNodeId = srcNodeId;
		this.srcTp = srcTp;
		this.dstNodeId = dstNodeId;
		this.dstTp = dstTp;
		this.bandwidth = bandwidth;
		this.latency = latency;
	}
	
	public Link(){
		
	}

	public String getLinkID() {
		return linkID;
	}

	public void setLinkID(String linkID) {
		this.linkID = linkID;
	}

	public String getSrcNodeId() {
		return srcNodeId;
	}

	public void setSrcNodeId(String srcNodeId) {
		this.srcNodeId = srcNodeId;
	}

	public String getSrcTp() {
		return srcTp;
	}

	public void setSrcTp(String srcTp) {
		this.srcTp = srcTp;
	}

	public String getDstNodeId() {
		return dstNodeId;
	}

	public void setDstNodeId(String dstNodeId) {
		this.dstNodeId = dstNodeId;
	}

	public String getDstTp() {
		return dstTp;
	}

	public void setDstTp(String dstTp) {
		this.dstTp = dstTp;
	}

	public int getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(int bandwidth) {
		this.bandwidth = bandwidth;
	}

	public int getLatency() {
		return latency;
	}

	public void setLatency(int latency) {
		this.latency = latency;
	}
	
	
	
}
