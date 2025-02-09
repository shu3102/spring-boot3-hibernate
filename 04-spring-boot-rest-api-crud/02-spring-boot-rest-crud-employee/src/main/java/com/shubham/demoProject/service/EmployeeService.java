package com.shubham.demoProject.service;

import com.shubham.demoProject.entity.Employee;

import java.util.List;

public interface EmployeeService {


    List<Employee> findAll();

    Employee findEmployeeById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
