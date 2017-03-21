package com.tank.main;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.tank.entity.Link;
import com.tank.entity.Topology;

public class FaultDetection {
	List<Topology> nTopoList;
	List<Topology> lTopoList;

	/*
	 * Timer find changes of topology
	 */

	public void checkTopology() {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				nTopoList = TopologyManager.updateTopoInfo();
				/*
				 * accept this last topology from DB
				 */
				lTopoList = TopologyManager.updateTopoInfo();
				if(Compare(nTopoList, lTopoList) == false) {
					/*
					 * Rewrite the database
					 */
				}
			}
		}, 1000, 2000);
	} 

	public static boolean Compare(List<Topology> aTopoList, List<Topology> bTopoList) {
		if(aTopoList.size() != bTopoList.size()) 
			return false;
		int n = aTopoList.size();
		for(int i = 0;i < n;i ++) {
			if(aTopoList.get(i).equals(bTopoList.get(i)) == false) {
				return false;
			}
		}
		return true;
	}

}
