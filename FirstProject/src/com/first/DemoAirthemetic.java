package com.first;

public class DemoAirthemetic {

	public static void main(String[] args) {
		
		/*
		 	int num =10;
		int num1=3;
		
		System.out.println(num%num1); // Mod operator
		 // ++
		int a=10;
		int b =10;
		
		int x=20;
		int y=30;
//		a=a+1; a++
		System.out.println(a++ +" AGAIN "+a); //a=11
		System.out.println(--x);  //19 
		System.out.println(y-- + "after "+y); // 30 -> 29
		System.out.println(b--  +" AGAIN "+b);
		
		
		int j =10;
		j+=9; // => j=j+9
		System.out.println(j); // 19
		
		int k=10;
		k%=9; // k= k%9
		System.out.println(k); // 1 
		 */
		
		int a = 10;
		int b = 3;
		int x=20;
		a++; 
		
		System.out.println(a++ + " again " + a );
		System.out.println(++b);
		System.out.println(x++ + " after " +  x);
		System.out.println(--x);//pre -> 20(21-1)
		System.out.println(x-- + " after " + x);//post-> 20 then for 2nd one (20-1) = 19
		
		
		int m =15;
		int n=2;
		
		n+=5;
		m%=2;
		
		System.out.println(n);//7
		System.out.println(m%=n);//remainder = 1
		System.out.println(n*=3);//(7*3 =21)

	}

}
