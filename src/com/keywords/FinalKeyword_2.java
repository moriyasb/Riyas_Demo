package com.keywords;

public class FinalKeyword_2 extends FinalKeyword {

	//sample2 method declared as final in parent class so compile time error prompts
	//To avoid this i need to remove the final keyword from parent class method
	
	public void sample2() {
		System.out.println("Testing overriding with final for parent class");
		}
}
