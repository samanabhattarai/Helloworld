package com.first;

public class DemoStaticInnerClassTest {

	public static void main(String[] args) {
		
		InnerClass.InnerStaticClass inner = new InnerClass.InnerStaticClass();
		//int k = inner.j =600;
		//System.out.println(k);//600
		
		inner.innerShow();
		
		/*InnerClass innerclass = new InnerClass();
		inner.innerShowOuter();//through compile error*/

	}

}

class InnerClass{
	
	int i;
	
	static class InnerStaticClass{
		
		int j =50;
		
		
		public void innerShow() {
			

			InnerStaticClass innerstatic = new InnerStaticClass();
			innerstatic.j =34;
			
			System.out.println("method inside inner class " + innerstatic.j);
		}
		
	}
	
	
	public void innerShowOuter() {
		
		i=100;
		
		System.out.println("method inside outer class " + i);
	}
	
	
	
}
