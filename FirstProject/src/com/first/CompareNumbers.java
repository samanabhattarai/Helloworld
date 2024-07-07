package com.first;

/*15.	Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39
*/

public class CompareNumbers {

	
	public static void main(String[] args) {
		

		int firstNumber = 25;
		int secondNumber = 39;
		
		
		if(firstNumber!=secondNumber) {
			
			System.out.println("firstNumber is not equal to secondNumber");
		}
		else {
			System.out.println("firstNumber is equal to second number");
		}
		
		System.out.println((firstNumber<secondNumber)? "true": "false");// 25<39
		
		System.out.println((firstNumber <= secondNumber)? "true": "false");//
		
		

		int a =2; 
		int b =3;
		System.out.println(2+2*3+b/a);
	
		
			
	}

}
