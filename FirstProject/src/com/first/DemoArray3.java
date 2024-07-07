package com.first;

public class DemoArray3 {

	public static void main(String[] args) {
		
		/*
		 // 1 , 1.01 0.001
		  * 
		Number numArr[] = new Number[5];
		byte b =10;
		numArr[0]=b;
		numArr[1]=100;
		numArr[2]=10000000000.0001;
		numArr[3]=1000000000000000001L;
		numArr[4]=100.00f;
		
		System.out.println("Length of an array :"+numArr.length);
		for(int i=0 ;i< numArr.length ;i++)
			System.out.println("Value in array at index : "+i +" is "+numArr[i]);
		Integer i = 10;//new Integer(10);
		int in= (int) 10.01f;
		Object objArr[]= new Object[5];
		objArr[0] = i;
		objArr[1] = 10; // Integer in = new Integer(10);
		objArr[2] = "JAVA";
		objArr[3] =false;
		objArr[4] ='A'; // Character 
		
		for(int j=0 ;j< objArr.length ;j++)
			System.out.println("Value in array at index : "+j +" is "+objArr[j]);
			
			*/
		
		Number num[] = new Number[5];
		
		byte b = 10;
		num[0]= 12;
		num[1] =12.34f;
		num[2] = 123456.2345;
		num[3] = 122378979008988L;
		num[4] = b ;
		
		System.out.println("array length is " +num.length);
		
		for(int i =0; i<num.length;  i++) {
			
			System.out.println("value of index" +  i + "= " + num[i]);
		}
		
         Object obj[] = new Object[5];
         
         obj[0] = 'D'; 
         obj[1] = "Hi";
         obj[2] = 2345.98f;
         obj[3] = 26761735758753L;
         obj[4] = b;
         
         for(int j=0; j<obj.length;j++) {
         System.out.println( "the value of array " + j + " = " + obj[j]);
         
       
         
      }
         
         Float intg[] = new Float[2];
         intg[0]=456.23f;
         intg[1] = 123.34f;
         
         System.out.println(intg[0]);
         System.out.println(intg[1]);
         
         Integer intgr[] = new Integer[2];
         intgr[0]=10;
         intgr[1]=20;
         
         
         System.out.println(intgr[0]);
         System.out.println(intgr[1]);
         
         

	}
	
	
	


}
