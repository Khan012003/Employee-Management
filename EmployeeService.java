package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	List<Employee> employees = new ArrayList<>(Arrays.asList(
			new Employee("khan","20","10000","Intern"),
			new Employee("syed","25","15000","Devops"),
			new Employee("pasha","30","20000","FrontEnd"),
			new Employee("kumar","35","25000","BackEnd")
			));
	
	public List<Employee> getAllEmployees(){
		return employees ;
	}
	public Employee getEmployee(String name) {
		return employees.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}
	public void addEmployee(Employee employee) {
		employees.add(employee);
		
	}
	public void updateEmployee(String name, Employee employee) {
		for(int i =0;i<employees.size();i++) {
			Employee e = employees.get(i);
			if (e.getName().equals(name)) {
				employees.set(i, employee);
				return;
			}
		}
	}
	public Employee deleteEmployee(String name) {
		employees.removeIf(t -> t.getName().equals(name));
		return null;
	}
	
}
