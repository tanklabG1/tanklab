package main.java.com.tanklab.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 
 * @author CaiHe
 * @describe this module is to load the rest API information from the local properties 
 * @since 2017-2-23
 */
public class RestAPIManager {
	private static Logger logger = Logger.getLogger(RestAPIManager.class);
	private static InputStream in;
	public static Properties prop = new Properties();
	public static boolean isLoaded = false;
	public static void loadProperties(){
		//read config
		try {
			 in = new BufferedInputStream(new FileInputStream("src/main/java/com/tanklab/conf/restapi.properties"));
			prop.load(in);
			isLoaded = true;
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
		} catch (IOException e) {
			logger.error(e.getMessage());
		}

	}
	
	public static void close(){
		try {
			in.close();
		} catch (IOException e) {
			logger.error(e.getMessage());
			
		}
	}
	
	public static String[] get(Object obj){
		if(!isLoaded){
			loadProperties();
		}
		
		return prop.get(obj).toString().split(",");
	}
}
