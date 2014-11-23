package cup150;

public class c2_2 {
	
	
 static Node find(int k, Node<Integer> head){
	 int length=0;
	 Node looper=head;
	 while(looper.next!=null){
		 looper=looper.next;
		 length++;
	 }
	 if(k>length){
		 return null;
	 }else{
		 int span=length-k;
		 for(int i=0; i<span; i++){
			 head=head.next;
		 }
		 return head;
	 }
 }

 public static Node findR(int k, Node<Integer>head, Wrapper count){
	 if(head==null){
		 return null;
	 }
	 Node node=findR(k, head.next, count);
	 count.v++;
	 if(count.v==k){
		 return head;
	 }
	return node;
 }

}


