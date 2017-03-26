package main.java.com.tanklab.entity;

import java.util.ArrayList;
import java.util.List;

public class Topology {
    
    private Integer id;

    
    private String topologyId;

    
    private String topologyOwner;
    
    private List<Node> nodes = new ArrayList<Node>(); 
    
    private List<Link> links = new ArrayList<Link>();
    
    public void addNode(Node node){
    	this.nodes.add(node);
    }
    
    public List<Node> getNodes(){    	
    	return this.nodes;    	
    }
    public void addLink(Link link){
    	this.links.add(link);    	
    }
    public List<Link> getLinks(){
    	return this.links;
    }
    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getTopologyId() {
        return topologyId;
    }

    
    public void setTopologyId(String topologyId) {
        this.topologyId = topologyId;
    }

    
    public String getTopologyOwner() {
        return topologyOwner;
    }

    
    public void setTopologyOwner(String topologyOwner) {
        this.topologyOwner = topologyOwner;
    }
}