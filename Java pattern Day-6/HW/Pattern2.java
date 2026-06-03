class Pattern2{
	public static void main(String[] args){
		int n=5;
		/*
		*
		**
		***
		****
		*****

		*/

		for(int i=1;i<=n;i++){
			for(int j=i;j>=1;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		//or
		for(int i=n;i>=1;i--){
			for(int j=i;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		/*
			
		*/
		System.out.println();
		
		for(int i=n;i>=1;i--){
			for(int j=i;j>=1;j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//or
		System.out.println();

		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}