package com.vikki.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {

	 public static void main(String[] args) {
	        String sentence = "Alice is learning Java and Bob is also learning Java";
	        
	        Map<String, Long> wordCounts = Arrays.stream(
	                sentence.toLowerCase()
	                        .split("\\s")
	        ).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        
	        System.out.println(wordCounts);
	    }
}
