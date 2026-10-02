package com.vikki.java8;

class InvalidAgeException extends RuntimeException{

public InvalidAgeException(String msg){

	super(msg);

}	

}

public class CustomException{
	
static void checkEligibility(int age){
	if(age < 18)
	{
		throw new InvalidAgeException("Age must be greater than or equal to 18");
	}
	System.out.println("Access granted");
}

public static void main(String[] args){

	try{
			checkEligibility(15);
		}catch(InvalidAgeException e){
			System.out.println("Caught "+e.getMessage());
		}

	}
}