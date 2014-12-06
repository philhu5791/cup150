package cup150;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class c4_4Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Node tree=new Node<Integer>(1);
		Node n1=new Node<Integer>(2);
		Node n2=new Node<Integer>(3);
		tree.left=n1;
		tree.right=n2;
		n1.left=new Node<Integer>(4);
		n1.right=new Node<Integer>(5);
		n2.left=new Node<Integer>(6);
		n2.right=new Node<Integer>(7);
		
		c4_4 test=new c4_4();
		test.run(tree);
		for(LinkedList<Node<Integer>> list: test.list){
			for(Node item: list){
				System.out.print(item.v+" ");
			}
			System.out.println();
			
		}
	}

}
