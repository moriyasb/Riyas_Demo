package com.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ListIterator1 {

	public static void main(String[] args) {
		
		List<Integer> l1 = new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		System.out.println(l1);
		
		ListIterator<Integer> lisiterator = l1.listIterator();
		//We can use both Next and previous method in list iterator
		//First hasNext then only we can use hasPrevious
		while(lisiterator.hasNext())
		{
			Integer next = lisiterator.next();
			System.out.println(next);
		}
		System.out.println("*************");
		while(lisiterator.hasPrevious())
		{
			Integer previous = lisiterator.previous();
			System.out.println(previous);
		}
	}
}
