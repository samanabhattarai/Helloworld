package com.inheritence;

/*i. Write a prog to make use of static and non-static block , use of
super and this keyword with reference to Inheritance.
*/

public class StaticSuperInheritenceHW {

	public static void main(String[] args) {

		P p = new P();
		
}
	
	}

class Q {
	
		Q(int x){
		System.out.println("parameterized constructor " + x );
	}
	
	static
	{
		System.out.println("inside static block");
	}
	
	{
		System.out.println("inside non-static block");
	}
}

class P extends Q{
	
	P(){
		super(5);
		System.out.println("inside constructor P");

	}
	
	
}