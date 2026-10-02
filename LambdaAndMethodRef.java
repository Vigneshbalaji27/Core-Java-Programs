package com.vikki.java8;

public class LambdaAndMethodRef {
	
	public static void work() {
		System.out.println("Working in Civil");
	}
	
	public static int mul(int a,int b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		
		Playing p=()->{
			System.out.println("Playing chess");
		};
		
		Multiply mu=(int a,int b)->(a*b);
		
		p.play();
		
		Playing p1=LambdaAndMethodRef::work;
		
		p1.play();
		
		Multiply m1=LambdaAndMethodRef::mul;
		int m=mu.mul(13,12);
		int mm=m1.mul(23, 34);
		System.out.println("Multiplication is m "+m);
		System.out.println("Multiplication of mm is "+mm);
		
	}
}
