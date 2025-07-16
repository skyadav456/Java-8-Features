package com.sharad.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce_Function {
	public static void main(String[] args) {
		/*  The reduce operation in Java 8 Stream API is a terminal operation that combines the elements of a stream
		 *  into a single result using an associative accumulation function.
			T result = stream.reduce(identity, accumulator);
		 */
		
		// Sum of all numbers in a list using reduce
		List<Integer> num = Arrays.asList(1,2,4,3,5,6,4);
		Integer sum = num.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
		// Optional<Integer> reduce = num.stream().reduce((a,b)->a+b);  
		
		
		System.out.println("=======================");
		
		//Find the maximum number using
		List<Integer> num2 = Arrays.asList(2,4,6,4,8,9,12,21);
		Optional<Integer> max = num2.stream().reduce(Integer::max);
		max.ifPresent(System.out::println);
		
		
		//Multiply all numbers in a list
		List<Integer> num3 = Arrays.asList(2,4,3,1,5,6);
		Integer mul = num.stream().reduce(1,(a,b)->a*b);
		System.out.println(mul);
		
		//Concatenate all strings in a list
		List<String> list2 = Arrays.asList("Java", "Stream", "API");
		Optional<String> conc = list2.stream().reduce((a,b)->a +" "+b);
		System.out.println(conc.get());
		
		//
	}}