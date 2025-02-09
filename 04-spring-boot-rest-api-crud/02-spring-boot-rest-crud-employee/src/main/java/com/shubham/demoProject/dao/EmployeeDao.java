package com.shubham.demoProject.dao;


import com.shubham.demoProject.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();

    Employee findEmployeeById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
