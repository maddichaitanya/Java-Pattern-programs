class DoubleCounter1{
	public static void main(String[] args){

/*
	AO FM JJ MF OA	      1 15   	6 13 	10 10 	13 6  	15 1
	   BN GK KG NB	             	2 14	7  11	11 7	14 2
	      CL HH LC				            3  12   8  8    12 3
		     DI ID					                4  9    9  4
		        EE						                    5  5
*/

	int n=5;
		int c1=1;	
		int c2=(n*(n+1))/2;
		for(int i=n;i>=1;i--){ 
			int c11=c1;//1
			int c12=c2;//15
			for(int j=i;j<n;j++){ 
				System.out.print("\t");
			}
			for(int j=i;j>=1;j--){ 
				System.out.print((char)(64+c11)+""+(char)(64+c12)+"\t");
				c11+=j+(n-i); 
				c12-=(n-j+2);
			}
			System.out.println();
			c1++;
			c2-=n-i+1;
		}

/*
	OO	NJ	LF	IC	EA	15 15	14 10	12 6	9 3	5 1
	MN	KI	HE	DB		13 14	11 9	8  5	4 2
	JM	GH	CD			10 13	7  8	3  4
	FL	BG				6  12	2 7
	AK					1  11		

*/

		c1=(n*(n+1))/2;
		c2=(n*(n+1))/2;

		for(int i=1;i<=n;i++){
			int c11=c1;
			int c22=c2;
			for(int j=i;j<=n;j++){//1,2,3,4,5
				System.out.print((char)(64+c11)+""+(char)(64+c22));
				System.out.print(" ");
				c11-=j;
				c22-=n-j+i;
			}
			System.out.println();
			c1-=i+1;
			c2--;
		}

/*
						EO						        5 15
					IJ	DN					       9 10	4 14
				LF	HI	CM				      12 6	8 9	3 13
			NC	KE	GH	BL		     	14 3  11 5	7 8	2 12
		OA	MB	JD	FG	AK		 15 1   13 2  10 4	6 7	1 11

*/

		c1=n;
		c2=(n*(n+1))/2; 
		
		for(int i=n;i>=1;i--){
			int c11=c1;
			int c22=c2;
			for(int j=1;j<i;j++){
				System.out.print("\t");
			}
			for(int j=i;j<=n;j++){
				System.out.print((char)(64+c11));
				System.out.print((char)(64+c22));
				System.out.print("\t");
				c11-=j;
				c22+=j-1;
			}
			System.out.println();
			c1+=i-1;
			c2;		
		}

/*
	EE DI CL BN AO		5  5	4  9	3  12	2  14	1  15
	ID HH GK FM		    9  4	8  8	7  11	6  13
	LC KG JJ		    12 3    11 7	10 10
	NB MF 			    14 2	13 6
	OA			        15 1

*/
		
		c1=n;
		c2=n;
		System.out.println();
		for(int i=1;i<=n;i++){
			int c11=c1;
			int c12=c2;
			for(int j=n;j>=i;j--){
				System.out.print(c11+" ");
				System.out.print(c12);
				System.out.print("\t");
				c11--;
				c12+=j-1;
			}
			System.out.println();
			c1+=n-i;
			c2--;
		}

/*
					OA						15 1
				JC	NB					10 3	14 2
			FF	IE	MD				6 6	9  5	13 4
		CJ	EI	HH	LG			3 10	5 9	8  8    12 7
	AO	BN	DM	GL	KK		1 15	2 14	7 13	7 12	11 11

*/	
		n=5;
		c1=(n*(n+1))/2;
		c2=1;
		System.out.println();
		for(int i=n;i>=1;i--){
			int c11=c1;
			int c22=c2;
			for(int j=1;j<i;j++){
				System.out.print("\t");
			}
			for(int j=i;j<=n;j++){
				System.out.print(c11+" ");
				System.out.print(c22);
				System.out.print("\t");
				c11+=j;
				c22--;
			}
			System.out.println();
			c1-=i;
			c2+=2;
		}

/*
	Ea	Db	Cd	Bg	Ak		5  1	4  2	3  4	2 7	1 11	
	Ic	He	Gh	Fl			9  3	8  5	7  8	6 12
	Lf	Ki	Jm				12 6	11 9	10 13
	Nj	Mn					14 10	13 14
	Oo						15 15

*/

		System.out.println();	
		c1=5;
		c2=1;
		for(int i=1;i<=n;i++){
			int c11=c1;
			int c22=c2;
			for(int j=i;j<=n;j++){
				System.out.print((char)(c11+64));
				System.out.print((char)(c22+96));
				System.out.print("\t");
				c11--;
				c22+=j;
			}
			System.out.println();
			c1+=n-i;
			c2+=i+1;
		}
	}
}
