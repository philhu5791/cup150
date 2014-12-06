package cup150.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cup150.c3_4;

public class c3_4Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		c3_4 test=new c3_4(3);
		test.run();
	}

}
