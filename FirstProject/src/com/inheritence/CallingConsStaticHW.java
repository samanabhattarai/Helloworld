package com.inheritence;

/* 
 * Write a program to show calling and execution
sequence when constructor, static , non-static
init blocks are used with parent and child class
(A=>=>C).
*/

public class CallingConsStaticHW {

	public static void main(String[] args) {
		
		X x =new Y(3,4);
		int m = x.display(3, 1);
		System.out.println("multiplication of two given number is " + m);
		x.show();// static method of class can be inherited but cannot be overridden
		
		System.out.println("..................");
		
		Y y =new Z(4.6f,8.2f);
		y.show();
		int s = y.display(10, 2);
		System.out.println("multiplictaion " + s);
		
		System.out.println("..........");
		
		Z z = new Z(3.4f,4.5f);
		z.show();
		int n = z.display(5, 4);
		System.out.println("return " + n);
		
		
	}
}

class X{
	
	X(){
		System.out.println("inside constructor");
	}
	
	public static void show() {//static
		
		System.out.println("inside class X for show()");
	}
	
	public int display(int a, int b)
	{
		System.out.println("inside parent class");
		return (a*b);
	}
}

class Y extends X{
	int x,y;
	
	Y(int x,int y){
		
		super();
		this.x=x;
		this.y=y;
		
		}
	
	public static void show() {
		
		
		System.out.println("inside class Y for show()");
	}
	
	
	public int display(int a, int b) {
		return (a*b);
	}
	
	
}

class Z extends Y{
	
	public Z(float m, float n){
		
		super(2,3);//calling the constructor from immediate parent class i.e B
		//super();//cannot call two constructor, ambuguity 
		
		System.out.println("inside parameterized constructor " + (m*n));
		
		}
	
public static void show() {
	
       Y.show();
		
		System.out.println("inside class Z for show()");
	}
	
	
	public int display(int a, int b) {
		return (a*b);
	}
}




