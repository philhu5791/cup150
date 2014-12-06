package cup150;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class c3_2Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		c3_2 test=new c3_2();
		test.push(5);
		test.push(6);
		test.push(3);
		test.push(7);
		assertEquals(3,test.min());
		test.pop();
		test.pop();
		assertEquals(5,test.min());
		
	}

}
