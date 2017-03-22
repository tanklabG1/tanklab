package main.java.com.tanklab.entity;

public class Host extends NE{

	private Integer id;
	
	private String type = "host";
	
	private Integer hostId;

	private String macAddr;
	
	private String ipv4Addr;
	
	private Integer conSwPortId;

	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getType() {
		return type;
	}

	
	public void setType(String type) {
		this.type = type;
	}

	
	public Integer getHostId() {
		return hostId;
	}

	
	public void setHostId(Integer hostId) {
		this.hostId = hostId;
	}

	
	public String getMacAddr() {
		return macAddr;
	}

	
	public void setMacAddr(String macAddr) {
		this.macAddr = macAddr;
	}

	
	public String getIpv4Addr() {
		return ipv4Addr;
	}

	
	public void setIpv4Addr(String ipv4Addr) {
		this.ipv4Addr = ipv4Addr;
	}

	
	public Integer getConSwPortId() {
		return conSwPortId;
	}

	
	public void setConSwPortId(Integer conSwPortId) {
		this.conSwPortId = conSwPortId;
	}
}