package cup150;

import java.util.ArrayList;
import java.util.LinkedList;
// another way to implement breadth first search
// queue is not used but the parent linkelist

public class c4_4 {
	@SuppressWarnings("rawtypes")
	public ArrayList<LinkedList<Node<Integer>>> list;
	@SuppressWarnings("rawtypes")
	c4_4(){
		list=new ArrayList<LinkedList<Node<Integer>>>();
	}
	
	public void run(Node root){
		LinkedList<Node<Integer>> current=new LinkedList<Node<Integer>> ();
		if(root!=null){
			current.add(root);
		}
		//current.add(root);
		
		while(current.size()>0){
			list.add(current);
			LinkedList<Node<Integer>> parent= current;
			current=new LinkedList<Node<Integer>>();
			for(Node<Integer> temp: parent){
					
					if(temp.left!=null){
						current.add(temp.left);
					}
					if(temp.right!=null){
						current.add(temp.right);
					}
					
				}
			//list.add(current);
				
			}
		
		
	}

}
