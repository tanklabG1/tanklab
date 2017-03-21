package com.tank.main;

/**
 * 
 * @author CaiHe
 * @describe log the information about the program 
 */
public class Log {

	public static void info(String info){
		
		System.out.println(info);
	}
	
	public static void error(String error){
		System.err.println(error);
		
	}
	
	public static void warning(String warning){
		info(warning);
		
	}
}
