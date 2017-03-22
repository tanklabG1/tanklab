package main.java.com.tanklab.dbutils;

public class DBPort {
	public String tpId = null;
	public String ovsdbName = null;
	public String tp_id = null;
	public String getTpId() {
		return tpId;
	}
	public void setTpId(String tpId) {
		this.tpId = tpId;
	}
	public String getOvsdbName() {
		return ovsdbName;
	}
	public void setOvsdbName(String ovsdbName) {
		this.ovsdbName = ovsdbName;
	}
	public String getTp_id() {
		return tp_id;
	}
	public void setTp_id(String tp_id) {
		this.tp_id = tp_id;
	}
	
	public DBPort(String tpId, String tp_id,String ovsdbName){
		this.ovsdbName = ovsdbName;
		this.tp_id = tp_id;
		this.tpId = tpId;
	}
	public DBPort(){
		
	}
}
