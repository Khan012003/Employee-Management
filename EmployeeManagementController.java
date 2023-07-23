package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeManagementController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping("/employees")

	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping("/employees/{name}")
	public Employee getEmployee(@PathVariable String name) {
		return employeeService.getEmployee(name);
		
	}
	@RequestMapping(method = RequestMethod.POST,value="/employees")
	public void addEmployee(@RequestBody  Employee employee) {
		employeeService.addEmployee(employee);
		}
	@RequestMapping(method = RequestMethod.PUT,value="/employees/{name}")
	public void updateEmployee(@RequestBody  Employee employee,@PathVariable String name) {
		employeeService.updateEmployee(name,employee);
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/employees/{name}")
	public void  deleteEmployee(@PathVariable String name) {
		 employeeService.deleteEmployee(name);
		
	}
}
