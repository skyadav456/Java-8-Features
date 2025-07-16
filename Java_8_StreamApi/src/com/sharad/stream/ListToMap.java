package com.sharad.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
		public static void main(String[] args) {
			
			/* Colllectors.toMap() --To transform list data into maps in a readable, one-line style using streams.
			 *   toMap(keyMapper, valueMapper) -  NO Duplicate value allowed
			 *   toMap(keyMapper,valueMapper,mergeFunction)   -- handle duplicate value 
			 */
			
			 List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
			 Map<Integer,String> map = fruits.stream().collect(Collectors.toMap(
					 																								fruit->fruit.length(), 
					 																								fruit->fruit,
					 																								(existing,replacement)->existing+" "+ replacement));
			 System.out.println(map);
		}
}
