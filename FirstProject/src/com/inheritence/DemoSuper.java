package com.inheritence;

public class DemoSuper {

	public static void main(String[] args) {
		
		Second sec = new Second();
		Second secs = new Second(20);
		sec.display();

	}

}

class First {
	int x=100;
	int y=25;
	
	First(){
		System.out.println("inside constructor ");//
		
	}
	First(int x){
		
		System.out.println("inside parameterized constructor " + x);//1
	}
	
	public void display() {
		
		System.out.println("inside dispaly()");
	}
}

class Second extends First {
	int y=15;
	Second(){
		
		
		super(10);
	}
	
	Second(int y){
		
		this();
		this.y=y;
		System.out.println("value of y is " +this.y);
		System.out.println("value of y from super class " + super.y);
		
	}
	
	public void display() {
		System.out.println("inside second display()");
		super.display();
		
	}
}