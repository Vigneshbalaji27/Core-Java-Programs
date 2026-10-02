package com.vikki.java8;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		
		String[] str=new String[15];
		str[2]="Welcome to USA";
		System.out.println("Str is "+str[2]);
		
		Optional<String> checkNull=Optional.ofNullable(str[2]);
		checkNull.ifPresent(System.out::println);
		System.out.println(checkNull.get());
	}

}
