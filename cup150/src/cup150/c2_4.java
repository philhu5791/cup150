package cup150;

public class c2_4 {
	public static Node partition(Node head, int x){
		Node before=null;
		Node after=null;
		Node mid=null;
		Node looper=head;
		while(looper!=null){
			Node next=looper.next;
			if((int)looper.v<x){
				//add into before list
				
				looper.next=before;
				before=looper;
				
			}else if((int)looper.v==x){
				looper.next=mid;
				mid=looper;
			}else{
				
				looper.next=after;
				after=looper;
			}
			looper=next;
		}
		//merge before and after
		if(before==null){
			return cat(mid, after);
		}else{
			Node temp=cat(before,mid);
			return cat(temp,after);
		}
	}
	
	static Node cat(Node b, Node a){
		if(b==null){
			return a;
		}
		Node head=b;
		while(b.next!=null){
			b=b.next;
		}
		b.next=a;
		return head;
	}

}
