package com.keywords;

public class Class1 extends Class2{
	int a = 10;
	
	public void sample1() {
		int a= 5;
		System.out.println(a);
		System.out.println(this.a); //this refers to current class variable
		System.out.println(super.a); //super refers to parent class (Class2) variable
	}
	
	public static void main(String[] args) {
		Class1 c = new Class1();
		c.sample1();
	}
}
