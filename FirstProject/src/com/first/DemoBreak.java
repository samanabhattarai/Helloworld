package com.first;

public class DemoBreak {

	public static void main(String[] args) {
	
		int num = (int)(Math.random()*10);
		
		System.out.println(num);
		
		
		for(int i = 0; i<=5; i++) {
			
			System.out.println(i);
			
			if(i==1) {
				
				System.out.println(num);
				break;
				
			}
		}
		
		System.out.println("out of break statement");

	}

}
