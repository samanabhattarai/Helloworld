package com.inheritence;

public class DemoBaseAndChildClass {

	public static void main(String[] args) {
		B b =new B();
	
		b.add(1, 2);
	}

}


class A {
	
	//int z;
	
	/*public A(int z) {
		this.z =z;
		System.out.println("inside parameterized constructor");
	}*/
	
	public int multiply(int x,int y)
	{
		return x*y;
	}
	
	public Number add(float a, float b) {
		return a+b;
	}
	
}

class B extends A{
	
	//super(10);
	
	public int multiply(int m, int n) {
		
		return m*n;
	}
	
	public Integer add(int a, int b) {
	System.out.println("inside Integer return type");
	System.out.println(super.multiply(3,10));
		return a+b;
	}
}