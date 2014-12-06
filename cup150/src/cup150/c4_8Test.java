package cup150;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class c4_8Test {
	Node<Integer> root;
	Node<Integer> sub;
    Node n1;
    Node n4;
    Node n9;

	@Before
	public void setUp() throws Exception {
		root=new Node<Integer>(5);
		Node n3=new Node<Integer>(3);
		Node n8=new Node<Integer>(8);
		 n1=new Node<Integer>(1);
		n4=new Node<Integer>(4);
		Node n6=new Node<Integer>(6);
		n9=new Node<Integer>(9);
		root.addLeft(n3);
		root.addRight(n8);
		n3.addLeft(n1);
		n3.addRight(n4);
		n8.addLeft(n6);
		n8.addRight(n9);
		sub=n8;
		sub.left=n6;
		sub.right=n9;
	}

	@Test
	public void test() {
		assertEquals(true, c4_8.isSubtree(root, sub));
	}

}
