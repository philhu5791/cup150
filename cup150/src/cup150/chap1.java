package cup150;

public class chap1 {
	public static final int M=5;
	int[][] data;
	chap1(){
		data=new int[][]{
				new int[]{1,2,0,4,5},
				new int[]{1,2,3,4,5},
				new int[]{1,2,3,4,5},
				new int[]{1,0,3,4,5},
				new int[]{1,2,3,4,5},
		};
		
	}
	
	public void getZero(){
		int[] row=new int[M];
		int[] col=new int[M];
		//print origin data
		output();
		
		//check location of 0s
		int k=0;
		for(int i=0; i<M;i++){
			for(int j=0; j<M;j++){
				if(data[i][j]==0){
					row[k]=i;
					System.out.println(i);
					System.out.println(j);
					col[k]=j;
					k++;
				}
			}
		}
		//set line to be 0s
		for(int i=0; i<k;i++){
			setRowZero(row[i]);
			setColZero(col[i]);
		}
		
		//print data
		output();
	}

	private void setRowZero(int k) {
		// TODO Auto-generated method stub
		for(int i=0;i<M;i++){
			data[k][i]=0;
		}
	}

	private void setColZero(int k) {
		// TODO Auto-generated method stub
		for(int i=0;i<M;i++){
			data[i][k]=0;
		}
	}
	
	private void output(){
		for(int i=0; i<M;i++){
			for(int j=0; j<M;j++){
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
