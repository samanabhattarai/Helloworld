package com.first;

public class DemoReturn {

	public static void main(String[] args) {
	
		 int area = calculateArea(4,5);
		 
		 if(area > 25) {
			 
			 System.out.println("area is " + area);
		 }
		 else
			 return;//// main method has void, so it won't take anything, so output is blank
		 
		 System.out.println("last line is main method");
		

	}
	
	public static int calculateArea(int l, int b) {
		
		return (l*b);
	}

}
