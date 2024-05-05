package com.collections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		java.util.List<Integer> a = new ArrayList<Integer>();
		java.util.List<Integer> a1 = new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(50);
		
		System.out.println("ArrayList = "+a);
		System.out.println("size = "+a.size());
		
		System.out.println("Has value 10 " + a.contains(10));
		
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.indexOf(50));
		System.out.println(a.set(4, 100));
		System.out.println(a);
		
		System.out.println(a.isEmpty());
		System.out.println(a.get(5));
		
		//System.out.println(a.removeAll(a));
		//System.out.println(a);
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(10);
		
		System.out.println(a1);
//		a1.retainAll(a);
//		System.out.println(a1);
		
//		for (int i = 0; i < a.size(); i++) {
//			System.out.println(a.get(i));
//		}
		for (Integer onebyone : a1) {
			System.out.println(onebyone);
		}
		
		
	}
}
