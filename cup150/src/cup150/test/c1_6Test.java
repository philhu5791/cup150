package cup150.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cup150.c1_6;


public class c1_6Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int [][] test=new int[][]{
				new int[]{1 ,2, 3, 4},
				new int[]{1 ,2, 3, 4},
				new int[]{1 ,2, 0, 4},
				new int[]{1 ,2, 3, 4}
				
				
		} ;
		c1_6.setZero(test);
		print(test);

	}

	public void print(int[][] s){
		int l=s[0].length;
		for(int i=0; i<l; i++){
			for(int j=0; j<l; j++){
				System.out.print(s[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
