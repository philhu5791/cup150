package cup150;

import java.util.Stack;

public class c3_5 {
	Stack<Integer> right;
	Stack<Integer> left;
	
	c3_5(){
		right=new Stack<Integer>();
		left=new Stack<Integer>();
	}
	
	void inQueue(int v){
		right.push(v);
	}
	
	int dequeue(){
		if(left.isEmpty()){
			transfer();
			}
			return left.pop();
		
	}

	private void transfer() {
		while(!right.isEmpty()){
			left.push(right.pop());
		}
		
	}
}
