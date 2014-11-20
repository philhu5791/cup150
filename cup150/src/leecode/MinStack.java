package leecode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
class MinStack {
    Deque<Integer> main;
    Deque<Integer> min;
    MinStack(){
        main=new ArrayDeque<Integer>();
        min=new ArrayDeque<Integer>();
    }
    public void push(int x) {
        main.addLast(x);
        if(min.isEmpty()||x>(Integer)min.getLast()){
            min.addLast(x);
            
        }else{
            min.addFirst(x);
        }
    }

    public void pop() {
        main.removeLast();
        min.removeLast();
    }

    public int top() {
        return (int)main.getLast();
    }

    public int getMin() {
               return (int)min.getFirst();
    }
}

