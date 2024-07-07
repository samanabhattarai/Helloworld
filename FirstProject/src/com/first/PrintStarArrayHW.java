package com.first;

/*
 * 1. Print the star in below shapes
	*****
	****
	***
	**
	*
2. 
	*
	**
	***
	****
	*****
	******
	****
	***
	**
	*
3. 
		*
	   ***
	  *****
	 *******
4.
		*
	   ***
	  *****
	 *******
	  *****
	   ***
		*
		
5. 
	*       *
	**     **
	***   ***
	**** ****
	**********/

public class PrintStarArrayHW {

	public static void main(String[] args) {
		
		for(int i = 5; i >= 1; i--) {
			
			//for space
			for(int spc=1; spc<=1;spc++) {
				System.out.print(" ");
			}
			
			
			for(int j = 1; j <= i; j++) {
				 
				System.out.print("*");
				
			}
			
			System.out.println(" ");
		}
		
		System.out.println("-------------------------------------------");
		
		
		
		for(int i = 1; i<= 5; i++) {
			
			for(int s=1; s<=5; s++) 
			{
				System.out.print(" ");
				
			}
			for( int j=2; j<= i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println("*");
		}
		
		for(int i = 5; i >= 1; i--) {
			
			for(int spc=1; spc<=5;spc++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i-1; j++) {
				 
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
		
		System.out.println("-------------------------------------------------");
		
		/*
		 
		*
	   ***
	  *****
	 ********
	 
	 */
		
		for(int i= 1;i<=5;i++) {
			
			for(int sp=i;sp<=5;sp++) {
				
				

				System.out.print(" ");
				
				
			}
			
			for(int j=2;j<=i*2-1;j++) {
				
			

				System.out.print("*");
				
				
			}
			
			System.out.println("* ");
		}
		
			System.out.println("----------------------------------------------------");
		
		for(int i= 1;i<=5;i++) {
			
			for(int sp=i;sp<=5;sp++) {
				
				

				System.out.print(" ");
				
				}
			
			for(int j=2;j<=i*2-1;j++) {
				
			
                 System.out.print("*");
				
				}
			
			System.out.println("*");
			
		}
		
		for(int i = 4;i>=1;i--) {
			
               for(int sp=i;sp<=5;sp++) {
				
				System.out.print(" ");
				
				}
			
			for(int j=1;j <= 2*i-1;j++) {
				
				System.out.print("*");
				
				}
			
			System.out.println(" ");
		}
		
		System.out.println("............................................");
		
		
		for(int i = 1;i<=5; i++) {
			for(int j=1;j<=i; j++)
			{
				System.out.print("#");
			}
			System.out.println(" ");
		     
		}
		
		for(int i = 1;i<=5; i++) {
			
	       for(int sp=i;sp<=5;sp++) {
				
				System.out.print(" ");
				}
			for(int j=1;j<=i; j++)
			{
				System.out.print("#");
			}
			System.out.println(" ");
		}
		for(int i = 1;i<=5; i++) {
			for(int j=1;j<=i; j++)
			{
				System.out.print("#");
			}
			System.out.println(" ");
		     
		}
		
		for(int i = 1;i<=5; i++) {
			
	       for(int sp=i;sp<=5;sp++) {
				
				System.out.print(" ");
				}
			for(int j=1;j<=i; j++)
			{
				System.out.print("#");
			}
			System.out.println(" ");
		}
		
			
		


	
	}
}


	
