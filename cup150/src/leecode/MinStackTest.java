package leecode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MinStackTest {
	MinStack m=new MinStack();

	@Before
	public void setUp() throws Exception {
		m.push(0);
		m.push(-1);
		m.push(2);
	}

	@Test
	public void testGetMin() {
		assertEquals(-1,m.getMin());
		//fail("Not yet implemented");
	}

}
