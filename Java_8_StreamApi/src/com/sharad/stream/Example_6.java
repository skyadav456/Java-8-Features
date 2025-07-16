package com.sharad.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class Example_6 {
	public static void main(String[] args) {
		
		//Remove duplicate strings, convert to uppercase, and print
		List<String> names = Arrays.asList("Alice","Bob","alice","Bob","Charlie");
		List<String> collect = names.stream().map(String::toUpperCase).distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("==============================");
		//Count the number of unique even numbers in a list
		 List<Integer> nums = Arrays.asList(1,2,2,3,4,4,5,6,6);
		 long count = nums.stream().filter(x->x%2==0).distinct().count();
		 System.out.println(count);
		 
		 System.out.println("=================================");
		 
		 //Sum all unique integers greater than 10
		 List<Integer> list = Arrays.asList(5,15,15,20,25,5,25);
		 int sum = list.stream().filter(x->x>10).distinct().mapToInt(Integer::intValue).sum();
		 System.out.println(sum);
	
		 System.out.println("================================");
		 
		 //Get the longest unique string length from a list
		 List<String> asList = Arrays.asList("cat","dog","elephant","cat","hippo","dog");
		 Optional<Integer> max = asList.stream().map(String::length).distinct().max(Integer::compare);
		 System.out.println(max.get());
		 
		 System.out.println("=====================================");
		 
		 //Create a comma-separated string of unique names starting with “A
		 
		List<String> list2 = Arrays.asList("Sharad","Anil","Amul","Baby","Charie","Anu");
		String collect2 = list2.stream().filter(s->s.startsWith("A")).distinct().collect(Collectors.joining(","));
		System.out.println(collect2);
		
		System.out.println("=========================");
		//List all unique square values of numbers greater than 3
		List<Integer> num = Arrays.asList(2,1,3,5,5,6,7,4,6,4,5,8,9);
		List<Integer> uniqueSquare = num.stream().filter(x->x>3).map(a->a*a).distinct().collect(Collectors.toList());
		System.out.println(uniqueSquare);
		 
		
		System.out.println("=================================");
		//Count unique words in a sentence
		 List<String> string = Arrays.asList(("hello world hello java stream world").split("\\s+"));
		 long count2 = string.stream().distinct().count();
		 System.out.println(count2);
		
	}

}
