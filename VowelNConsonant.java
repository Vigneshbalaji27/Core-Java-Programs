package com.vikki.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class VowelNConsonant {
	
	public static void main(String[] args) {
		
		String s="VigneshBalajiKumar";
				
		Long vowels=s.toLowerCase().chars().filter(ch-> "aeiou".indexOf(ch)!=-1).count();
		System.out.println("Vowels = "+vowels);
		
		Long consonants=s.toLowerCase().chars().filter(ch -> ch>='a' && ch<='z')
				.filter(ch -> "aeiou".indexOf(ch)==-1).count();
		System.out.println("consonants = "+consonants);
	}

}
