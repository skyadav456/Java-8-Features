package com.sharad.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example_5 {
	public static void main(String[] args) {
		// Convert all strings in a list to uppercase. 
		
		List<String> list = Arrays.asList("rajesh","Sharad","Manu","himesh");
		List<String> uppercase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercase);
	}
}
