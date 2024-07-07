package com.inheritence;

public class DemoObjectClass {
	
	int x =3,y=2;
	static int k =10;

	public static void main(String[] args) {
	
		DemoObjectClass cls = new DemoObjectClass();
		System.out.println(cls.x);
		System.out.println(cls.y);
		System.out.println(k);//static only access with class name
		System.out.println(cls.toString());
		System.out.println(cls.getClass());

	}
	
	public void show() {
		
		System.out.println("inside show()");
	}
	
	/*@Override
	public String toString() {
		return "DemoObjectClass [x=" + x + ", y=" + y + "]";
	}
	*/
	
	public String toString(){
		
		Class c = getClass();
		return c.getName()+"@"+Integer.toHexString(hashCode());
		
	}

}
