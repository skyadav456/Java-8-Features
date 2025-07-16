package com.sharad.stream;

import java.util.Arrays;
import java.util.List;

public class Count_Unique_Value {
	public static void main(String[] args) {
		
		//Counting Unique Elements
		
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		long count = numbers.stream().distinct().count();
		System.out.println(count);
	}
}
