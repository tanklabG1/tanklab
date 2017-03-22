package main.java.com.tanklab.entity;

public class Node extends NE {

	
	private Integer id;
	
	private String type = "switch";
	
	private String datapathId;
	
	private String swithchname;
	
	private String odlnoderef;

	
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

	
	public String getDatapathId() {
		return datapathId;
	}

	
	public void setDatapathId(String datapathId) {
		this.datapathId = datapathId;
	}

	
	public String getSwithchname() {
		return swithchname;
	}

	
	public void setSwithchname(String swithchname) {
		this.swithchname = swithchname;
	}

	
	public String getOdlnoderef() {
		return odlnoderef;
	}

	
	public void setOdlnoderef(String odlnoderef) {
		this.odlnoderef = odlnoderef;
	}
}