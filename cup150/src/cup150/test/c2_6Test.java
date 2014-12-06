package cup150;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class c2_6Test {
gNode<Character> head;
	@Before
	public void setUp() throws Exception {
		String test="FOLLOW UP";
		head=new Node('A');
		
		head.append('B');
		Node mid=new Node('C');
		head.append(mid);
		head.append('D');
		head.append('E');
		head.append(mid);
		
	}

	@Test
	public void test() {
		System.out.println(c2_6.find(head).v);
	}

}
