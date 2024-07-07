package com.first;

public class DemoAnonymousInnerClass {

	public static void main(String[] args) {
	
		Animal animal =new Animal();
		animal.activities();
		
		Animal animals = new Animal() {
			
		
			/*now we cannot make object or instantiate object from this, it is one time object creation for anonymous inner class*/
		
			
		 public void activities() {
			 
			 System.out.println("cat says mewoo mewoo");
		 }
			 
		 
	};
	

	 animals.activities();
	 
	 Runnable runnable = new Runnable() {
		 
		 @Override
		 public void run() {
			 
			 System.out.println("inside runnable interface");
			 
		 }
	 };
	 
	 runnable.run();
	}
}

class Animal{
	
	public void activities() {
		
		System.out.println(" dog does bwaa bwaa");
	}
}

