package com.first;

//always constructor by default helps to create object when get instantiated.
//while executing class, memory allocation happens where references variable 
//are store in memory addresses.

public class DemoConstructor {
	
	int x; int y; static int z;
	
	public DemoConstructor() {
		System.out.println("hello");
	}
	
	/*public DemoConstructor(int x, int y)
	{
       // this();
		this(x,y,z);
		this.x=x; 
		this.y=y;
		this.z = z;
	
		
		System.out.println("the value of x and y are " + x + "and "  + y);
	}
	*/
	public DemoConstructor(int x, int y,int z)
	{
		this();
		//this(x,y);//constructor call can only be first statement .
		this.x=x; 
		this.y=y;
		this.z =z;
		
		
		System.out.println("the value x,y and z  are " + x + "and "  + y + " and" + z);
	}
	
	              
	
	

	public static void main(String[] args) {

	DemoConstructor cons = new DemoConstructor();
	//DemoConstructor cons1 = new DemoConstructor(3,4);
	DemoConstructor cons2 = new DemoConstructor(5,4,3);
	
	cons2.calculateArea();
	

  
	
	
	
	}
	
	public  void calculateArea() {
		
		System.out.println(x*y);
		
	}
	

}
