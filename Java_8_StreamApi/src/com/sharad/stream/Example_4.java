package com.sharad.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example_4 {
	public static void main(String[] args) {
		
		//Extract Length of Strings
		
		List<String> list = Arrays.asList("sharad","raju","ramesh");
		List<Integer> length = list.stream().map(s->s.length()).collect(Collectors.toList());
		System.out.println(length);
		
		//list.stream().mapToInt(String::length).forEach(System.out::println);
	}
}
