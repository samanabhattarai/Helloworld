package com.first;

public class SwitchDemo {
	
	//static int j;

	public static void main(String[] args) {

	
		int j=0;
		
		int num =  (int)(Math.random()*10);
		
		System.out.println("random value is " +num);
		
		switch(num) {
		
		case 1:
			System.out.println("print " + num);
			j=100;
			break;
		
		
		case 2:
			System.out.println("print" + num);
			j=200;
			//break;
			
		case 3:
			System.out.println("print " + num);
			j=300;
			//break;
			
		case 4:
			System.out.println("print " + num);
			j=400;
		//break;
			
			
		case 5:
			System.out.println("print " + num);
			j=450;
			//break;	
			
			default: 
				System.out.println("inside default");
				j=600;
				//break;
}
		System.out.println(j);
		
		/*char letter = 'a';
		char let = 'b';
		
		switch(letter)
		{
		case 'd':
			System.out.println("the letter is " + letter);
			let = 'b';
			break;
			
		case 'b':
			System.out.println("the letter is " + letter);
			let = 'c';
			break;
			
		case 'c':
			System.out.println("the letter is " + letter);
			let = 'd';
			break;
			
			default:
				System.out.println("none of the options has given character");
				break;
		}
		System.out.println("the value of let is character "+ let);*/
	}
}


