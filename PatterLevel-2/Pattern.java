class Pattern{
	public static void main(String[] args){
		int n=5;

/*
	*
	**
	***
	****
	*****
	****	
	***
	**
	*
*/

		for(int i=1;i<n*2;i++){
			if(i<=n){
				for(int j=i;j>=1;j--)
					System.out.print("*");	
			}
			else {
				for(int j=i;j<n*2;j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println();
/*
******
*****
***
**
*
** 
***
****
*****

*/

		for(int i=1;i<=n*2;i++){
			if(i<=n){
				for(int j=i;j<=n;j++){
					System.out.print("*");
				}	
			}
			else{
				for(int j=i;j>n;j--){
					System.out.print("*");
				}
   			}
			System.out.println();
		}

		System.out.println();
/*
	1
	2	2
	3	3	3
	4	4	4	4
	5	5	5	5	5
	4	4	4	4	
	3	3	3	
	2	2	
	1

*/

		for(int i=1;i<=n*2;i++){
			if(i<=n){
				for(int j=i;j>=1;j--)
					System.out.print(i);
			}
			else{
				for(int j=i;j<n*2;j++){
					System.out.print((n*2)-i);
				}
			}
			System.out.println();
		}
		
		System.out.println();

/*
	5	5	5	5	5
	4	4	4	4
	3	3	3	
	2	2
	1
	2	2
	3	3	3
	4	4	4	4
	5	5	5	5	5		

*/
		
		for(int i=1;i<=n*2;i++){
			if(i<=n){
				for(int j=i;j<=n;j++)
					System.out.print(n-i+1);
			}
			else{
				for(int j=i;j<n*2;j++)
					System.out.print(i-n+1);
			}
			System.out.println();
		}
	}	
}