package com.tank.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 
 * @author CaiHe
 * @describe to implement http request ,like : GET POST ,DELETE
 */
public class RequestManager {
	public static final String BASIC_AUTH = "Basic YWRtaW46YWRtaW4=" ; 
	public static String request(String url,String method,String data){
		if(method.equals("GET")){
			return GET(url,data);
			
		}else if(method.equals("POST")){
			
			return POST(url,data);
		}else if(method.equals("PUT")){
			return PUT(url,data);
		}else if(method.equals("DELETE")){
			
		}
		return null;
}
	
	
	private static String GET(String url_,String data){
		HttpURLConnection conn = null;
		try {
			URL url = new URL(url_);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(3000);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type","application/json");
			conn.setRequestProperty("Authorization","Basic YWRtaW46YWRtaW4=" );
			if (conn.getResponseCode() != 200){
				Log.error("request fialed !");
				//return null;
			}
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			return in.readLine();
		} catch (MalformedURLException e) {
			Log.error(e.getMessage());
		} catch (IOException e) {
			Log.error(e.getMessage());	
		}finally{
			conn.disconnect();
		}
		return null;
	}
	

	private static String POST(String url,String data){
		
		 PrintWriter out = null;
	        BufferedReader in = null;
	        String result = "";
	        try {
	            URL realUrl = new URL(url);
	            URLConnection conn = realUrl.openConnection();
	            conn.setRequestProperty("accept", "*/*");
	            conn.setRequestProperty("connection", "Keep-Alive");
				conn.setRequestProperty("Authorization",BASIC_AUTH);
				conn.setRequestProperty("Content-Type", "application/json");
	            conn.setDoOutput(true);
	            conn.setDoInput(true);
				if(data != null){
					out = new PrintWriter(conn.getOutputStream());
					out.print(data);
					out.flush();
	            }
	            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            return in.readLine();

	            
	        } catch (Exception e) {
	            Log.error(e.getMessage());
	        }

	        finally{
	            try{
	                if(out!=null){
	                    out.close();
	                }
	                if(in!=null){
	                    in.close();
	                }
	            }
	            catch(IOException ex){
	            	Log.error(ex.getMessage());
	            }
	        }
		
		return null;
	}
	
private static String PUT(String url , String data){ 
			PrintWriter out  = null; 
			BufferedReader in = null;
			try{
			 URL postURL = new URL(url);
	        HttpURLConnection httpURLConnection = (HttpURLConnection) postURL.openConnection();
	        httpURLConnection.setDoOutput(true);
	        httpURLConnection.setDoInput(true);
	        httpURLConnection.setRequestMethod("PUT");
	        httpURLConnection.setUseCaches(false);
	        httpURLConnection.setInstanceFollowRedirects(true);
	        httpURLConnection.setRequestProperty("Content-Type",  "application/json");

			httpURLConnection.setRequestProperty("connection", "Keep-Alive");
			httpURLConnection.setRequestProperty("Authorization",BASIC_AUTH);
			httpURLConnection.setRequestProperty("accept", "*/*");

	        StringBuilder sbStr = new StringBuilder();
				if(data != null) {
	        	        	
				
					out = new PrintWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(),"utf-8"));
				
	            out.println(data);
	            out.close();
	             in = new BufferedReader(new InputStreamReader(httpURLConnection
	                    .getInputStream()));

	            String inputLine = null; 
	            inputLine = in.readLine();
	            in.close();
	            return inputLine;
	        }
	        httpURLConnection.disconnect();		
	        
	        } catch (UnsupportedEncodingException e) {
	        	Log.error(e.getMessage());
				} catch (IOException e) {
					Log.error(e.getMessage());
				}
			finally{
	            try{
	                if(out!=null){
	                    out.close();
	                }
	                if(in!=null){
	                    in.close();
	                }
	            }
	            catch(IOException ex){
	            	Log.error(ex.getMessage());
	            }
	        }
		return null;
	}
	
		
	private static String DELETE(String url_,String data){
		HttpURLConnection conn = null;
		try {
			URL url = new URL(url_);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(3000);
			conn.setRequestMethod("DELETE");
			conn.setRequestProperty("Content-Type","application/json");
			conn.setRequestProperty("Authorization","Basic YWRtaW46YWRtaW4=" );
			if (conn.getResponseCode() != 200){
				Log.error("request fialed !");
				//return null;
			}
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			return in.readLine();
		} catch (MalformedURLException e) {
			Log.error(e.getMessage());
		} catch (IOException e) {
			Log.error(e.getMessage());	
		}finally{
			conn.disconnect();
		}
		return null;
	}

}
