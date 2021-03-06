/*
package main.java.com.tanklab.modules.route;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import main.java.com.tanklab.entity.Link;
import main.java.com.tanklab.entity.Topology;

public class SPFRouting extends RouteStrategy {

	@Override
	public List<String> routing(Topology topology, String src, String dst) {
		// TODO Auto-generated method stub
		return super.routing(topology, src, dst);
	}
	
	/*
	private static List<Integer> VisitNodes;
	private static Map<Integer, Integer> path;
	private static List<Integer> nodes;

	public static List<Integer>GetRoute(Link[][] links, int start, int end) {
		if(null == VisitNodes) {
			VisitNodes = new ArrayList<Integer>();
		}
		if(null == path) {
			path = new HashMap<Integer,Integer>();
		}
		if(null == nodes){
			nodes = new ArrayList<Integer>();
			
		} 
		
		path.clear();
		nodes.clear();
		VisitNodes.clear();
		
		path.clear();
		if(bfs(links, start, end)){
			int temp = end;
			for(;;){
				nodes.add(temp);
				if(temp == start) 	break; 
				temp = path.get(temp);
			}
			Collections.reverse(nodes);
		}
		
		return nodes;
	}

	public static List<Integer> GetPath(){
		return nodes;
	} 

	private static boolean bfs(Link[][] links, int start, int end) {
		Queue <Integer> queue = new LinkedList<Integer>();
		int length = links.length;
		VisitNodes.add(start);
		queue.add(start);
		while(queue.isEmpty() == false){
			int tmp = queue.poll();
			for(int node = 0; node < length;++ node) {
				if(VisitNodes.contains(node) || links[tmp][node] == null) 	continue;
				VisitNodes.add(node);
				queue.add(node);
				path.put(node, tmp);
			}
		}
		return VisitNodes.contains(end);
	} 
	public SPFRouting() {
		// TODO Auto-generated constructor stub
	}
*/
/*	
}

*/