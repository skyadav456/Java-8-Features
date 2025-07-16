package com.sharad.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 @Override
	    public String toString() {
	        return "Employee{id=" + id + ", name='" + name + "'}";
	    }

	
	
}


public class Employee_Dublicate {
	public static void main(String[] args) {
		// Remove duplicates from a list of Employees based on id
		
		List<Employee> empList = Arrays.asList( new Employee(1, "Sharad"),
								new Employee(2, "Rajesh"),
								new Employee(3, "Sharad"),
								new Employee(4, "Prati"),
								new Employee(3, "Ramu"),
								new Employee(3, "Neelu"));
		empList.stream().collect(Collectors.toMap(
						                Employee::getId,        // key: id
						                emp -> emp,             // value: employee object
						                (emp1, emp2) -> emp1    // merge function: keep first occurrence
						            ))
						            .values()
						            .stream()
						            .collect(Collectors.toList()).forEach(System.out::println);
		
	}
}
