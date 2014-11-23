package cup150.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import cup150.Node;
import cup150.Wrapper;
import cup150.c2_2;
import cup150.c2_4;

public class c2_2Test {
      Node<Integer> head;
	@Before
	public void setUp() throws Exception {
	
		head=new Node<Integer>(10);
		
		head.append(7);
		head.append(3);
		head.append(4);
		head.append(2);
		head.append(6);
	}

	@Ignore
	public void test() {
		Wrapper i=new Wrapper();
		Integer j=(Integer) c2_2.findR(2, head, i).v;
		System.out.println(j);
	}
	
	@Test
	public void test_c2_4(){
		head=c2_4.partition(head, 4);
		Node.print(head);
	}
	

}
