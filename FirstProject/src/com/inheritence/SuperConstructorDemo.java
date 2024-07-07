package com.inheritence;

public class SuperConstructorDemo {

	public static void main(String[] args) {
		
		Dog dg = new Dog("poodle","white");
         dg.sound();
	

}
}

class Animal{
	
	Animal(){
		
		System.out.println("all animal move");//1
	}
	
	public void sound() {
		System.out.println("all animal makes sound ");//
	}
}

class Dog extends Animal{
	
	Dog(String type,String color){
		
		super();
		System.out.println("Dog type is " + type+ " with color " + color);//2
	}
	
	
	public void sound() {
		
		
		System.out.println("Dog says woof woof");//3
		super.sound();//4
	}
	
}
