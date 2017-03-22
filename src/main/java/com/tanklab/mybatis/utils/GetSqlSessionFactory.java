package main.java.com.tanklab.mybatis.utils;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;

public class GetSqlSessionFactory {
	private static SqlSessionFactory sqlSessionFactory;
	private GetSqlSessionFactory() {
		// TODO Auto-generated constructor stub
	}
	synchronized public static SqlSessionFactory getSqlSessionFactory(){
		try{
			if(sqlSessionFactory == null){
				String resource = "main/java/com/tanklab/mybatis/mybatis_config.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);				
			}else{
				
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		return sqlSessionFactory;		
	}
}
