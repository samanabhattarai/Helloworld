package com.first;

/*
Write a program to print Fibonacci series of n terms where n =100
 */

public class FibonacciTest {

	public static void main(String[] args) {
		
		
		
		int n = 100;
		
	     
        int  n1 = 0;
        int n2 = 1;
         
           System.out.print("The first " + n + " Fibonacci numbers are: ");
           
           System.out.print(n1 + " " + n2);
           
           for (int i = 1; i<=n-2; ++i)
           {
               int sum = n1 + n2;
               n1 = n2;
               n2 = sum;
               System.out.print(" " + sum);
           }
 
   }

	}

