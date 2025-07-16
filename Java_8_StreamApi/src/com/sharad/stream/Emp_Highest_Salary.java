package com.sharad.stream;

import java.util.Arrays;
import java.util.List;

class Employee2{
	int id;
	String name;
	double salary;
	
	public Employee2(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee2 [ name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}

public class Emp_Highest_Salary {
		public static void main(String[] args) {
			
	
			//Find the employee with the highest salary
			List<Employee2> emp = Arrays.asList(new Employee2(1, "Sharad", 27000),
																			new Employee2(2, "Rajesh", 45000),
																			new Employee2(3, "Meenal", 32000),
																			new Employee2(4, "Bejay", 12000));
			emp.stream().reduce((e1,e2)->e1.getSalary()>e2.getSalary()?e1:e2).ifPresent(System.out::println);;
		}
}
