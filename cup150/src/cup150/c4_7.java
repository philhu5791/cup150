package cup150;
//find common ancestor
public class c4_7 {
	static Node getCommonAncestor(Node root, Node p, Node q){
		if(!covers(root,p)||!covers(root,q)){
			return null;
		}
		
		return getCommonHelper(root, p,q);
		
	}
	
	private static Node getCommonHelper(Node root, Node p, Node q) {
		if(root==null){
			return null;
		}
		if(root==p||root==q){
			return root;
		}
		if(covers(root.left,p)&&covers(root.left,q)){
			return getCommonHelper(root.left,p,q);
		}
		if(covers(root.right,p)&&covers(root.right,q)){
			return getCommonHelper(root.right,p,q);
		}else
		{
			return root;
		}
	}

	static boolean covers(Node root, Node p){
		if(root==null){
			return false;
		}
		if(root==p){
			return true;
		}
		return covers(root.left,p) ||covers(root.right,p);
	}

}
