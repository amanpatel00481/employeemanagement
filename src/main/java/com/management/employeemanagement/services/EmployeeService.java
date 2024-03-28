package com.management.employeemanagement.services;

import com.management.employeemanagement.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee saveEmployee(Employee employee);

    public List<Employee> getAllEmployee();

//new method



  public Employee getEmployeeById(Long id);



   public Employee updateEmployee(Long id, Employee employee);

   public void deleteEmployee(Long id);

}
