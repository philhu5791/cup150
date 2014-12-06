package cup150;
//find next node
public class c4_6 {

	static Node findNext(Node<Integer> input){
		Node current=input;
		Node parent=current.parent;
		
		//if current Node has right child. return the left most node of its right subtree
		if(current.right!=null){
			return getLeftMost(current.right);
		}else{
			//if current Node has no right child, return its un-access ancestor
			
				while(parent!=null&&parent.left!=current){
					current=parent;
					parent=parent.parent;
				}
				return parent;
			
			
		}
		
		
	}

	private static Node getLeftMost(Node right) {
		Node looper=right;
		while(looper.left!=null){
			looper=looper.left;
		}
		return looper;
	}
}
