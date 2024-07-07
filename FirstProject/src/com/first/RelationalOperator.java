package com.first;

public class RelationalOperator {

	public static void main(String[] args) {
		
		/* teacher:
		 
		int a= 10 , b=10;
		System.out.println(a==b); // true
		a++; //
		System.out.println(a!=b); // true
		System.out.println(a<b); // false
		System.out.println(a<=b); // true
	
*/
		
		int x =30; int y=30;
		
		System.out.println(x++ == y);//true
		System.out.println(x == y);//false (after evaluation->incremen1 by 1 x=31)
		System.out.println(x != y);//true
		System.out.println(x-- >= x++);//x-- is 31 and x++ is 31// true
		System.out.println( --x > 20);// true
		

	}

}
