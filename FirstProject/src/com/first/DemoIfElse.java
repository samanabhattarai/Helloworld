package com.first;

public class DemoIfElse {

	public static void main(String[] args) {
		
		int num = (int)(Math.random())*10;
		
		System.out.println("num value is " + num);
		
		if(num>10) {
			
			System.out.println("num is greater than 10");
		}
			else 
				System.out.println("num is less than 10");
		
		if(num<9)
		{
			System.out.println("num is less than 9");
			
		}
			else
				System.out.println("print anything");
		
		
		if(true)
			if(true)
		         {
				if(false)
				{
					System.out.println("print false");
				}
				else
					System.out.println("print true");
		         }
		           
		       else 
		       {
		    	   if(true){
		    		   
		    		   System.out.println("inside else: print true");
		    	   }
		    	   else
		    		   System.out.println("print false");
		    	   
		       }
	
	     else
	    	System.out.println("print hello"); 
	
	}

}
