package com.vikki.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class JavaSet {

	public static void main(String[] args) {
		
		Set<String> Set=new HashSet<String>();
		
		Set.add("Java");  
        Set.add("Python");  
        Set.add("DBMS");  
        Set.add("DBMS");  
        Set.add("Machine Learning");  
        Set.add("Operating System");  
  
        // Here Set follows unordered way.  
        System.out.println(Set); 
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        int elementToInsert = 25;
        int targetIndex = 2;

        // Insert element at the specific index
        list.add(targetIndex, elementToInsert);

        // Output: [10, 20, 25, 30, 40]
        System.out.println(list);  
        
        Optional<Integer> fi=list.stream().max(Comparator.naturalOrder());
		  
		System.out.println("Hight fi "+fi);
        
        
	}
}
