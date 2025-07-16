package com.sharad.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst_Function {
		public static void main(String[] args) {
			
			// findFirst() --Returns an Optional<T> describing the first element of the stream, if present.
			
			
			//  find first even number form the list 
			
			  List<Integer> nums = Arrays.asList(1, 3, 5, 6, 8, 10);
			  Optional<Integer> first = nums.stream().filter(x->x%2==0).findFirst();
			  first.ifPresent(System.out::println);
		
		}
}
