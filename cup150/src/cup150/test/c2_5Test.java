package cup150;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class c2_5Test {
	Node op1;
	Node op2;

	@Before
	public void setUp() throws Exception {
		op1=new Node<Integer>(0);		
		op1.append(5);
		op1.append(2);
		
		op2=new Node<Integer>(0);
		op2.append(5);
		op2.append(2);
		
	}

	@Test
	public void test() {
		Node r=c2_5.addRecr(op1, op2,0);
		Node.print(r);
		
	}

}
