package cup150;

import java.util.HashSet;
import java.util.Set;

public class C1 {
	static boolean unique(String s){
		if(s.length()>256){
			return false;
		}
		boolean record[]=new boolean[256];
		System.out.println(s.length());
		for(int i=0;i<s.length();i++){
			int index=s.charAt(i);
			if(record[index]==true){
				return false;
			}else{
				record[index]=true;
			}
		}
		return true;
	}
	
	static boolean uniSimple(String s){
		Set<Character> set=new HashSet();
		for(int i=0; i<s.length();i++){
			if(!set.add(s.charAt(i))){
				return false;
			}
		}
		return true;
	}

}
