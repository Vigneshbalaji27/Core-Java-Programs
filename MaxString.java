package com.vikki.java8;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxString {
    public static Character getMaxOccurringChar(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        return input.chars() // 1. Creates an IntStream of character codes
                .mapToObj(c -> (char) c) // 2. Converts int to Character objects
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // 3. Groups and counts
                .entrySet()
                .stream() // 4. Creates a stream of the Map entries
                .max(Map.Entry.comparingByValue()) // 5. Finds the entry with the maximum count
                .map(Map.Entry::getKey) // 6. Extracts the character key
                .orElseThrow(); // 7. Throws exception if string was somehow empty
  
    
    }
    
    public static void main(String[] args) {
		
    	
    	String s="gfejfkefjgfkgbjfuisvcsnbvfvhjcbksvcjfsdfdsdscv";
    	char max=getMaxOccurringChar(s);
    	System.out.println("Max is "+max +"times");
        Optional<Map.Entry<Character, Long>> maxEntry = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        // 2. Output the result safely
        maxEntry.ifPresent(entry -> {
            System.out.println("Maximum Occurring Character: '" + entry.getKey() + "'");
            System.out.println("Occurrence Count: " + entry.getValue());
        });
    	
	}
}

