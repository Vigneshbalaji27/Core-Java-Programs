package com.vikki.java8;

public class LambdaEx {
	
	public static void main(String[] args) {
		
		Sayable s1=name ->{
			return "Hello "+name;
			
		};
		
		StrLength st=(s)-> {
			return s.length();
		};
		
		int r=st.len("Vignesh Balaji");
		System.out.println("Length is "+r);
			
		Addable a1=(a,b)->(a+b);
		
		String w=s1.say("Shankar");
		System.out.println(w);
		
		System.out.println("Addition is "+a1.add(23,33));
		
		
	}
	
	

}
