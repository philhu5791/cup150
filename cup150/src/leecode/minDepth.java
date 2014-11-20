package leecode;

import java.util.ArrayList;
import java.util.Collections;


	 
	public class minDepth {
	    static int counter=0;
	    //static int depth=0;
	    ArrayList<Integer> list=new ArrayList<Integer> ();
	    public int minDepth(TreeNode root) {
	    	find(root);
	       if(list.isEmpty()){
	    	   return 0;
	       }
	       Collections.sort(list);
	       for(Integer item:list){
	    	  // System.out.println(item);
	       }
	        return list.get(0);
	    }
	    
	    
	    void find(TreeNode root){
	    	if(root==null){
		           return;
		       }
	    	//System.out.println(root.val);
		       counter++;		       
		       find(root.left);
		       find(root.right);
		       if(root.left==null&&root.right==null){
		    	   list.add(counter);
		    	   System.out.println(counter);
		    	   
		       }
		       counter--;
		     
	    }
	}
	 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
