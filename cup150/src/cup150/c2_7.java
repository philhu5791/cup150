package cup150;

import java.util.Stack;

public class c2_7 {
	static boolean s1(Node head){
		int count=0;
		Stack<Node> mys=new Stack<Node>();
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null){
			//count++;
			mys.push(slow);
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast!=null){
			//odd elements
			slow=slow.next;
		}
	    while(!mys.isEmpty()){
	    	Node temp=mys.pop();
	    	if(temp.v!=slow.v){
	    		return false;
	    	}
	    	slow=slow.next;
	    }
	    return true;
	}

}
