package cup150;

public class c1_5 {

	static String compress(String input){
		char[] inputC=input.toCharArray();
		char current=' ';
		int count=0;
		String output="";
		for(int i=0; i<inputC.length; i++){
			current=inputC[i];
			count++;
			if((i+1)!=inputC.length&&current==inputC[i+1]){
				continue;
			}else{
				output+=current;
				output+=count;
				count=0;
		}
			
		}
		if(output.length()>inputC.length){
			return input;
		}
		return output;
	}
}
