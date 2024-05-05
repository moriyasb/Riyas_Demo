package com.variables;

public class variables {

	static int b = 10;
	
	public void samplemethod() {
		int a = 5;
		//local variable declaration inside method
		System.out.println(a);
	}

	//converting method to static method	
	public static void samplemethod1() {
		int c = 20;
		System.out.println(c);
	}
	public static void main(String[] args) {
		variables v = new variables();
		v.samplemethod();
		
		System.out.println(b);
		//without using as static variable i can call as syso(v.b)
		
		//can't print b without making as static variable since it is class variable

		samplemethod1();
		//other way of converting method to static method
		//for static method no need for object creation, simply we can call method
		
	}
}
