package com.first;

/*Calculate how many times a digit D occurs in the
number N. For ex:- 121 -&gt; Occurrence of 1 is two times.
So the output will be 2.*/

/*write a program for prime number*/

public class DemoTest {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			for(int j=2;j<=100;j++)
			if(i%j==0)
			System.out.println(i);
		}

	}

}
