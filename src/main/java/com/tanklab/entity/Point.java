package main.java.com.tanklab.entity;

import org.apache.log4j.Logger;

public class Point {
	private static Logger logger = Logger.getLogger(Point.class);
	public String tpId = null;
	public String odlTopoConRef = null;
	
	public Point(String tpId ,String odlTopoConRef){
		this.tpId = tpId;
		this.odlTopoConRef = odlTopoConRef;
	}
	
	public Point(){
		
	}

	public String getTpId() {
		return tpId;
	}

	public void setTpId(String tpId) {
		this.tpId = tpId;
	}

	public String getOdlTopoConRef() {
		return odlTopoConRef;
	}

	public void setOdlTopoConRef(String odlTopoConRef) {
		this.odlTopoConRef = odlTopoConRef;
	}


	public int getDatapathId(){
		int i = -1;
		try{
			i = Integer.parseInt(this.tpId.substring(this.tpId.lastIndexOf(':')+1,this.tpId.length()));
		}catch(Exception e){
			logger.error(e.getMessage());
		}
		return i;
	}
	
}
