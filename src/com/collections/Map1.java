package com.collections;


import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new TreeMap<Integer, String>();
		
		m.put(4, "CCC");
		m.put(2, "DDD");
		m.put(3, "AAA");
		m.put(1, "BBB");
		System.out.println(m);//Ascending order
		System.out.println(m.get(1));
		System.out.println(m.size());
		
		m.put(5, null);
		System.out.println(m);
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue("DDE"));
//Converting map to entryset (from {} to []) then we can print indiviually using foreach
		Set<Entry <Integer, String>> entryset1 = m.entrySet();
		System.out.println(entryset1);
		
//To print as individual we need to convert as set so above entryset step required
		for (Entry<Integer, String> onebyone : entryset1) {
			System.out.println(onebyone.getKey());
			System.out.println(onebyone.getValue());
		}
	}
}
