package cup150;

public class c3_1 {
	static int stackSize=100;
	static int[] buffer=new int[stackSize*3];
	static int[] stackTop=new int[3];
	
	static void push(int i, int value){
		//push value into stack i; i==0,1 or 2
		stackTop[i]++;
		buffer[(stackTop[i]-1)*3+i]=value;
		
		
	}
	
	static int pop(int i){
		int top=buffer[(stackTop[i]-1)*3+i];
		buffer[(stackTop[i]-1)*3+i]=Integer.MIN_VALUE;
		stackTop[i]--;
		return top;
	}

}

