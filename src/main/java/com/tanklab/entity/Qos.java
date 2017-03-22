package main.java.com.tanklab.entity;

public class Qos {

	
	private Integer id;
	
	private Integer belongSwId;
	
	private Integer qosId;
	
	private String qosUuid;
	
	private String qosband;

	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getBelongSwId() {
		return belongSwId;
	}

	
	public void setBelongSwId(Integer belongSwId) {
		this.belongSwId = belongSwId;
	}

	
	public Integer getQosId() {
		return qosId;
	}

	
	public void setQosId(Integer qosId) {
		this.qosId = qosId;
	}

	
	public String getQosUuid() {
		return qosUuid;
	}

	
	public void setQosUuid(String qosUuid) {
		this.qosUuid = qosUuid;
	}

	
	public String getQosband() {
		return qosband;
	}

	
	public void setQosband(String qosband) {
		this.qosband = qosband;
	}
}