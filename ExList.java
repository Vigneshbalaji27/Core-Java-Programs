package com.vikki.java8;

import java.util.Arrays;

public class ExList {
	
	public static void main(String[] args) {
		
		int[] nums= {1, 3, -1, -3, 5, 3, 6, 7};
		
		int maxSubarray=Arrays.stream(nums)
				.boxed()
				.reduce(new int[] {0,Integer.MIN_VALUE},
				(state,element) ->{
					state[0]=Math.max(element, state[0]+element);
					state[1]=Math.max(state[1], state[0]);
					return state;
				},
				(state1,state2)->state1
				)[1];
		System.out.println("Maxsubarray "+maxSubarray);
				
	}
}
