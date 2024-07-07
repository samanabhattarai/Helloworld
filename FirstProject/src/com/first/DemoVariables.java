package com.first;

public class DemoVariables {

	public static void main(String[] args) {
	
		System.out.println("Sum of num1 and num2 is:" + num3);
		System.out.println(("division of two given number is "+ c));
		System.out.println("sum of m and n is:" + p);
		
		System.out.println("Sum of varInt and varDouble is:" + varResult);

		System.out.println("Sum of varInt and varDouble is:" + varRes);
		System.out.println("Sum of varInt and varDouble is:" + varRes1);


	}
	
	//Add two numbers with different datatypes:
	
	static byte num1 = 12;
	static int num2 = 4;
	
	//float + int
	static float m = 10.2f;
	static int n = 12;
	static float p = m+n;
	
	//float +decimal
	static int varInt = 33;
	static double varDouble = 23.333;
	
	//explicit casting(manually casting)
	static int varResult = (int)(varInt + varDouble);
	
	//explicit casting
	static double varRes =varInt + varDouble; //result is 56.333
	static double varRes1 = (int)(varInt + varDouble); //result is 56.0
	
	//explicit type casting (byte +int-> int)
	static byte num3 = (byte)(num1+num2);
	
	//divide two numbers with different datatypes:
	
	static int a = 28;
	static int b = 3;
	
	//static float c = a/b; //9.0
	
	//explicit type casting 
	static float c = (float)a/b; //9.333333
	
	
	
	

}
