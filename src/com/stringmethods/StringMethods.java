package com.stringmethods;

public class StringMethods {
	public static void main(String[] args) {
		String s = "Hello welcome to Java";
		String s1 = "hELLO WELCOME TO jAVA";
		String s2 = "";
		String s4 = "   abcd   ";
		String s5 = "Hello welcome to Java";
		int in = 500;
		
		int a = s.length();
		System.out.println(a); //String Length method
		
		boolean b = s.equals("Hello welcome to Java");
		System.out.println(b); //String Equal method
		
		boolean c = s.equalsIgnoreCase(s1);
		System.out.println(c); //String Equal Ignore Case method
		
		String d = s.toUpperCase();
		String e = s1.toUpperCase();
		System.out.println(d); //String toUpperCase method
		System.out.println(e);
		
		String f = s.toLowerCase();
		System.out.println(f); //String toLowerCase method
		
		boolean g = s.startsWith("E");
		System.out.println(g); //String startsWith method
		
		boolean h = s.endsWith("a");
		System.out.println(h); //String endsWith method
		
		boolean i = s.contains("welcome");
		System.out.println(i); //String contains method
		
		int j = s.indexOf("e"); //consider first instance of the letter
		System.out.println(j); //String indexOf method
		
		int k = s.lastIndexOf('o'); //we can give as char/string
		System.out.println(k); //String lastIndexOf method
		
		char l = s.charAt(11);
		System.out.println(l); //String charAt method
		
		String m = s.replace('e', 'a'); //String replace method for character
		String n = s.replace("Java", "Selenium"); //String replace method for string
		System.out.println(m);
		System.out.println(n);
		
		String o = s.substring(6);
		System.out.println(o); //String substring method
		
		boolean p = s.isEmpty();
		boolean q = s2.isEmpty(); //String isEmpty method
		System.out.println(p);
		System.out.println(q);
		
		String r[] = s.split("e"); //String split method
		for (String splitting : r) { //need to use for each for storing and retrieving in array
			System.out.println(splitting);
		}
		
		String t = s4.trim(); //delete leading and trialing spaces
		System.out.println(t); //String trim method
		
		String u = s.concat(" "+s1);
		System.out.println(u); //String concat method
		
		String v = String.valueOf(in); //converts different datatype to string
		//String.valueOf(in) even we can give as s.valueOf(in)
		System.out.println(v); //String valueOf method
		
		int w = s.compareTo(s5); //returns +ve value if unicode of s > s2, else -ve value returns 0 if both equal
		System.out.println(w); //String compareTo method
	}
}
