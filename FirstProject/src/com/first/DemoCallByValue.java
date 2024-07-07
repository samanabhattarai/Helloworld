package com.first;

public class DemoCallByValue {

	static int a = 10;
	static int b =20;
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		int c=a;
		System.out.println(c);//10
		//int d =13;
		c=30;
		
		
		System.out.println("value of c is" + c);//30
		//System.out.println(d);
		//System.out.println(a);
		//System.out.println(b);

		System.out.println("value of a is" + a);//the original value is same only copy of it get change in call by value.
	}

}


