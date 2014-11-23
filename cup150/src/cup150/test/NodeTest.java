package cup150.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cup150.Node;

public class NodeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Node head=new Node(2);
		head.append(3);
		head.append(5);
		Node.print(head);
		head=head.delete(head, 2);
		Node.print(head);
	}

}
