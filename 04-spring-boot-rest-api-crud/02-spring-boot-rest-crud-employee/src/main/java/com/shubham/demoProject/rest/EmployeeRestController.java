package com.shubham.demoProject.rest;

import com.shubham.demoProject.dao.EmployeeDao;
import com.shubham.demoProject.dao.EmployeeDaoImpl;
import com.shubham.demoProject.entity.Employee;
import com.shubham.demoProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    //inject employee dao (using construction injection
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    //expose /employees and return the list of employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }


    @GetMapping("/employees/{employeeId}")
    public Employee findEmployeeById(@PathVariable int employeeId) {
        Employee theEmployee = employeeService.findEmployeeById(employeeId);
        if(theEmployee == null) {
            throw new RuntimeException("Employee id not found" + theEmployee);
        }
        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {
        theEmployee.setId(0);

        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {

        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployeeById(@PathVariable int employeeId) {
        Employee theEmployee = employeeService.findEmployeeById(employeeId);
        if(theEmployee == null) {
            throw new RuntimeException("Employee id not found" + theEmployee);
        }
        employeeService.deleteById(employeeId);
        return "Deleted the emp id " + employeeId;
    }


}
