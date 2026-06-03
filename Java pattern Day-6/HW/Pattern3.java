class Pattern3{
	public static void main(String[] args){
		int n=5;

/*
	1
	22
	333
	4444
	55555

*/
		for(int i=1; i<=n;i++){
			for(int j=i;j>=1;j--){
				System.out.print(i);	
			}
			System.out.println();
		}

/*
	5
	44
	333
	2222
	11111
*/		
		System.out.println();
		for(int i=n;i>=1;i--){
			for(int j=i;j<=n;j++){
				System.out.print(i);
			}
			System.out.println();
		}

/*
	55555
	4444
	333
	22
	1
*/
		System.out.println();
		for(int i=n;i>=1;i--){
			for(int j=i;j >=1;j--){
				System.out.print(i);
			}
			System.out.println();
		}
/*
	11111
	2222
	333
	44
	5
*/
		System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=i ;j<=n;j++){
				System.out.print(i);
			}
			System.out.println();
		}

/*
	12345
	1234
	123
	12
	1	
	
*/
		System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print(j);
			}
			System.out.println();
		}

/*
	1
	12
	123
	1234
	12345
*/
		System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}

/*
	1
	21
	321
	4321
	54321
*/
		System.out.println();

		for(int i=1;i<=n;i++){
			for(int j=i;j>=1;j--){
				System.out.print(j);	
			}
			System.out.println();
		}

/*
	5
	54
	543
	5432
	54321
*/
		System.out.println();
		for(int i=n;i>=1;i--){
			for(int j=n;j>=i;j--){
				System.out.print(j);
			}
			System.out.println();
		}

/*
	5
	45
	345
	2345
	12345
*/

		System.out.println();
		for(int i=n;i>=1;i--){
			for(int j=i; j<=n;j++){
				System.out.print(j);
			}
			System.out.println();
		}
/*
	12345
	2345
	345
	45
	5

*/
		System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print(j);
			}
			System.out.println();
		}

/*
	54321
	4321
	321
	21
	1
*/
		System.out.println();
		for(int i=n;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}
/*
	54321
	5432
	543
	54
	5

*/
		System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print(j);
			}
			System.out.println();
		}

	}	
}