package com.first;

//	Write a program to check this. (++ ,--) (increment &decrement )

public class IncrementDecrHw {

	public static void main(String[] args) {

		int x = 10;
		int y= 5;
		
		
		System.out.println("prefix increment ++x is " + ++x);//output is 6
		System.out.println("post increment x++ is " + (x++));//output is first (5)(first check expression)
		System.out.println(x);//  and increment the value later(6+1)=7
		
		System.out.println("prefix decrement --y is " + --y);//output is 4
		System.out.println("post decrement y-- is " + y--);//output is 4(check expression first) gives y =4
		System.out.println(y);//3 (4-1 =3)
		

	}

}
