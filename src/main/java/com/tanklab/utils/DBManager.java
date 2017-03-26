package main.java.com.tanklab.utils;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import main.java.com.tanklab.entity.Link;
import main.java.com.tanklab.entity.Node;
import main.java.com.tanklab.entity.OvsdbNode;
import main.java.com.tanklab.entity.Point;
import main.java.com.tanklab.entity.Topology;
import main.java.com.tanklab.mybatis.utils.GetSqlSession;

public class DBManager {

	public DBManager() {
		// TODO Auto-generated constructor stub
	}
	public static void delAllDemands(){
		del("main.java.com.tanklab.mybatis.mapper.DemandsMapper.deleteAll");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.DemandsMapper.resetAutoIncrement");
	}
	public static void delAllFlowentity(){
		del("main.java.com.tanklab.mybatis.mapper.FlowentityMapper.deleteAll");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.FlowentityMapper.resetAutoIncrement");
	}
	public static void delAllHost(){
		del("main.java.com.tanklab.mybatis.mapper.HostMapper.deleteAll");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.HostMapper.resetAutoIncrement");
	}
	public static void delAllLink(){
		del("main.java.com.tanklab.mybatis.mapper.LinkMapper.deleteAll");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.LinkMapper.resetAutoIncrement");
	}
	public static void delAllOfNode(){
		del("main.java.com.tanklab.mybatis.mapper.OpenflowNodeMapper.deleteAll");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.OpenflowNodeMapper.resetAutoIncrement");
	}
	public static void delAllOfPoint(){
		del("main.java.com.tanklab.mybatis.mapper.OpenflowPointMapper.deleteAll");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.OpenflowPointMapper.resetAutoIncrement");
	}
	public static void delAllOvsdbNode(){
		del("main.java.com.tanklab.mybatis.mapper.OvsdbNodeMapper.deleteAll");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.OvsdbNodeMapper.resetAutoIncrement");
	}
	public static void delAllOvsdbPoint(){
		del("main.java.com.tanklab.mybatis.mapper.OvsdbPointMapper.deleteAll");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.OvsdbPointMapper.resetAutoIncrement");
	}
	public static void delAllQos(){
		del("main.java.com.tanklab.mybatis.mapper.QosMapper.deleteAll");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.QosMapper.resetAutoIncrement");
	}	
	public static void delAllQueue(){
		del("main.java.com.tanklab.mybatis.mapper.QueueMapper.deleteAll");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.QueueMapper.resetAutoIncrement");
	}
	public static void delAllTable(){
		del("main.java.com.tanklab.mybatis.mapper.FlowtableMapper.deleteAll");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.FlowtableMapper.resetAutoIncrement");
	}
	public static void delAllTopology(){
		del("main.java.com.tanklab.mybatis.mapper.TopologyMapper.deleteAll");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.TopologyMapper.resetAutoIncrement");
	}
		
	private static void del( String delId){
		SqlSession sqlSession = GetSqlSession.getSqlSession();
		try{			
			sqlSession.delete(delId);
			sqlSession.commit();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
	private static void resetAutoIncrement(String updateId){
		SqlSession sqlSession = GetSqlSession.getSqlSession();
		try{			
			sqlSession.update(updateId);
			sqlSession.commit();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
	}

	public static void resetDB(){
		delAllDemands();	
		delAllFlowentity();	
		delAllHost();	
		delAllLink();	
		delAllOfNode();	
		delAllOfPoint();	
		delAllOvsdbNode();	
		delAllOvsdbPoint();	
		delAllQos();		
		delAllQueue();	
		delAllTable();	
		delAllTopology();
	}
	
	public static void resetAllAutoIncrement(){
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.DemandsMapper.resetAutoIncrement");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.FlowentityMapper.resetAutoIncrement");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.HostMapper.resetAutoIncrement");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.LinkMapper.resetAutoIncrement");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.OpenflowNodeMapper.resetAutoIncrement");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.OpenflowPointMapper.resetAutoIncrement");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.OvsdbNodeMapper.resetAutoIncrement");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.OvsdbPointMapper.resetAutoIncrement");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.QosMapper.resetAutoIncrement");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.QueueMapper.resetAutoIncrement");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.FlowtableMapper.resetAutoIncrement");
		resetAutoIncrement("main.java.com.tanklab.mybatis.mapper.TopologyMapper.resetAutoIncrement");	
	}
	public static  boolean writeTpinfoToDb(Topology topology){
		try{
			SqlSession sqlSession = GetSqlSession.getSqlSession();
			if(topology.getTopologyId().equals("ovsdb:1")){			
				List<Node> nodes =topology.getNodes();
				for(int i =0; i < nodes.size();i++){
					OvsdbNode oneNode = (OvsdbNode)nodes.get(i);
					List<Point> pointList = oneNode.getPointList();
					for(int j = 0; j<pointList.size(); j++){
						sqlSession.insert("main.java.com.tanklab.mybatis.mapper.OvsdbPointMapper.insert", pointList.get(j));
						sqlSession.commit();
					}
					System.out.println("nodeid:"+oneNode.getNodeId());
					sqlSession.insert("main.java.com.tanklab.mybatis.mapper.OvsdbNodeMapper.insert", oneNode);
					sqlSession.commit();
				}		
			}else if(topology.getTopologyId().equals("flow:1")){//deal flow:1 topology start
				List<Node> nodes =topology.getNodes();
				for(int i =0; i < nodes.size();i++){//insert of_nodes/host/point into database start
					Node oneNode = nodes.get(i);
					List<Point> pointList = oneNode.getPointList();
					for(int j = 0; j<pointList.size(); j++){
						sqlSession.insert("main.java.com.tanklab.mybatis.mapper.OpenflowPointMapper.insert", pointList.get(j));
						sqlSession.commit();
					}
					if(oneNode.getType().equals("switch")){
						sqlSession.insert("main.java.com.tanklab.mybatis.mapper.OpenflowNodeMapper.insert", oneNode);
						}
					else 
						if(oneNode.getType().equals("host")){
							sqlSession.insert("main.java.com.tanklab.mybatis.mapper.HostMapper.insert", oneNode);
						}
					sqlSession.commit();
					
				}//insert of_nodes/host/point into database end
				List<Link> links = topology.getLinks();
				for(int k=0; k<links.size(); k++){ //insert link into database
					sqlSession.insert("main.java.com.tanklab.mybatis.mapper.LinkMapper.insert", links.get(k));
					sqlSession.commit();
				}
			}//deal flow:1 topology end
			sqlSession.insert("main.java.com.tanklab.mybatis.mapper.TopologyMapper.insert",topology);
			sqlSession.commit();
			sqlSession.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}		
	}
	public static void main(String []args){
		resetDB();
		resetAllAutoIncrement();
	}
	
}
