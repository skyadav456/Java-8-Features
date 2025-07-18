package com.sharad.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
		public static void main(String[] args) {
			
			List<Employees> employee= Arrays.asList(
				    new Employees(1, "Alice", 28, "HR", "Pune", 55000, "Female"),
				    new Employees(2, "Bob", 35, "IT", "Bangalore", 85000, "Male"),
				    new Employees(3, "Charlie", 40, "Finance", "Mumbai", 95000, "Male"),
				    new Employees(4, "Diana", 30, "IT", "Pune", 75000, "Female"),
				    new Employees(5, "Ethan", 45, "HR", "Delhi", 65000, "Male"),
				    new Employees(6, "Fiona", 32, "IT", "Hyderabad", 105000, "Female"),
				    new Employees(7, "George", 29, "Finance", "Mumbai", 72000, "Male"),
				    new Employees(8, "Hannah", 38, "HR", "Delhi", 68000, "Female"),
				    new Employees(9, "Ivan", 31, "IT", "Bangalore", 99000, "Male"),
				    new Employees(10, "Julia", 27, "Finance", "Pune", 58000, "Female")
				);
			
			// Find list of employees whose name starts with alphabet A
			employee.stream()
							.filter(emp->emp.getName().startsWith("A"))
							.collect(Collectors.toList())
							.forEach(n->System.out.println(n.getName()));
		
			//Group The employees By Department Names
			
			Map<String,List<Employees>> map = employee.stream().collect(Collectors.groupingBy(emp->emp.getDepartNames()));
			System.out.println(map);
			
			//total count of employee
			long count = employee.stream().count();
			System.out.println(count);
			
			//Find the max age of employees
			int maxAge = employee.stream().mapToInt(emp->emp.getAge()).max().getAsInt();
			System.out.println(maxAge);
			
			
			// find All Department
			
			List<String> department = employee.stream().map(emp->emp.getDepartNames()).collect(Collectors.toList());
			System.out.println(department);
			
			//Find the count of employee in each department
			Map<String, Long> empCount = employee.stream().collect(Collectors.groupingBy(emp->emp.getDepartNames(),Collectors.counting()));
			System.out.println(empCount);
		
			System.out.println("=================================");
		
			//Find the list of employees whose age is less than 30
			
			employee.stream()	.filter(emp->emp.getAge()>30)	.collect(Collectors.toList())
																					.forEach(emp->System.out.println(emp.getName()));
			
			System.out.println("========================================");
			
			//Find the average age of male and female employee
			Map<String, Double> averageAge = employee.stream().collect(Collectors.groupingBy(Employees::getGender,Collectors.averagingLong(Employees::getAge)));
			
			averageAge.forEach((gender,age)->
														System.out.println(gender +" "+age));
			
			System.out.println("===========================================");
			
			//Employee who stays in Delhi and sort them by their names;
			
			employee.stream().filter(emp->emp.getAddress().equals("Delhi"))
											.sorted(Comparator.comparing(Employees::getName))
											.collect(Collectors.toList()).forEach(emp->System.out.println(emp.getName()));;
			
			System.out.println("==========================");
			 
		// Find the list of employees whose age is in between 26 and 31
			employee.stream().filter(emp->emp.getAge()>25 &&emp.getAge()<31)
											.collect(Collectors.toList())
											.forEach(emp-> System.out.println(emp.getName()+ " "+emp.getAge()));
			
			
			System.out.println("====================");
			
			// Find the department who is having maximum number of employee
			Entry<String, Long> entry = employee.stream().
																			collect(Collectors.groupingBy(emp->emp.getDepartNames(),Collectors.counting()))
																			.entrySet().stream().max(Map.Entry.comparingByValue()).get();
			System.out.println(entry);
		
			System.out.println("===============================");
			
			
			// Find the list of employee and sort them by their salary
			employee.stream().sorted(Comparator.comparing(Employees::getSalary))
										 .collect(Collectors.toList())
										 .forEach(emp->System.out.println(emp.getName()+" "+ emp.getSalary()));;
			
		 System.out.println("===================================");
		 
		 //Find the employee who has second lowest salary
		  Employees lowestSalary = employee.stream().sorted(Comparator.comparing(Employees::getSalary)).skip(1).findFirst().get();
		  System.out.println(lowestSalary);
		}
		
		
		
}
