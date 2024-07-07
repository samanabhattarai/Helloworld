package com.first;

public class DemoDatatypes {
	
	static int l = 4;
	static int b = 5;
	
	int count;// global variable takes the value 0 by default for initialization
	
	public static void  calArea() {
		
		//int count;
		
		int area = l*b;
		
		System.out.println("area of two given value is " + area);
		
		//System.out.println(count); //local variable cannot take default value while initializing. you nedd to provide value e.g int count=0;
	}
	

	public static void main(String[] args) {
		
		int h = 3;
		
		int cube = l*b*h;
		System.out.println("cube of given value is " + cube);
		calArea();

	}

}
