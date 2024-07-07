package com.first;

public class DemoWhileLoop {

	//static int num = 0;
	
	public static void main(String[] args) {
		
		/* while(num<5) {
			System.out.println("hello " + num);
			
			num++;
			
		}*/
		
		int num = (int)(Math.random()*5);
		System.out.println("random number is " + num);
		
		while(num<=5) {
			
			System.out.println( "the given number is " + num);
			
			num++;
			
		}
		

	}

}
