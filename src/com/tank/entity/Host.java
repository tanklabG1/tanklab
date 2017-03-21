package com.tank.entity;

public class Host {
	private String ipAddress = null;
	private String macAddress = null;

	public Host() { 
		
	} 

	public Host(String ipAddress, String macAddress){
		this.ipAddress = ipAddress;
		this.macAddress = macAddress;
	}

	public String getHostIP() {
		return this.ipAddress;
	}

	public String getHostMAC() {
		return this.macAddress;
	}

}