package com.controlstatements;

public class TypeCasting {

	public static void main(String[] args) {
				
		int a = 100; 	//narrowing
		Byte b = (byte) a;
		System.out.println(b);
		
		short c = 2938;	//widening
		int d = c;
		System.out.println(d);
		
		int e = 29850493;
		short f = (short) e; //narrowing
		System.out.println(f);
		
		float g = 190.4f; //widening
		double h = g;
		System.out.println(h);
		
		double i = 3987.4; //narrowing
		float j = (float) i;
		System.out.println(j);
		
		short k = 1000;	//narrowing
		char l =  (char) k;
		System.out.println(l);
	}
}
