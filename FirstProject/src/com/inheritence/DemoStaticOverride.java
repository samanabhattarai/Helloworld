package com.inheritence;

public class DemoStaticOverride {

	public static void main(String[] args) {
		
		Two two = new Two();
		two.display();
		One one = new One();
		one.display();
		one.show();
	  

	}

}

class One{
	
	public static void show()
{
		System.out.println("inside show()");
}

public void display() {
	System.out.println("inside display()");
}

}

class Two extends One {
	
	public static void show()
{
		System.out.println("inside class Two for show()");
		One.show();
}

public void display() {
	System.out.println("inside class Two for display()");
 super.display();//output from parent class
}

}
	
