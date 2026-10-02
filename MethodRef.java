package com.vikki.java8;

public class MethodRef {
	
	public static void sayMe() {
		System.out.println("Hello this is Vikki");
	}
	
	public static int addition(int a1,int b1) {
		return a1+b1;
	}
	
	public static void main(String[] args) {
		
		Addable ad=MethodRef::addition;
		int sum=ad.add(12, 24);
		System.out.println("Sum is "+sum);
	}

}
