package io.oodles.employeecrudspringboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.oodles.employeecrudspringboot.model.Employee;
import io.oodles.employeecrudspringboot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET, value = "/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public String save(@RequestBody Employee employee) {
		employeeService.save(employee);
		return "Employee Added Succesfully";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable Integer id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/employees")
	public String update(@RequestBody Employee employee) {
		employeeService.update(employee);
		return "Employee Updated Succesfully";
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
	public void delete(@PathVariable Integer id) {
		employeeService.delete(id);
	}
	
}
