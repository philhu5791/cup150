package cup150.test;

import static org.junit.Assert.*;
import cup150.*;
import org.junit.Before;
import org.junit.Test;

import cup150.c3_7;

public class c3_7Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		c3_7 test=new c3_7();
		test.enqueue(new Cat());
		test.enqueue(new Dog());
		//System.out.println(test.dequeque().toString());
		System.out.println(test.dequequeDog().toString());
		
	}

}
