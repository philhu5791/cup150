package cup150;

public class c2_5 {
	
	static Node addRecr(Node<Integer> o1, Node<Integer> o2, int carry){
		if(o1==null&&o2==null&&carry==0){
			return null;
		}
		int value=0;
		if(o1!=null){
			value+=o1.v;
		}
		if(o2!=null){
			value+=o2.v;
		}
		value=value+carry;
		Node<Integer> current=new Node<Integer>(value%10);
		carry=value/10;
		current.next=addRecr(o1.next,o2.next,carry);
		return current;
		
		
	}
	
	
	
	@SuppressWarnings("unchecked")
	static Node addR(Node o1, Node o2){
		int num1=0,num2=0;
		while(o1!=null){
			num1=10*num1+(int)o1.v;
			o1=o1.next;
		}
		while(o2!=null){
			num2=10*num2+(int)o2.v;
			o2=o2.next;
		}
		System.out.println("op1 is "+num1);
		System.out.println("op2 is "+num2);
		int result=num1+num2;
		System.out.println("op2 is "+result);
		
		Node head=null;
		Node looper=null;
		while(result>0){
			int digit=result%10;
			if(head==null){
				head=new Node<Integer>(digit);
				looper=head;
			}else{
				looper.next=new Node<Integer>(digit);
				looper=looper.next;
			}
			result=result/10;
		}
		return head;
	}
	
	static void add(Node o1, Node o2){
		int num1=0,num2=0;
		while(o1!=null){
			num1=10*num1+(int)o1.v;
			o1=o1.next;
		}
		while(o2!=null){
			num2=10*num2+(int)o2.v;
			o2=o2.next;
		}
		System.out.println("op1 is "+num1);
		System.out.println("op2 is "+num2);
		int result=num1+num2;
		System.out.println("op2 is "+result);
		
		Node head=null;
		Node looper=null;
		while(result>0){
			int digit=result%10;
			if(head==null){
				head=new Node<Integer>(digit);
				looper=head;
			}else{
				looper.next=new Node<Integer>(digit);
				looper=looper.next;
			}
			result=result/10;
		}
		//return head;
	}
	
	static Node reverse(Node head){
		Node looper=head;
		Node end=null;
		while(looper.next!=null){
			looper=looper.next;
		}
		end=looper;
		while(head.next!=end&&end.next!=head){
			
		}
		return null;
	}

}
