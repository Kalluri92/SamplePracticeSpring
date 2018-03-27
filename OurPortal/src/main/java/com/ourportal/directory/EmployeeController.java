package com.ourportal.directory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/directory")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/add")
	public Response addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@PostMapping("/update")
	public Response updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@GetMapping("/get/{eNumber}")
	public Response getEmployeeByNumber(@PathVariable("eNumber") String eNumber) {
		return employeeService.getEmployeeByNumber(eNumber);
	}
	
	@DeleteMapping("/delete/{eNumber}")
	public Response deleteEmployee(@PathVariable("eNumber") String eNumber) {
		return employeeService.deleteEmployeeByNumber(eNumber);
	}
	
	@GetMapping("/getAll")
	public Response getAllEmployees() {
		return employeeService.getAllEmployees();
	}
}
