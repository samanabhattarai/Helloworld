package com.inheritence;

public class DemoInheritenceConstructor {

	public static void main(String[] args) {
	
		N n = new N();
		
		
		n.show();
		
		n.display(2, 3);

	}

}

class M {

	int y=3;
	
	public M(int y) {
		this.y =y;
		
		System.out.println("inside constructor M " + y);//1
	}
	
	public void show() {
		
		int a =10; int b=20;
		
		System.out.println("sum of a and b is " + (a+b));//3
	}
}

class N extends M{
      
       N(){
	 
	 super(10);
	 System.out.println("inside constructor N");//2
	
}

	public void display(int x, int y) {
		
		System.out.println("multiplication of two number is " +(x*y));//4
	}
	
	
}
