package com.first;

public class ZorbaTestSwitch {

	public static void main(String[] args) {
		
		/*
		 Given the following code fragment
		 
String[] nums = {"One", "Two", "Three", "Four", "Five", "Six", "Sev"};

for(int i = 0; i < nums.length; i++) {

   if (nums[i++].length() % 3 == 0) {
      continue;
   }
   
   System.out.println(nums[i]);
   break;
   
   What is the output? Choose one
Three	
Four	
Five	
Three
Four
Five	
No output

}*/

String[] nums = {"One", "Two", "Three", "Four", "Five", "Six", "Sev"};

for(int i = 0; i < nums.length; i++) {
	
	System.out.println("value of i is " + i);

   if (nums[i++].length() % 3 == 0) {
      continue;
   }
   
   System.out.println(nums[i]);
   break;
   

		
	

			
}
	}
}




