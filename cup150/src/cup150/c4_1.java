package cup150;

public class c4_1 {
	//check tree is balance
	 boolean check(Node root){
		if (chechHeight(root)==-1){
				return false;
			}else{
				return true;
			}
		}

	 int chechHeight(Node root) {
		if(root==null){
			return 0;
		}
		int leftH=chechHeight(root.left);
		if(leftH==-1){
			return -1;
		}
		int rightH=chechHeight(root.right);
		if(rightH==-1){
			return -1;
		}
		
		if(Math.abs(leftH-rightH)>1){
			return -1;
		}else{
			return Math.max(chechHeight(root.left), chechHeight(root.right))+1;
		}
		
		
	}

	

}
