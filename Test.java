package com.vikki.pgm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream; 

public class Test   
{  
    public static void main (String args[])  
    {  
        String s = "Sharma is a good player and he is so punctual";  
        String words[] = s.split(" ");  
        System.out.println("The Number of words present in the string are : "+words.length);  
        
        List<String> list = Arrays.asList("5.6", "7.4", "4", 
                "1", "2.3"); 

// Using Stream flatMap(Function mapper) 
list.stream().flatMap(num -> Stream.of(num)). 
forEach(System.out::println); 
    }  
}  