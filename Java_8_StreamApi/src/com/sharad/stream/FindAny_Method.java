package com.sharad.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny_Method {
	public static void main(String[] args) {
		
		/* Example of findAny() method in a parallel stream
		 *  This method returns any element from the stream, which may not be the first element I
		 *  t is useful when you just need any element and do not care about the order
		 *  It is often used in parallel streams where the order of elements is not guaranteed.
		 */
		
		//Find any even number from a list
		List<Integer> list = Arrays.asList(1,2,4,5,6,8,4,9);
		Optional<Integer> anyNumber = list.stream().filter(x->x%2==0).findAny();
		System.out.println(anyNumber.get());
		
		// using orElse for fallack
		
		Integer anuNumber2 = list.stream().filter(x->x%2==0).findAny().orElse(-1);
		System.out.println(anuNumber2);
		
		// using parallel stream  -- may be give any number 
		
		Integer anyNumber3 = list.parallelStream().filter(x->x%2==0).findAny().orElse(-1);
		System.out.println(anyNumber3);
		

	
	}

}
