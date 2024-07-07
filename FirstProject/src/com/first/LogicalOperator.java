package com.first;

public class LogicalOperator {

	public static void main(String[] args) {
	
		/* teacher: int a=10 , b=20;
		if(a>b & a++ > 5 ) { //false 10>11 => a=a+1
			System.out.println("inside if ");
		} else {
			System.out.println("inside else");
		}
		System.out.println("Value of a "+a); // 11		
		a=10;
		if( !(a>b) && a++ > 5 && b>a) { //false 10>11 
			System.out.println("inside if for && ");
		} else {
			System.out.println("inside else for &&");
		}
		System.out.println("Value of b "+b); // 10
	*/
		
		int x = 20; int y = 30;
		
		//for &, although statement is wrong, evaluation is happening, so the value of x-- = 20 then gets decremented x =20 -1 =19
		if(x>y & x-- < y) { //(x>y)is false and x-- <y is true
			
			System.out.println( " inside if ");
		}
		 else {
			System.out.println("inside else ");//else output
		 }
		 
	  System.out.println("the value of x = " + x);//19
	  
	  
	  //for &&, as soon as the first statement is wrong, it will not perform calculation on second statement, 
	  //so value of x is also 19 here not(19 -1)=20
	if((x>y) && x-- < y) { //(x>y)is false and x-- <y is true
			
			System.out.println( " inside if ");
		}
		 else {
			System.out.println("inside else ");//else output
		 }

	 System.out.println("the value of x = " + x);//19

     x=20;
	//for x=20
	if(!(x>y) && x-- < y) { //(x>y)is false and x-- <y is true
		
		System.out.println( " inside if ");//if output
	}
	 else {
		System.out.println("inside else ");
	 }

 System.out.println("the value of x = " + x);//19
}

}
