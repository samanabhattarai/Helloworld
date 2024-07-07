package com.inheritence;

public class DemoMain {

	public static void main(String[] args) {

 G g = new G();
 g.display();
 
 R r = new R();
 r.show();
 
 S s =new S();
 s.display();
 s.show();
	}

}

class F {
	
	void show() {
		
		System.out.println(" inside class F");
	}
}
class G extends F{
	
	void display() {
		System.out.println("inside class G");
	}
}

class S extends G{
	
	
}

class R extends F{
	
	
	
}