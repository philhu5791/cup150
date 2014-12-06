package cup150;

import java.util.Stack;

public class c3_2 {
	Stack<Node> stack;
	
	c3_2(){
		stack=new Stack<Node>();
	}
	
	void push(int v){
		if(stack.isEmpty()||v<stack.peek().min){
			stack.push(new Node(v,v));
		}else{
			
				stack.push(new Node(v,stack.peek().min));		
		}		
	}
	
	int pop(){
		Node top=stack.pop();
		return top.value;
	}
	
	int min(){
		return stack.peek().min;
	}
class Node{
	public int value;
	public int min;
	
	Node(int v, int m){
		value=v;
		min=m;
	}
}
}
