package com.sharad.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example_2 {
	public static void main(String[] args) {
		//Find the maximum value in a list of integers. 
		
		List<Integer> list = Arrays.asList(20,12,32,44,54,80);
		Optional<Integer> max = list.stream().max(Integer::compare);
		System.out.println(max.get());
	}

}
