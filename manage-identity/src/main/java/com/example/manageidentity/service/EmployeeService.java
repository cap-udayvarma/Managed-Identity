package com.example.manageidentity.service;



import java.util.List;
import java.util.Optional;

import com.example.manageidentity.model.Employee;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(Long id);

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employeeDetails);

    void deleteEmployee(Long id);
}



