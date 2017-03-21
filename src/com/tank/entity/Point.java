package com.tank.entity;

import com.tank.main.Log;

public class Point {

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
			Log.error(e.getMessage());
		}
		return i;
	}
	
}
