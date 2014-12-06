package cup150;

import java.util.LinkedList;

import data.*;

public class c4_2 {
	Graph g;
	c4_2(){
		g=new Graph();
		g.setDirected();
		gNode a=new gNode<Character>('a');
		gNode b=new gNode<Character>('b');
		gNode c=new gNode<Character>('c');
		gNode d=new gNode<Character>('d');
		//add node
		g.addNode(a);
		g.addNode(b);
		g.addNode(c);
		g.addNode(d);
		//add edge
		g.addEdge(new Edge(a,b));
		g.addEdge(new Edge(a,c));
		g.addEdge(new Edge(b,d));
		g.addEdge(new Edge(c,d));
		
		System.out.println(check(g,a,d));
		
	}
	private boolean check(Graph g, gNode s, gNode d) {
		LinkedList<gNode> queue=new LinkedList<gNode>();
		s.visit();
		queue.add(s);
		gNode temp;
		while(!queue.isEmpty()){
			temp=(gNode) queue.removeFirst();
			if(temp!=null){
				for(gNode n: g.getNeighbors(temp)){
					if(!n.isVisited()){
						if(n==d){
							return true;
						}else{
							n.visit();
							queue.add(n);
						}
					}
				}
				temp.visit();
			}
		}
		return false;
	}
	
	

}
