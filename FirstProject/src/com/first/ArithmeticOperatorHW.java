package com.first;

/* c.	Write prog for all arithmetic operator */

public class ArithmeticOperatorHW {

	public static void main(String[] args) {
	
		int x = 5;
		int y = 6;
		
		int z = x+y;
		int m = x - y;
		int n= x * y;
		
		System.out.println(" the sum of two numbers x+y= " + z); //11

		System.out.println(" the subtraction of two numbers x - y= " + m); //-1

		System.out.println(" the sum of two numbers x * y= " + n); // 30
		
		System.out.println( " y%x is " + y%x);// 1
		
		System.out.println("y/x is " + y/x); // 1
		
		//pre-increment
		
		++x;//6

		System.out.println("++x is " + ++x);//output 7
		
		--x;//6
		System.out.println("--x is " + --x);//5
		
		//post increment
		
		System.out.println("x++ is " + x++);//5
		System.out.println("after expression evaluation and increment: " + x);//6
		
		System.out.println("x-- is " + x--);//6
		System.out.println("after expression evaluation and decrement: " + x);//5
		

	}

}
