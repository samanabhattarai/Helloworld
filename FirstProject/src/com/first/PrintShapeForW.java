package com.first;
/*
0    01234501234    0
01   01234  0123   01
012  0123    012  012
0123 012      01 0123
0123401        001234
 
 */
public class PrintShapeForW {
	
	
static int n = 5;

	public static void main(String[] args) {
		
	
	
		    for (int i = 0; i < n; i++) 
		    {
		        shape(i + 1);
		        space(n - i - 1);
		        shape(n - i + 1);
		        space(2 * i);
		        shape(n - i);
		        space(n - i - 1);
		        shape(i + 1);
		 
		        System.out.println();
		    
		}
	}
	
	
		public static void shape(int n) {
		for (int i = 0; i < n; i++)
	    System.out.print(i);
	}
	
	
	private static void space(int n)
	{
	    for (int i = 0; i < n; i++)
	    System.out.print(" ");
	}

	}
