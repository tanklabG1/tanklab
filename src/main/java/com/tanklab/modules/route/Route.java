package main.java.com.tanklab.modules.route;

import java.util.List;

import main.java.com.tanklab.entity.Topology;

public class Route {
	
	public static List<String> getPath(RouteStrategy routestrategy, Topology topology, String src, String dst){
		
		 return routestrategy.routing(topology, src, dst );
		
 		
		
	}
}
