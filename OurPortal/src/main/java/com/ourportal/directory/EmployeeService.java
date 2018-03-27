package com.ourportal.directory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private Environment environment;
	@Autowired
	EmployeeRepository employeeRepository;
	Response errorResponse = new Response(false, null, null);

	public Response addEmployee(Employee employee) {
		Response response = errorResponse;
		if (null != employee && null != employee.geteNumber()) {
			Employee employee2 = employeeRepository.save(employee);
			if (employee2 != null) {
				response = new Response(true, environment.getProperty("employee_add_success"),
						Arrays.asList(employee2));
			} else {
				response.setResponseMessage(environment.getProperty("employee_add_failed"));
			}
		}
		return response;
	}

	public Response getEmployeeByNumber(String eNumber) {
		Response response = new Response(false, "Employee Not Found !", null);
		if (null != eNumber) {
			Employee resultEmployee = employeeRepository.findOne(eNumber);
			if (resultEmployee != null) {
				response = new Response(true,"Employee Found !",Arrays.asList(resultEmployee));
			}
		}
		return response;
	}

	public Response updateEmployee(Employee employee) {
		Response response = new Response(false, "Employee Not Found !", null);
		if (null != employee && null != employee.geteNumber() && employeeRepository.exists(employee.geteNumber())) {
			Employee resultEmployee = employeeRepository.save(employee);
			response = new Response(true,"Employee Update Success !",Arrays.asList(resultEmployee));
		}
		return response;
	}

	public Response getAllEmployees() {
		Response response = new Response(false, "List is Empty !", null);
		Stream<Employee> employeeStream = employeeRepository.findAll().stream();
		List<Object> objList = Arrays.asList(employeeStream.toArray());
		response = new Response(true, "Success", objList);
		return response;
	}

	public Response deleteEmployeeByNumber(String eNumber) {
		Response response = new Response(false, "Employee Not Found !", null);
		Employee deletedEmployee = employeeRepository.findOne(eNumber);
		if (deletedEmployee != null) {
			employeeRepository.delete(deletedEmployee);
			response = new Response(true, "Employee Delete Success!", Arrays.asList(deletedEmployee));
		}
		return response;
	}
}
