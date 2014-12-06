package cup150;

public class c4_3 {
     public static Node convert(int[] input){
    	
    	 return buildTree(0,input.length-1,input);
    	 
     }
     
     public static Node buildTree(int start,int end, int[] input){
    	 if(end<start){
    		 return null;
    	 }
    	int mid=(end+start)/2;
    	Node root=new Node<Integer>(input[mid]);
    	root.left=buildTree(start,mid-1,input);
    	root.right=buildTree(mid+1,end,input);
    	return root;
     }
}
