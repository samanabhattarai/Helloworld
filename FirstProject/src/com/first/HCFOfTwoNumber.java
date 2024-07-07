package com.first;

/*
 
Write a program to calculate HCF of Two given number.

 */

public class HCFOfTwoNumber {

	public static void main(String[] args) {
		
		
		  
		   
		      int a = 20, b = 10; 
		        System.out.println("HCF of " + a + " and " + b 
		                           + " is " + hcfCalculate(a, b));
	}
	
	  static int hcfCalculate(int x, int y) 
	    { 
	       
	        if (x == 0) 
	            return y; 
	        if (y == 0) 
	            return x; 
	  
	       
	        if (x == y) 
	            return x; 
	  
	        
	        if (x > y) 
	            return hcfCalculate(x - y, y); 
	        return hcfCalculate(x, y - x); 
	    } 
}