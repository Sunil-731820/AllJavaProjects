package com.java.jsf.RichFaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.richfaces.ui.iteration.tree.model.TreeNodeImpl;

@ManagedBean
@RequestScoped
public class Tree extends TreeNodeImpl{
	
	private Tree stationRoot;
	private Tree rootNodes;
	private Object data;
	
	public Tree() {
		super();
	}
	
	
	public Tree(boolean leaf, Object data) {
		super(leaf);
		this.data = data ;
	}
	
	public String toString() {
		return super.toString() + " >>>" + data;
	}
	
	public Tree getRootNodes() {
		if(rootNodes==null) {
			String[] author_collections = {
					"RavindraNath Tagore - Geeta",
					"David Bowei - Lets Dance"
			};
			
		stationRoot = new Tree(false,"Books COllections");
		for(int i=0;i<author_collections.length;i++) {
			Tree child = new Tree(true,author_collections[i]);
		}
		rootNodes = new Tree();
		rootNodes.addChild(0, stationRoot);
		}
		
		return rootNodes;
	}
	
	

}
