package com.first;

/*
 Write a program to print following */

public class PrintTriangle1 {

	public static void main(String[] args) {
		
	
		int n, count = 0, a, b, c;
		int sum = 0;
        System.out.print("the result of given number  from 1 to 1000:");
        
        for(int i = 1; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;

	}

	}
}
