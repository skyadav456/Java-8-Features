package com.sharad.stream;

import java.util.Arrays;
import java.util.List;


public class Example3 {
	public static void main(String[] args) {
		//Calculate the sum of elements in a list of integers. 
		
		List<Integer> list = Arrays.asList(20,30,40,50);
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	
	}

}
