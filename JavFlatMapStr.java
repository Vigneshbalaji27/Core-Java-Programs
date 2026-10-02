package com.vikki.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavFlatMapStr {

	
	public static void main(String[] args) {
		
		List<List<Integer>> num= new ArrayList<List<Integer>>();
		
		num.add(Arrays.asList(23,556));
		num.add(Arrays.asList(12,456));
		num.add(Arrays.asList(54767,686));
		num.add(Arrays.asList(689,59797));
		num.add(Arrays.asList(2312,54687));
		
		System.out.println("List of list "+num);
		
		List<Integer> flatList=num.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
		
		System.out.println("After flat List "+flatList);
		
		List<Integer> evenNum=flatList.stream().filter(n -> n%2==0).collect(Collectors.toList());
		
		System.out.println("Even num "+evenNum);
		
		//Collect only even number
		List<List<Integer>> nested = Arrays.asList(
		    Arrays.asList(1, 2, 3),
		    Arrays.asList(4, 5, 6),
		    Arrays.asList(7, 8)
		);
		
		List<Integer> even=nested.stream().flatMap(l ->l.stream()).filter(n->n%2==0).toList();
		System.out.println("Even "+even);
	}
}
