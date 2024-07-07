package com.first;

/*Write a program to take three input during runtime and print all in same line and each input in separate line.*/

public class FirstPrint {

	public static void main(String[] args) {
		
		//three input during runtime and printing all in same line
	
		System.out.println("hello" + args[0]+args[1]);
		System.out.println("Hello"  + "welcome"  + "all");
		
		
		//three input during runtime and printing each input in separate line
		
		String line = System.lineSeparator();
		
		System.out.println("Hello" + line + "welcome" + line + "all");
		
		
		System.out.printf("Hello%nwelcome%nall%n");
	
		
		// alternate way
		
		System.out.println("The input line for arguments are:");
		
		System.out.println("hello");
		
		if(args.length>0) {
			
			for(String str:args) {
				System.out.println(str);
				
			}
		}

	}

}
