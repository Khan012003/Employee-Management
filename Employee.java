package com.example.demo;

public class Employee {
	
	
	private String name;
	private String age;
	private String salary;
	private String Designation;
	
	public String getName() {
		return name;
	
	}
	public Employee() {
		
	}
	public Employee(String name, String age, String salary, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		Designation = designation;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
}



	

