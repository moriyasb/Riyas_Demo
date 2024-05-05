package com.jumpingstatements;

public class Break_Continue {

	
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			
			if(i==4)
			{
				break; //Terminate loop once the condition satisfies
			}
			System.out.println(i);
		}
		System.out.println();
		
		for (int i = 1; i < 6; i++) {
			if (i==1 || i ==3) {
				continue; //Skip the particular iteration in the loop
			}
			System.out.println(i);
		}
	}
}
