package cup150;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class c3_3Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		c3_3 test=new c3_3();
		test.push(1);
		test.push(2);
		test.push(3);
		test.push(4);
		assertEquals(4,test.pop());
		assertEquals(3,test.pop());
		assertEquals(2,test.pop());
		assertEquals(1,test.pop());
		
	}

}
