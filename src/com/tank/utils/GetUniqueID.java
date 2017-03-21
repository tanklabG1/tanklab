package com.tank.utils;

/**
 * 
 * @author CaiHe
 * @describe get the ordered-unique number
 */
public class GetUniqueID {

	public static int OrderNumber = 0;
	public static int  getUniqueID() {
		return OrderNumber++;
	}
}
