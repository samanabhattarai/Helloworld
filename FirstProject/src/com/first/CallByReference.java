package com.first;

public class CallByReference {
	

	

	public static void main(String[] args) {
		
		int c = 5;
		int d = c;
		d =6;
		System.out.println(c);
		System.out.println(d);//call by value original value is not changed, only copy of it.

		CallByRef ref = new CallByRef();
		System.out.println(ref);
		System.out.println(ref.a);
		System.out.println(ref.b);
		ref.a=10;
		CallByRef der;
		der = ref;
		der.a=20;
		
		System.out.println(der);
		System.out.println(ref);
		System.out.println(der.a);
		System.out.println(ref.a);//call by reefrence the value to the refernce is changed then the value is also changed fro both original value.
		
	}

}


class CallByRef{
	
	 int a;
	float b;
	
}
