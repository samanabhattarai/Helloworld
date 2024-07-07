package com.inheritence;

public class StaticInheritenceDemo {

	public static void main(String[] args) {
		
		Dance dnc = new Move();
		dnc.show();
		dnc.move();
		Dance dance = new Cartwheel();
		dance.show();
		dance.move();
		Cartwheel ct =new Cartwheel();
		ct.show();

	}

}

class Dance{
	
	public static void show() {//with the static method in inheritance , method is inherited to child class but not overridden
		
		System.out.println("classical dance ");
	}
	public void move()
	{
		System.out.println("classical move");
	}
}

class Move extends Dance{
	
	public static void show() {
		
		System.out.println("Dance move");
		//Dance.show();
	}
	
	public void move() {
		System.out.println("Hands move");
		
	}
}

class Cartwheel extends Dance{
	
	public static void show() {
		
		System.out.println("Cartwheel dance");
	}
	
	public void move() {
		System.out.println("cartwheel move");
	}
}

