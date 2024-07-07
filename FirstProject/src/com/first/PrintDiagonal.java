package com.first;
/*
 *   1 
    123 
   12345 
  1234567 
 123456789 
  1234567 
   12345 
    123 
     1 
     */

public class PrintDiagonal {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int sp=i;sp<=5;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++)
			{
				System.out.print(j);
			}
			System.out.println( " ");
			
		}
		
		for(int i=4; i>=1; i--)
		{
			for(int sp=i;sp<=5;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++)
			{
				System.out.print(j);
			}
			System.out.println( " ");
			
		}

	}

}
