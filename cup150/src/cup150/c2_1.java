package cup150;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

public class c2_1 {
	static Node remove(Node list){
		        Node head=list;
				HashSet<Character> set=new HashSet<Character> ();
				Node<Character> looper=list;
				set.add(looper.v);
				while(looper.next!=null){
					if(set.add(looper.next.v)){
						looper=looper.next;
						
					}else{
						looper.next=looper.next.next;
						//looper has new next, test it again
					}
				}
				return head;
			}
		
		static void noBuff(Node<Character> list){
			while(list.next!=null){
				Node previous=list;
				Node looper=list.next;
				Character current=list.v;
				while(looper!=null){
					if(looper.v.equals(current)){
						previous.next=looper.next;
						looper=looper.next;
					}else{
						previous=previous.next;
						looper=looper.next;
					}
				}
				list=list.next;
			}
		}
			public static void noBuff2(Node<Character> list){
				System.out.println("hello");
				while(list.next!=null){
					Node looper=list;
					Character current=list.v;
					while(looper.next!=null){
						if(looper.next.v.equals(current)){
							looper.next=looper.next.next;
						}else{
							looper=looper.next;
						}
					}
					list=list.next;
				}
		}
	
	

}
