package com.inheritence;

public class DemoIsARelation {

	public static void main(String[] args) {
		
       Car car = new Car();
       car.display();
  
       System.out.println(car instanceof Car);
       Vehicle vh = new Vehicle();
       System.out.println(vh instanceof Vehicle);
       BMW bm =new BMW();
       bm.type();
       System.out.println(bm instanceof BMW);
		
	}

}

class Vehicle {
	
	public void show() {
		
		System.out.println("Inside class vehicle ");
	}
}

class Car extends Vehicle{
	
	public void display() {
		
		System.out.println("Inside class car");
	}
}

class BMW extends Car {
	
	public void type() {
		System.out.println("inside type of car");
	}
}