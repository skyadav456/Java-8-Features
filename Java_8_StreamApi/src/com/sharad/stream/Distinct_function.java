package com.sharad.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct_function {
	public static void main(String[] args) {
		/*Removing Duplicates from Integer List
		 * 
		 * Distinct-- return the unique value 
		 */
		
		List<Integer> list = Arrays.asList(1,4,2,5,2,5,6,5,7,8,4,9,3);
		List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
		
		System.out.println("=====================================");
		// Removing Duplicate Strings
		 List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob");
		 List<String> name = names.stream().distinct().collect(Collectors.toList());
		 System.out.println(name);
	}

}
