package com.sharad.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst_example2 {
	public static void main(String[] args) {
		
		// find the first String starting with the A
		
		List<String> names = Arrays.asList("Tom", "Jerry", "Alice", "Bob");
		Optional<String> first = names.stream().filter(name->name.startsWith("A")).findFirst();
		first.ifPresent(n->System.out.println("First String is :"+ n));
	}

}
