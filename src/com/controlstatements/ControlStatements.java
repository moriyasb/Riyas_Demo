package com.controlstatements;

public class ControlStatements {
	public static void main(String[] args) {
		int k = 0;
		int l = 0;
		//for loop
		for (int i = 1; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println();
		
		//nested for loop
		for (int i = 0; i <= 2; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		//while loop
		while (k<=3) {
			System.out.println(k);
			k++;
		}
		System.out.println();
		
		//Do While loop
		do {
			System.out.print(l);
			l++;
		} while (l<=3);
	}
}
