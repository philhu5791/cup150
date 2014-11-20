
public class c1_6 {
   static  public void  setZero(int[][] input){
	   int n=input[0].length;
	   int[] c=new int[n];
	   int[] r=new int[n];
	   for(int i=0; i<n; i++){
		   for(int j=0; j<n; j++){
			   if(input[i][j]==0){
				   r[i]=1;
				   c[j]=1;
			   }
		   }
	   }
	   for(int i=0; i<n; i++){
		   if(r[i]==1){
			   setRowZero(i, input,n);
		   }
		   if(c[i]==1){
			   setColZero(i,input,n);
		   }
	   }
   }
   
   static void setRowZero(int r, int[][] in, int l){
	   for(int i=0; i<l; i++){
		   in[r][i]=0;
	   }
   }
   
   static void setColZero(int c, int[][] in, int l){
	   for(int i=0; i<l; i++){
		   in[i][c]=0;
	   }
   }
}
