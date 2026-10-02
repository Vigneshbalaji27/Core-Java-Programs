package com.vikki.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavMapStr {
	
	public static void main(String[] args) {
		
		ArrayList<String> fruit= new ArrayList<String>();
		
		 fruit.add("Apple");
	        fruit.add("mango");
	        fruit.add("pineapple");
	        fruit.add("kiwi");
	        
	        System.out.println("The fruits are "+fruit);
	        
	        
	        List<Integer> li=fruit.stream().map(n -> n.length()).collect(Collectors.toList());
	        
	        System.out.println("List by map length are "+li);
	}

}
