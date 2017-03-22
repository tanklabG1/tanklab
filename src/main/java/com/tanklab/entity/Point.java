package main.java.com.tanklab.entity;

import java.util.Date;

public class Point {

	
	private Integer id;
	
	private Integer portId;
	
	private String portName;
	
	private String macAddr;
	
	private Integer conSwId;
	
	private String state;
	
	private Integer maxspeed;
	
	private Integer currSpeed;
	
	private Date ctime;

	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getPortId() {
		return portId;
	}

	
	public void setPortId(Integer portId) {
		this.portId = portId;
	}

	
	public String getPortName() {
		return portName;
	}

	
	public void setPortName(String portName) {
		this.portName = portName;
	}

	
	public String getMacAddr() {
		return macAddr;
	}

	
	public void setMacAddr(String macAddr) {
		this.macAddr = macAddr;
	}

	
	public Integer getConSwId() {
		return conSwId;
	}

	
	public void setConSwId(Integer conSwId) {
		this.conSwId = conSwId;
	}

	
	public String getState() {
		return state;
	}

	
	public void setState(String state) {
		this.state = state;
	}

	
	public Integer getMaxspeed() {
		return maxspeed;
	}

	
	public void setMaxspeed(Integer maxspeed) {
		this.maxspeed = maxspeed;
	}

	
	public Integer getCurrSpeed() {
		return currSpeed;
	}

	
	public void setCurrSpeed(Integer currSpeed) {
		this.currSpeed = currSpeed;
	}

	
	public Date getCtime() {
		return ctime;
	}

	
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
}