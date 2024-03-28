package com.management.employeemanagement.controller;

import com.management.employeemanagement.entity.Employee;
import com.management.employeemanagement.services.EmployeeService;
import com.management.employeemanagement.services.EmployeeServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return "New Employee Created";
    }

    @GetMapping("getAll")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }


    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Employee updatedEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
        return employeeService.updateEmployee(id, employeeDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }
}
