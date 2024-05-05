package com.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any string");
			int a = sc.nextInt();
			System.out.println(a);
		} catch (ArithmeticException e) { //Child of "Exception" parent
			e.printStackTrace();
		}
		  catch (NullPointerException e) { //Child of "Exception" parent
			e.printStackTrace();
		  }
		 catch (ArrayIndexOutOfBoundsException e) { //Child of "Exception" parent
				e.printStackTrace();
			  }
		 catch (IndexOutOfBoundsException e) { //Child of "Exception" parent
				e.printStackTrace();
			  }
		 catch (InputMismatchException e) { //Child of "Exception" parent
				e.printStackTrace(); //This block is to track and identify the error
			  }
		 catch (Exception e) { //Parent of all above Exception types
				e.printStackTrace();
			  }
		
		//System.out.println("Error has been handled");
		System.err.println("Error is highlighted with red");
	}
	
}
