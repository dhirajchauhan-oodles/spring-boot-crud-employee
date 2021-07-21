package io.oodles.crud.controller;

import io.oodles.crud.entity.Employee;
import io.oodles.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return "Saved";
    }

    @PutMapping("/employees")
    public String update(@RequestBody Employee employee){
        employeeService.update(employee);
        return "Updated";
    }

    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable Integer id){
        employeeService.delete(id);
    }
}
