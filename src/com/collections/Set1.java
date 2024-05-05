package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<Integer>();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		
		System.out.println(s);
		
		System.out.println(s.contains(2));
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.remove(3));
		System.out.println(s);
		
		System.out.println(s.getClass());
		
//		for (Integer oneafterone : s) {
//		System.out.println(oneafterone);	
//		}
		
		//Set not work with for loop, since no s.get method available for set.
//		for (int i = 0; i < s.size(); i++) {
//			System.out.println(s);
//		}
		
	}
}
