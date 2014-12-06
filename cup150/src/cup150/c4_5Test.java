package cup150;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class c4_5Test {
	Node bst;
	Node notBst;

	@Before
	public void setUp() throws Exception {
		notBst=new Node<Integer>(1);
		Node n1=new Node<Integer>(2);
		Node n2=new Node<Integer>(3);
		notBst.left=n1;
		notBst.right=n2;
		n1.left=new Node<Integer>(4);
		n1.right=new Node<Integer>(5);
		n2.left=new Node<Integer>(6);
		n2.right=new Node<Integer>(7);
		
		bst=new Node<Integer>(5);
		Node n3=new Node<Integer>(3);
		Node n4=new Node<Integer>(6);
		n3.left=new Node(2);
		n3.right=new Node(4);
		n3.right=new Node(7);
		
	}

	@Test
	public void testBst() {
	    assertEquals(true,c4_5.check(bst,Integer.MIN_VALUE, Integer.MAX_VALUE));
	    
	}
	@Test
	public void testNoBst() {
	    assertEquals(false,c4_5.check(notBst,Integer.MIN_VALUE, Integer.MAX_VALUE));
	    
	}
	
	@Test
	public void testBst2(){
		assertEquals(true,c4_5.check2(bst));
	}
	@Test
	public void testNoBst2(){
		assertEquals(false,c4_5.check2(notBst));
	}

}
