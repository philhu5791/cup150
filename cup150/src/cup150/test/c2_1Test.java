package cup150.test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import cup150.Node;
import cup150.c2_1;
import cup150.c2_3;

public class c2_1Test {
	Node<Character> head;

	@Before
	public void setUp() throws Exception {
		
		String test="FOLLOW UP";
		head=new Node('F');
		
		head.append('O');
		head.append('L');
		head.append('L');
		head.append('O');
		head.append('W');
		
		
	}

	@Test
	public void test() {
		//Node.print(head);
		//head=c2_1.remove(head);
		//c2_1.noBuff2(head);
		//Node.print(head);
	
	}
	
	@Test
	public void testC2_3(){
		Node mid=head.next.next.next;
		c2_3.removeMid(mid);
		Node.print(head);
	}

}
