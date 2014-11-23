package cup150;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class c2_7Test {
Node head;
	@Before
	public void setUp() throws Exception {
		head=new Node(0);
		head.append(1);
		head.append(2);
		head.append(3);
		head.append(2);
		head.append(1);
		head.append(0);
		
	}

	@Test
	public void test() {
		assertEquals(true, c2_7.s1(head));
	}

}
