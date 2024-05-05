package com.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ListIterator2_Set {

	public static void main(String[] args) {
		
		//Set<Integer> s = new TreeSet<Integer>();
		
//		s.add(10);
//		System.out.println(s);
		
		Set<String> s = new TreeSet<String>();
		
		s.add("Mike");
		s.add("Steve");
		s.add("John");
		s.add("Alisa");
		System.out.println(s);
		
		Iterator<String> iterator = s.iterator();
		//Can't do ListOperator for TreeSet
		//ListIterator<String> iterator1 = s.list......not available
		while(iterator.hasNext())
		{
			String next = iterator.next();
			System.out.println(next);
		}
			
		}
}
