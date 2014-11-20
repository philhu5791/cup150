package leecode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

// memeory limit exceed
class MinStackDynamic {

	    Stack mys;
	    MinStackDynamic(){
	        mys=new Stack<Element>();
	    }
	    class Element{
	        private int value;
	        private int min;
	        Element(int v, int m){
	            value=v;
	            min=m;
	        }
	        public int getValue(){
	            return value;
	        }
	        
	         public int getMin(){
	            return min;
	        }
	    }
	    public void push(int x) {
	       if (mys.isEmpty()){
	           mys.push(new Element(x,x));
	           return;
	       }
	       Element top=(Element)mys.peek();
	        if(top.getValue()>x){
	             mys.push(new Element(x,x));
	        }else{
	            mys.push(new Element(x,top.getMin()));
	        }
	        
	    }

	    public void pop() {
	        if (mys.isEmpty()){
	            return;
	        }else{
	            mys.pop();
	        }
	    }

	    public int top() {
	        if (mys.isEmpty()){
	            return -1;
	        }else{
	            Element top=(Element)mys.peek();
	            return top.getValue();
	        }
	    }

	    public int getMin() {
	               Element top=(Element)mys.peek();
	            return top.getMin();
	    }
	

}
