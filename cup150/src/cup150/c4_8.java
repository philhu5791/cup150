package cup150;
//determine if A is a subtree of B
public class c4_8 {

	static boolean isSubtree(Node p, Node q){
		//base case
	
		if(q==null){
			return true;
		}
		if(p==null){
			return false;
		}
		//find q inside p
		if(p.v==q.v){
			//match them
			return match(p,q);
		}
		
			return isSubtree(p.left, q)||isSubtree(p.right,q);
		
	}
	
	static boolean match(Node p, Node q){

		if(p!=null&&q!=null){
			if(p.v!=q.v){
				return false;
			}else{
				
					return match(p.left,q.left)&&match(p.right,q.right);
				}
			
		}else{
			if(p==null&&q==null){
				return true;
			}else{
				return false;
			}
		}
	}
}
