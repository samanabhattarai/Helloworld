package com.inheritence;

public class SuperVariableDemo {

	public static void main(String[] args) {
		
		Rectangle rct = new Rectangle();
		rct.rectangle(1, 2,3);
		

	}

}

class Shape{
	
	int l =20;
	int b=30;
	int h =10;
	

}

class Rectangle extends Shape{
	
	public void rectangle(int l, int b, int h){
		
		System.out.println("the value of rectangle is " + (super.l*super.b*super.h));
	}
}
