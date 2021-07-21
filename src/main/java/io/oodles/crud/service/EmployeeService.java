package io.oodles.crud.service;

import io.oodles.crud.entity.Employee;
import io.oodles.crud.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAll(){
        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployee(Integer id){
        return employeeRepo.findById(id);
    }

    public String saveEmployee(Employee employee){
        employeeRepo.save(employee);
        return "Saved";
    }

    public String update(Employee employee){
        employeeRepo.save(employee);
        return "Updated";
    }

    public void delete(Integer id){
        employeeRepo.deleteById(id);
    }
}
