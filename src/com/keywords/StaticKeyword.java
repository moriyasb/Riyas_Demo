package com.keywords;

public class StaticKeyword {
	
	static int x = 100;
	
	public static void test1() {
		System.out.println("This is static method");
		
	}
	public static void main(String[] args) {
		System.out.println(x); //need to declare x as static
		test1(); //no need to create object for the method, since its declared as static method
	}
}
