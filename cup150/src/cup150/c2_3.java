package cup150;

public class c2_3 {
	public static void removeMid(Node m){
		Node previous=null;
		while(m.next!=null){
			m.v=m.next.v;
			previous=m;
			m=m.next;
		}
		previous.next=null;
		m=null;
	}

}
