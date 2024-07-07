package com.first;

public class DemoBreakAndContinue {
        
	static int i;
	public static void main(String[] args) {
	      
		for(i= 1; i<6; i++) {
			
			
			if(i>3) {
				
			continue;
				
				}
		/*	if(i<3) {
				break;
			}*/
			
			
			
		}
		System.out.println( i );
		
		System.out.println("existed from loop");
		
	
	}

}
