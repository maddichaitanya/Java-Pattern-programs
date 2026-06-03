class Pattern{

	public static void main(String[] args){
		int n=5;
		
		/*
		AAAAA
		BBBBB
		CCCCC
		DDDDD
		EEEEE

		*/

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print((char)(64+i));
			}
			System.out.println();
		}
		/*
		EEEEE
		DDDDD
		CCCCC
		BBBBB
		AAAAA
			
		*/

		System.out.println();
		
		for(int i=1;i<=n;i++){
			for(int j=n;j>=1;j--){
				System.out.print((char)(64+j));
			}
			System.out.println();
		}

		System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print((char)(96+j));
			}
			System.out.println();
		}

		/*	
		edcba
		edcba
		edcba
		edcba
		edcba
		*/
		System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=n;j>=1;j--){
				System.out.print((char)(96+j));
			}
			System.out.println();
		}
						
	}
}