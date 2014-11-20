package leecode;


public class cToI {
    public int atoi(String str) {
        char[] list=str.toCharArray();
        int positive=1;
        int length=list.length;
        int result=0;
        boolean start=false;
        for(int i=0; i<length; i++){
            if(list[i]==' '){
                if(start){
                    gerRel(result, positive);
                    
                }
                continue;
            }else if(list[i]=='-'){
                if(start){
                    gerRel(result, positive);
                }else{
                    start=true;
                    positive=-1;
                }
                
            }else if(list[i]=='+'){
                if(start){
                    gerRel(result, positive);
                }else{
                    start=true;
                }
            }else if(list[i]<'0'||list[i]>'9'){
                
                 gerRel(result, positive);
        
            }else{
                //character are numbers
                if(!start){
                    start=true;
                }
                int j=list[i]-'0';
                result=result*10+j;
            }
        }
        return gerRel(result, positive);
        
    }
    int gerRel(int i, int j){
        int rel=i*j;
        if(rel>Integer.MAX_VALUE){
            rel=Integer.MIN_VALUE;
        }else if(rel<Integer.MIN_VALUE){
            rel=Integer.MAX_VALUE;
        }
        return rel;
    }
}

