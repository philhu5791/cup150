package cup150;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class c4_1Test {
	Node tree;

	@Before
	public void setUp() throws Exception {
		tree=new Node();
		tree.left=new Node();
		tree.right=new Node();
		tree.right.right=new Node();
	}

	@Test
	public void test() {
		assertEquals(true,new c4_1().check(tree));
	}
	
	

}
