package com.first;

/*  Write prog for int type and use operators with 1-D array data.	 */

public class ArrayOneD {

	public static void main(String[] args) {
		
		int arr[];
		arr = new int[5];
		
		arr[0]=4;
		arr[1] =5;
		arr[2] =7;
		arr[3] = 3;
		arr[4] = 9;
		
	   //Arithmetic operator
		System.out.println("sum of first two number in array is " + (arr[0]+arr[1]));//output 9
		System.out.println("subtraction of first two number in array is " + (arr[0] - arr[1]));//-1
		System.out.println("multiplication in array is " + (arr[1] * arr[3] *arr[0]));//60
		System.out.println("division of two number in array is " + (arr[2]/arr[3]));//2
		System.out.println("remainder of two number in array is " + (arr[2] - arr[3]));//4
		
		//post and prefix increment
		System.out.println("the prefix increment of number in array is " + (++arr[0]));//5
		System.out.println("the post decrement of number in array is "+ (arr[2]--));//7
		System.out.println("the post decrement of number in array after expression evaluation is " + arr[2]);//6
		
		//Assignment operator
		System.out.println("arr[4] += 11 is " + (arr[4] += 11));//output 20
		System.out.println("arr[4] %= 3 is " + (arr[4] %= 11));//output 9
		System.out.println("arr[4] >= 11 is " + (arr[4] >= 11));//false
		
		//precedence
		//()*/%+- ((arr[3] * arr[2]/2)=10 then (arr[1] - 4)=1 then arr[2] % arr[3] = 1 = (4+1+10 -1)= 14
		System.out.println("precedence test and calaculation of number in array is " +  
		(arr[0] +(arr[1] - 4) + (arr[3] * arr[2]/2) - arr[2] % arr[3])); //14
		
		//Comparison operator
		System.out.println("given two number in equal operator of 1D array is " + (arr[0] == arr[1])); //false
		System.out.println("given two number in greater than operator of 1D array is " + (arr[4] > arr[2])); //true
		System.out.println("given two number in is not equal to operator of 1D array is " + (arr[1] != arr[3]));//true
		System.out.println("given two number in les than or equal to operator of 1D array is " + (arr[0] <= arr[1]));//true
		
		//logical operator
        System.out.println("(arr[2]%4 > 11 && arr[3]==3) is  " + (arr[2]%4 > 11 && arr[3]==3));//false
        System.out.println("(arr[2]%4 > 11 & arr[3]==3) is  " + (arr[2]%4 > 11 & arr[3]==3));//false
		System.out.println("(arr[4] != 9 || arr[3] == 3) is " + (arr[4] != 9 || arr[3] == 3));// true
		System.out.println("(arr[4] != 9 | arr[3] == 3) is " + (arr[4] != 9 | arr[3] == 3));// true
		
		
		
		

	}

}
