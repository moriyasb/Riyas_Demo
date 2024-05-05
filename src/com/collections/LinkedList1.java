package com.collections;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
	LinkedList<String> l = new LinkedList<String>();
	l.add("ABC");
	l.add("DEF");
	l.add("GHI");
	l.add("JKL");
	System.out.println(l);
	
	l.add(2, "XYZ");
	System.out.println(l);
	
	l.addFirst("abc");
	System.out.println(l);
	
	System.out.println(l.contains("xyz"));
	
	System.out.println(l.get(3));
	
	System.out.println(l.indexOf("GHI"));
	
	System.out.println(l.getLast());
	
	System.out.println(l.size());
	}
	
}
