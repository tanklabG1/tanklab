package main.java.com.tanklab.mybatis.utils;

import org.apache.ibatis.session.SqlSession;

public class GetSqlSession {
	
//	private static ThreadLocal<SqlSession> t1 = new ThreadLocal<SqlSession>(); 	
// 	public static SqlSession getSqlSession(){
// 		SqlSession sqlSession = t1.get();
// 		if(sqlSession == null){
// 				sqlSession= GetSqlSessionFactory.getSqlSessionFactory().openSession();
// 				t1.set(sqlSession);
// 		}else{
// 			
// 		}
// 		System.out.println(sqlSession.hashCode());
// 		return sqlSession;
// 	}
	public static SqlSession getSqlSession(){
		SqlSession sqlSession = null;
		sqlSession= GetSqlSessionFactory.getSqlSessionFactory().openSession();
		System.out.println(sqlSession.hashCode());
 		return sqlSession;		
	}
}
