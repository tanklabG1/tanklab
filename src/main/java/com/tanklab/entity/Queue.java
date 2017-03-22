package main.java.com.tanklab.entity;

public class Queue {

	
	private Integer id;
	
	private Integer queueId;
	
	private String queueUuid;
	
	private Integer maxRate;
	
	private Integer minRate;

	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getQueueId() {
		return queueId;
	}

	
	public void setQueueId(Integer queueId) {
		this.queueId = queueId;
	}

	
	public String getQueueUuid() {
		return queueUuid;
	}

	
	public void setQueueUuid(String queueUuid) {
		this.queueUuid = queueUuid;
	}

	
	public Integer getMaxRate() {
		return maxRate;
	}

	
	public void setMaxRate(Integer maxRate) {
		this.maxRate = maxRate;
	}

	
	public Integer getMinRate() {
		return minRate;
	}

	
	public void setMinRate(Integer minRate) {
		this.minRate = minRate;
	}
}