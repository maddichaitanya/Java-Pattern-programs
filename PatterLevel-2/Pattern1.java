class Pattern1{
	public static void main(String args[]){
		

/*
			1	2	3	4	5
				2	3	4	5
					3	4	5
						4	5
							5
						4	5
					3	4	5		
				2	3	4	5
			1	2	3	4	5
	
*/

		int n=5;
		for(int i=1;i<n*2;i++){
			if(i<=n){
				for(int j=1;j<=n;j++){
					if(i<=j)
						System.out.print(j);
					else
						System.out.print(" ");
				}
			}
			else {
				for(int j=1;j<=n;j++){
					if(j>=((n*2)-i))
						System.out.print(j);	
					else 
						System.out.print(" ");
				}
			}
			System.out.println();
		}

/*
	1	2	3	4	5
	1	2	3	4
	1	2	3
	1	2	
	1	
	1	2	
	1	2	3
	1	2	3	4
	1	2	3	4	5
*/

		System.out.println();		
		System.out.println();

		for(int i=1;i<n*2;i++){
			if(i<=n){
				for(int j=1;j<=n-i+1;j++)
					System.out.print(j);
			}
			else {	
				for(int j=1;j<=(i-n)+1;j++)
					System.out.print(j);
			}
			System.out.println();
		}
		
/*
	1 
	1	2
	1	2	3
	1	2	3	4
	1	2	3	4	5
	1	2	3	4	
	1	2	3	
	1	2	
	1	

*/

		System.out.println();
		System.out.println();

		for(int i=1;i<=n*2;i++){
			if(i<=n){
				for(int j=1;j<=i;j++)
					System.out.print(j);
			}
			else {
				for(int j=1;j<=(n*2)-i;j++){
					System.out.print(j);
				}
			}
			System.out.println();
		}

/*
		
			1
		       12
		      123
		     1234
		    12345
		     1234
		      123
		       12
			1
*/	


			for(int i=1;i<n*2;i++){
				if(i<=n){
					int a=1;
					for(int j=1;j<=n;j++){
						if(j>n-i){
							System.out.print(a);
							a++;
						}
						else 
							System.out.print(" ");
						}
				}
				else {
					int b=1;
					for(int j=1;j<=n;j++){
						if(i-n+1>j){
							System.out.print(" ");
							}
						else {
							System.out.print(b);
							b++;
						}
					}
				}

					System.out.println();
			}
		
	}
}