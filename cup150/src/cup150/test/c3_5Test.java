package cup150;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class c3_5Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		c3_5 test=new c3_5();
		test.inQueue(1);
		test.inQueue(2);
		test.inQueue(3);
		test.inQueue(4);
		assertEquals(1,test.dequeue());
		
	}

}
