package com.inheritence;

public class DemoInheritence {

	public static void main(String[] args) {
		
 D d = new D();
 d.rectangle(3,4);
 E e = new E();
 e.area(2,3,4);
	}
	
	

}

class C {
	int a=6;
	public void shape() {
		int l =10,b=20;
		System.out.println("Inside the shape " +(l*b));
	}
	static{
		System.out.println("inside static class");
		
	}
}

class D extends C{
	
	public void rectangle(int l, int b) {
		
		System.out.println("Inside rectangle " + (l*b));//1
		System.out.println(this.a);//2
		super.shape();//3
		
		
	}
	
	public void shape() {
		
		System.out.println("Inside  D shape ");
	}
}

class E extends D{
	
	public void area(int l, int b, int h) {
		System.out.println(l*b*h);
		System.out.println("variable from parent class:" + super.a);//
		super.shape();//6
	}
}


