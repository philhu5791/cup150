package cup150;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class c3_6Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Stack<Integer> input=new Stack<Integer>();
		input.push(2);
		input.push(4);
		input.push(3);
		input.push(1);
		Stack output=new c3_6(input).sort2();
		while(!output.isEmpty()){
			System.out.println(output.pop());
		}
	}

}
