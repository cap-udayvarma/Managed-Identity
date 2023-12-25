package com.example.manageidentity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manageidentity.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
