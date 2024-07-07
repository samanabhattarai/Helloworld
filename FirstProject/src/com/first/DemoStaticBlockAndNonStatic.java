package com.first;

public class DemoStaticBlockAndNonStatic {

	
	 static String password = " ";
		
		static int num = 10;
		int num1 = 20;
	
	public static void main(String[] args) {
	
	
		
		System.out.println("the value of num is " + num);
		
		DemoStaticBlockAndNonStatic demoStatic = new DemoStaticBlockAndNonStatic();
		
		
	
		}
	
	public DemoStaticBlockAndNonStatic(){
		
		this(10,20);
		System.out.println("inside constructor");
		
	}
	
	public DemoStaticBlockAndNonStatic(int num, int num1){
		
		this.num = num;
		this.num1 = num1;
		
		System.out.println("inside parameterized constructor; value is " + num + " " + num1);
	}
	
	
	
	
	static {// JVM takes care of this at the time of loading and is always executed first but only once for the first time. 
		//we need this for connecting to database to java and can write all connection elements such as password,database etc and allocate in memory once it get executed.
		
		password = "dshsdhudsh345";
		
		System.out.println("static outside the block is executed only once" + " , " + "the password is: "+ password);
	}

	 {
		
		System.out.println("inside static block");
	}
	 
	 
}
