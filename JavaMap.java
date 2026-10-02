package com.vikki.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class JavaMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(101, "Ram");
		map.put(102, "Kapil");
		map.put(103, "Moulee");
		map.put(104, "Boopathi");
		map.put(105, "Kavin");
		map.put(101, "Vikki");
		
		for(Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m.getKey() + " "+m.getValue());
		}
		
		Map<String,Integer> m=new HashMap<String,Integer>();

		m.put("Raja",34);
		m.put("Ravi",31);
		m.put("ravi",35);

		List<Integer> val=new ArrayList<>(m.values());
		List<String> ke=new ArrayList<>(m.keySet());
		
		System.out.println("Val "+val);
		System.out.println("Keys "+ke);
	}

}
