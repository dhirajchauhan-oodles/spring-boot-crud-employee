package io.oodles.employeecrudspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.oodles.employeecrudspringboot.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
