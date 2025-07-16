package com.sharad.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example_1 {

	public static void main(String[] args) {
		// : Given a list of integers, return a list containing only even numbers. 
		
		List<Integer> list = Arrays.asList(1,3,4,5,6,7,8,9,11,12,14);
		//list.stream().filter(x->x%2==0).collect(Collectors.toList()).forEach(System.out::println);;
		List<Integer> even = list.stream().filter(x->x%2==0).collect(Collectors.toList());
		even.forEach(System.out::println);

	}

}
