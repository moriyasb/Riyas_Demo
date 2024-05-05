package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Iterator1 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		
		Iterator<Integer> iterator = l.iterator();
		
		while(iterator.hasNext())
		{
			//System.out.println(iterator.next());
			//we can write above in below way
			Integer next = iterator.next(); //Assigning as next variable using Integer Wrapper class
			System.out.println(next);
		}
}
}
