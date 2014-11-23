package cup150;

public class Node <T>{
	public Node<T> next;
	public T v;
	
	public Node(T i){
		this.v=i;
		this.next=null;
	}
	
	public void append(T j){
		Node<T> temp=new Node<T>(j);
		
			Node<T> looper=this;
			while(looper.next!=null){
				looper=(Node<T>) looper.next;
			}
		    looper.next=temp;
	}
	public void append(Node x){
		Node<T> looper=this;
		while(looper.next!=null){
			looper=(Node<T>) looper.next;
		}
	    looper.next=x;
		
	}
    
	public Node<T> delete(Node<T> head, T j){
		if(head.v==j){
			return (Node<T>) head.next;
		}else{
			Node<T> looper=head;
			while(looper.next!=null){
				if(looper.next.v==j){
					looper.next=looper.next.next;
					return head;
				}
				looper=(Node<T>) looper.next;
			}
			return head;
			
		}
		
	}
	
	public static void print(Node head){
		while(head!=null){
			System.out.println(head.v);
			head=head.next;
		}
	}
}
