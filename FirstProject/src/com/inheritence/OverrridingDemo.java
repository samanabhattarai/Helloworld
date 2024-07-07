package com.inheritence;

public class OverrridingDemo {

	public static void main(String[] args) {
	
Areas ar =new Areas();
ar.area();
ar.calculatArea(2, 3);
int ars = ar.calculateTotalArea(2,3);
System.out.println("the total area is " + ars);
	}

}

class Shapes{
	
	public void area() {
		
		System.out.println("inside the area in Shapes ");
	}
	
	public void calculatArea(int l, int b) {
		
		System.out.println("inside calculate area" + (l*b));
	}


 public Number calculateTotalArea(float a , float b) {
	
	return (a*b);
}
}

class Areas extends Shapes {
	
	public void area() {
		
		System.out.println("inside area for Area");
	}
	
	public void calculateArea(int x, int y) {
		
		System.out.println("inside Area" + (x*y));
	}
	
	public Integer calculateTotalArea(int l, int b) {
		l=10;b=20;
		return (l*b);
	}
}