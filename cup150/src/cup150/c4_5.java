package cup150;

import cup150.Node;


public class c4_5 {
	public static int lastPrinted=Integer.MIN_VALUE;
	public static boolean check2(Node<Integer> root){
		//base case
		if(root==null){
			return true;
		}
		if(!check2(root.left)){
			return false;
		}
		//visit current node
		if(root.v<lastPrinted){
			return false;
		}else{
			lastPrinted=root.v;
		}
		if(!check2(root.right)){
			return false;
		}
		//all good
		return true;
	}
	
	public static boolean check(Node<Integer> root){
		//This solution is wrong,because it only consider the property of one node
		// fix it with inorder travesal
		if(root==null){
			//stop point is the leaf nodes
			return true;
		}else{
			boolean left=check(root.left);
			boolean right=check(root.right);
			
			if(left==true&&right==true&&checkLeft(root)&&checkRight(root)){
				return true;
			}else{
				return false;
			}
			
		}
		
		
	}
	
	
	
	public static boolean check(Node<Integer>root, int min, int max){
		if(root==null){
			return true;
		}
		if(root.v<min || root.v>max){
			return false;
		}
		
		//return check(root.left, min, root.v) && check(root.right, root.v, max);
		//to increase the readablility and reduce the cases number
		
		if(!check(root.left, min, root.v)||!check(root.left, min, root.v)){
			return false;
		}
		return true;
	}
	
	public static boolean checkLeft(Node<Integer> root){
		if(root==null||root.left==null||root.left.v<root.v){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean checkRight(Node<Integer> root){
		if(root==null||root.right==null||root.right.v<root.v){
			return true;
		}else{
			return false;
		}
	}
}
