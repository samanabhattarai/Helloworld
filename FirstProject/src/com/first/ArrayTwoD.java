package com.first;

/* Write prog for int type and use operators with 2-D array data.*/

public class ArrayTwoD {

	public static void main(String[] args) {
		
		int arr[][];
		arr= new int[2][3];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=35;
		arr[1][1]=23;
		arr[1][2]=32;
	
	
	           //Arithmetic operator
				System.out.println("sum of first two number in array is " + (arr[0][1] + arr[0][2]));//output 50
				System.out.println("subtraction of first two number in array is " + (arr[0][2]- arr[0][0]));// 20
				System.out.println("multiplication in array is " + (arr[1][2] * 2));//64
				System.out.println("division of two number in array is " + (arr[1][0]/arr[0][0]));//3
				System.out.println("remainder of two number in array is " + (arr[1][1]%7));//2
				
				//Assignment operator
				System.out.println("arr[4] += 11 is " + (arr[1][1] += 1));//output 24
				System.out.println("arr[4] %= 3 is " + (arr[0][0] %= 3));//output 1
				System.out.println("arr[4] >= 11 is " + (arr[0][0] >= arr[1][2]));//false
				
				//Comparison operator
				System.out.println("Is length of array compare to a given number true or false? " + (arr.length >= 6));// true
				System.out.println("given two number in 2D array is " + (arr[0][1] == arr[1][1])); //false
				System.out.println("given two number in greater than operator of 2D array is " + (arr[0][0] > 9)); //false
				System.out.println("given two number in is not equal to operator of 1D array is " + (arr[1][0] != arr[0][1]));//true
				System.out.println("given two number in les than or equal to operator of 1D array is " + (arr[0][1] <= arr[1][2]));//true
				
				//logical operator
		        System.out.println("(arr[1][1]%4 > 11 && arr[1][1]== 23) is  " + (arr[1][1]%4 > 11 && arr[1][1]== 23));//false
				System.out.println("(arr[1][0] != 1 || arr[1][2] > arr[1][1]) is " + (arr[1][0] != 1 || arr[1][2] > arr[1][1]));// true
				
				
				

	}

}
