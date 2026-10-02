package com.vikki.java8;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecHighChar {
	
	public static void main(String[] args) {
		
		  String s="Java Programming Language";

		  Optional<Character> sec = s.chars()
	                .mapToObj(c -> (char) c) // 1. Convert IntStream to Stream<Character>
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // 2. Map of char -> count
	                .entrySet()
	                .stream()
	                .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))// 3. Stream the map entries
	                //.sorted(Map.Entry.<Character, Long>comparingByValue().reversed()) // 4. Sort descending by count
	                .skip(1) // 5. Skip the most frequent character
	                .map(Map.Entry::getKey) // 6. Extract the character
	                .findFirst(); // 7. Get the second element

	            
	        System.out.println("Second "+sec);
	}

}
