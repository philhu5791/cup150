package cup150;

import java.util.ArrayList;
import java.util.Stack;

public class c3_4 {
	Stack[]tower;
	int number;
	public c3_4(int n){
		tower=new Stack[3];
		Stack<Integer> start=new Stack<Integer>();
		number=n;
		for(int i=number; i>0; i--){
			start.push(i);
		}
		
		tower[0]=start;
		tower[1]=new Stack<Integer>();
		tower[2]=new Stack<Integer>();
		
	}
	public void run(){
		move(number, 0,2);
		while(!tower[2].isEmpty()){
			System.out.println(tower[2].pop());
		}
	}

	void move(int n, int start, int des){
		if(n==1){
			tower[des].push(tower[start].pop());
		}else{
			
			int buffer=3-start-des;
			move(n-1,start, buffer);
			move(1,start, des);
			move(n-1,buffer,des);
		}
		
	}
}
