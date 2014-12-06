package cup150;

import java.util.Stack;

public class c3_6 {
Stack<Integer> right;
Stack<Integer> left;
	c3_6(Stack input){
		right=input;
		left=new Stack<Integer>();
	}
	
	Stack sort(){
		while(!right.isEmpty()){
			insertLeft(right.pop(),left);
		}
		
		return left;
	}

	private void insertLeft(Integer value, Stack<Integer> left) {
		if(left.isEmpty()||value>=left.peek()){
			left.push(value);
			}else{
				if(left.size()==1){
					int temp=left.pop();
					left.push(value);
					left.push(temp);
				}else{
					int temp=left.pop();
					insertLeft(value, left);
					left.push(temp);
				}
			}	
		
	}
	//TODO: write non recursive function
	Stack sort2(){
		while(!right.isEmpty()){
			int temp=right.pop();
			while(!left.isEmpty()&&left.peek()>temp){
				right.push(left.pop());
			}
			left.push(temp);
		}
		return left;
	}
	//TODO: Try merge sort
	//TODO: Try quick sort

	private void insertLeft2(Integer pop) {
		if(left.isEmpty()){
			left.push(pop);
		}else{
			int count=0;
			while(left.peek()>pop){
				right.push(left.pop());
				count++;
			}
			left.push(pop);
			while(count>0){
				left.push(right.pop());
				count--;
			}
		}
		
	}
}
