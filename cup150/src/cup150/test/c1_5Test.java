package cup150.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cup150.c1_5;

public class c1_5Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println(c1_5.compress("aaabbcccccccccc"));
	}

}
