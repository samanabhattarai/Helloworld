package com.first;

public class DemoclassJava {
	

	

	public static void main(String[] args) {
		
		   int[] arr = new int[5];
			
			arr[0]=34;
			arr[1] =30;
			arr[2] = 40;
			arr[3]=60;
			arr[4]=65;
			
			int i=0;
			int max = arr[0];
			for( i = 0;i<arr.length-1; i++) {
				if(arr[i]>max)
					max = arr[i];
				 
				
			}
			System.out.println(max);
			
			
			

	}

}
