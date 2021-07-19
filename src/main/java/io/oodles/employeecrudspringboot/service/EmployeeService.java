package io.oodles.employeecrudspringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.oodles.employeecrudspringboot.model.Employee;
import io.oodles.employeecrudspringboot.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}
	
	public void save(Employee employee) {
		employeeRepo.save(employee);
	}
	
	public Optional<Employee> getEmployee(Integer id) {
		return employeeRepo.findById(id);
	}
	public void update(Employee employee) {
		employeeRepo.save(employee);
	}
	public void delete(Integer id) {
		employeeRepo.deleteById(id);
	}
}
