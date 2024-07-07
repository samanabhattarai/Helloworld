package com.first;

/* Practice with “|” , “||”  */

public class LogicalOperatorHW {

	public static void main(String[] args) {
		
		int x =4;
		int y=3;
		
		if(x++ < y | x == y ) {// 4<3 (false) 4 = 3 (false)
			System.out.println("inside if");
		}
		else
		{
			System.out.println("inside else");//output else
		}
		
		System.out.println(x);//5
		

	
	
	if(x++ < y || x != y ) {// 5<3 (false) 5 != 3 (true)
		System.out.println("inside if");//output if
	}
	else
	{
		System.out.println("inside else");
	}
	
	System.out.println(x);//6
	

}
	
	

}
