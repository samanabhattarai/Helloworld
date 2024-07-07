package com.inheritence;

public class InheritenceDemo {

	public static void main(String[] args) {

 Figures fg = new Figures();
 fg.area();
 Area ar = new Area();
 ar.show();
	}
	
	Rectangles rg = new Rectangles(12,2);
	

}

class Figures{
	
	int area ; int l, b;
	
	public void shape() {
		
		System.out.println("inside shape");
	}
	Car area() {
		System.out.println("area of car is " + area);
		return null;
	}
}

class Area extends Figures{
	

	
	void show() {
		System.out.println("inside show method");
	}
	

}

class Rectangles extends Figures{
	
	int l,b;
	
	public  Rectangles(int a, int b) {
		this.l =a;
		this.b =b;
		
		System.out.println("rectangle of BMW is " + (l*b));

	}
	
	@Override
	BMW area() {
		area = l*b;
		System.out.println("inside area " +area);
		return null;
		
	}
}


