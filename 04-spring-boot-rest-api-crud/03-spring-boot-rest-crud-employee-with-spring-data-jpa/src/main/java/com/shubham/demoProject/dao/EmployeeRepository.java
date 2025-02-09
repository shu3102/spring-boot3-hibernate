package com.shubham.demoProject.dao;

import com.shubham.demoProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // there is not need to write any code
}
