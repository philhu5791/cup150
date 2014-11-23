package cup150;

public class c2_6 {
	static Node find(Node head){
		Node mover1=head;
		Node mover2=head;
		while(mover1!=null&&mover2!=null){
			mover1=mover1.next.next;
			mover2=mover2.next;
			if(mover1==mover2){
				break;
			}
		}
		mover1=head;
		while(mover1!=mover2){
			mover1=mover1.next;
			mover2=mover2.next;
		}
		return mover1;
	}

}
