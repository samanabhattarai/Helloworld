package com.first;

/*
     12345 
     2345 
     345 
     45 
     5 
 */

public class PrintTriangle {

	public static void main(String[] args) {


		for(int i=1; i<=5; i++)
		{
			for(int sp=1;sp<=5;sp++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=5; j++)
			{
				System.out.print(j);
			}
			System.out.println( " ");
			
		}
		
	

	}

}
