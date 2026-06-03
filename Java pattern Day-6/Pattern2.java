class Pattern2{
	public static void main(String[] args){
		int n=5;
	/*
		55555
		44444
		33333
		22222
		11111
	*/

		for(int i=n;i>=1;i--){
			for(int j=1;j<=n;j++){
				System.out.print(i);
			}
			System.out.println();
		}

	/*
		11111
		22222
		33333
		44444
		55555
	*/
		for(int i=1; i<=n;i++){
			for(int j=1; j <=n;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}