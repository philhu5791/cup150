package cup150.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cup150.C1;

public class C1Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String input="123456";
		assertEquals(true, C1.unique(input));
		//assertEquals(false, C1.uniSimple(input));
		
	}

}
