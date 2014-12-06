package cup150;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class c3_1Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		c3_1.push(0, 1);
		c3_1.push(1, 2);
		c3_1.push(2, 3);
		System.out.println(c3_1.pop(0));
		System.out.println(c3_1.pop(1));
		System.out.println(c3_1.pop(2));
		
	}

}
