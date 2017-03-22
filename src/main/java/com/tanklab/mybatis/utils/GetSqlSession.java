package main.java.com.tanklab.mybatis.utils;

import org.apache.ibatis.session.SqlSession;

public class GetSqlSession {
	private static ThreadLocal<SqlSession> t1 = new ThreadLocal<SqlSession>();
 	public GetSqlSession() {
		// TODO Auto-generated constructor stub
	}
 	public static SqlSession getSqlSession(){
 		SqlSession sqlSession = t1.get();
 		if(sqlSession == null){
 			sqlSession = GetSqlSessionFactory.getSqlSessionFactory().openSession();
 			t1.set(sqlSession); 					
 		}else{
 			
 		}
 		return sqlSession;
 	}
}
