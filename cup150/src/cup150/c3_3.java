package cup150;

import java.util.ArrayList;
import java.util.Stack;

public class c3_3 {
    ArrayList<stack> setOfStacks;
    int size=2;
    stack last;
    c3_3(){
    	setOfStacks=new ArrayList<stack>();
    	last=null;
    }
    
    void push(int v){
    	if(last==null||last.isFull()){
    		stack temp=new stack(size);
    		temp.push(v);
    		setOfStacks.add(temp);		
    		last=temp;
    	}else{
    		     last.push(v);
    			
    		}
    		
    	}
    
    
    int pop(){
    	int top=last.pop();
    	if(last.isEmpty()){
    		//move last back
    		int index=setOfStacks.indexOf(last);
    		//after pop make sure the last stack is right
    		if(index-1>=0){
    			last=setOfStacks.get(index-1);
    		}
    		
    	}
    	return top;
    	
    }
    
    class stack{
    	Stack<Integer> s;
    	int size;
    	stack(int size){
    		s=new Stack<Integer>();
    		this.size=size;
    	}
    	
    	public boolean isEmpty() {
			
			return s.isEmpty();
		}

		boolean isFull(){
    		return s.size()==size;
    	}
       void push(int i){
    	   s.push(i);
       }
       int pop(){
    	
    	   return s.pop();
       }
    	
    }
}
