package com.exceptionhandling;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		
		try {
			String s = "ABC123";
			
			int parseint = Integer.parseInt(s); //NumberFormat Exception
			System.out.println(parseint);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finaly block of program will execure even if exception occurs before");
		}
		
		
	}
}
