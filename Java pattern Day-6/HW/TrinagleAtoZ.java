class TrinagleAtoZ{
	public static void main(String[] args){
		int n=5;
		
/* 
	A
	AB
	ABC
	ABCD
	ABCDE

*/
		 for(int i=1; i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	
/*
	AAAAA
	BBBB
	CCC
	BB
	A
*/
		System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
		System.out.println();
	
/*
	e
	dd
	ccc
	bbbb
	aaaaa	

*/		

		for(int i=5;i>=1;i--){
			for(int j=i;j<=n;j++){
				System.out.print((char)(i+96));
			}
			System.out.println();
		}
		
/*
	eeeee
	dddd
	ccc
	bb
	a
*/

		System.out.println();
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print((char)(i+96));
			}
			System.out.println();
		}
	

/*
	A
	AB
	ABC
	ABCD
	ABCDE

*/
		System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)(j+64));
			}
			System.out.println();
		}

/*
	ABCDE
	ABCD
	ABC
	AB
	A
*/
		System.out.println();
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){	
				System.out.print((char)(j+64));
			}
			System.out.println();
		}

/*
	a
	ba
	cba
	dcba
	edcba

*/
		System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=i;j>=1;j--){
				System.out.print((char)(j+96));
			}
			System.out.println();
		}

/*

*/
		System.out.println();	
	}
}	
