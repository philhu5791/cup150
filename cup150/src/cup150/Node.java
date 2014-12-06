package cup150;

public class Node <T>{
	public Node<T> parent;
	public Node<T> next;
	public Node<T> left;
	public Node<T> right;
	public boolean visit;
	public T v;
	
	public Node(T i){
		this.v=i;
		this.next=null;
		this.left=null;
		this.right=null;
		this.visit=false;
		this.parent=null;
	}
	public Node(){
		this.v=null;
		this.next=null;
		this.left=null;
		this.right=null;
		this.visit=false;
	}
	
	public boolean noChild(){
		if(this.left==null&&this.right==null){
			return true;
		}else{
			return false;
		}
	}
	
	public void addRight(Node<T> j){
		
		this.right=j;
		j.parent=this;
	}
	
	public void addLeft(Node<T> j){
		this.left=j;
		j.parent=this;
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
