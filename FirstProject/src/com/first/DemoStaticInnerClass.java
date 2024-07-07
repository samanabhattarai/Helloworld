package com.first;

public class DemoStaticInnerClass {
	
static int z=5;

static class InnerClass{
	
	int x,y;
	
	public void display() {
		System.out.println("show result");
		System.out.println(z);
	}
}
	

	public static void main(String[] args) {
		
DemoStaticInnerClass.InnerClass innerClass   = new DemoStaticInnerClass.InnerClass();
innerClass.display();
System.out.println(innerClass.x=10);


			

	}

}

	
