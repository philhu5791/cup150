package cup150;

public class c4_9 {
	static void  find(int sum, Node root){
		if (root==null){
			return;
		}
		int height=height(root);
		System.out.println("root height is"+ height);
		int[] path=new int[height+1];
		findHelper(sum,root,path,height);
		
	}

	private static void findHelper(int sum, Node root, int[] path, int height) {
		if(root==null){
			return;
		}
		int h=height;
		path[h]=(int)root.v;
		
		//test the sum
		int add=0;
		for(int i=h; i<path.length;i++){
			add+=path[i];
			if(add==sum){
				print(path,i,h);
			}
		}
		findHelper(sum,root.left,path,h-1);
		findHelper(sum,root.right,path,h-1);		
		
	}

	private static void print(int[] path, int i, int h) {
		for(int k=i; k>=h; k--){
			System.out.print(path[k]+ " ");
		}
		System.out.println();
		
	}

	static int height(Node d){
		if(d==null){
			return -1;
		}
		return 1+Math.max(height(d.left), height(d.left));
	}
}
