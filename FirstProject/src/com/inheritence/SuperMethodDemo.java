package com.inheritence;

public class SuperMethodDemo {

	public static void main(String[] args) {
		
		Square sq = new Square();
		sq.square(2,3);

	}

}

class Figure{
	
	public void show() {
		
		System.out.println("inside Shape ");
	}
}

class Square extends Figure{
	
	public void show() {
		
		System.out.println("Inside Square");
	}
	
	
	public void square(int x, int y) {
		
		System.out.println((x*y));//
		
		 super.show();//
		 show();
	}
	
	
}
