package com.keywords;

public class FinalKeyword {

	final int a = 20;
	public void sample1() {
		//a++; 
		//a=100;
		//we can't increment or change value of 'a' since its declared as final
		System.out.println(a);
	}
	
	//declare final for below method and accessing in child class 
	//to see if overriding not accepted in final method
	//i.e. public final void sample2()
	public void sample2() {
		System.out.println("Testing overriding concept in final");
	}
	
	public static void main(String[] args) {
		FinalKeyword f = new FinalKeyword();
		f.sample1();
	}
}
