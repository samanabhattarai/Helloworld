package com.first;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		/*
		 * 	// Condition ? true: false

		boolean isRaining = true;
		String umColor = "Red";
		if (isRaining) {
			if (umColor == "Yel")
				System.out.println("Use yell Umbrella");
			else
				System.out.println("Use red Umbrella "+"\u00BC");
			
		} else {
			System.out.println("Do not Bring");
		}
		int a = 10, b = 10;
		System.out.println((a == b) ? "TRUE" : "FALSE");

		System.out.println(isRaining ? (umColor == "Yel" ? "Bring Yellow " : "Bring Red") : "Do Not");

	}*/
		
		int a =20;
		int b = 10;
		
		if(a!=b) {
			
			System.out.println("a is not equal to b");
		}
		
		else {
			System.out.println("a is equal to b");
		}
		
		System.out.println((a==b)? "True":"False");
		
		System.out.println((a==b)?((a!=b)? "True":"False"):"a is not equal to b");//True
		
		
		int age = 19;
		
		if(age>=18)
		{
			System.out.println("person can vote");
		}
		else {
			System.out.println("not eligible for vote");
		}
		
		System.out.println((age<18 && age>19)? ((age<18 && age>=20)?"can vote":"can't vote"):"can vote");//can vote

	}

}
