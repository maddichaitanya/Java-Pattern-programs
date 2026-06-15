	/*
	AO FM JJ MF OA	      1 15 	6 13 	10 10 	13 6	15 1
	   BN GK KG NB	           	2 14	7  11	11 7	14 2
	      CL HH LC				3  12   8  8    12 3
		 DI ID					4  9    9  4
		    EE						5  5
*/

class DoubleCounter{
	public static void main(String[] args){
		int n=5;
		int c1=1;	
		int c2=(n*(n+1))/2;
		for(int i=1;i<=n;i++){
			int c11=c1;
			int c12=c2;
			for(int j=1;j<i;j++){
				System.out.print("\t");
			}
			for(int j=n,k=i;j>=i;j--,k++){	
				System.out.print((char)(64+c11)+""+(char)(64+c12)+"\t");
				c11+=j;
				c12-=k+1;
			}
			System.out.println();
			c1++;
			c2-=i;
		}

		System.out.println();

		c1=(n*(n+1))/2;
		c2=c1;
		for(int i=1;i<=n;i++){
			int c11=c1;
			int c12=c2;
			for(int j=i,k=n;j<=n;j++,k--){
				System.out.print((char)(64+c11)+""+(char)(64+c12)+"\t");
				c11-=j;
				c12-=k;	
			}
			System.out.println();
			c1-=i+1;
			c2--;
			
		}
	}
}