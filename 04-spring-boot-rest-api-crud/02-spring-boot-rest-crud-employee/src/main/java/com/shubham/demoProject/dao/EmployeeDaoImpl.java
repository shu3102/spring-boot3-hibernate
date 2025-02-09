package com.shubham.demoProject.dao;

import com.shubham.demoProject.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    // define fields for entity manager
    private EntityManager entityManager;

    // setup constructor injections

    @Autowired
    public EmployeeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> findAll() {

        // create query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        // return the result
        return employees;
    }

    @Override
    public Employee findEmployeeById(int theId) {
        // get the employee
        Employee theEmployee = entityManager.find(Employee.class, theId);

        //return the employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        // save the employee
        Employee theNewEmployee = entityManager.merge(theEmployee);

        // return the DB employee
        return theNewEmployee;
    }

    @Override
    public void deleteById(int theId) {
        // find the employee
        Employee theNewEmployee = entityManager.find(Employee.class, theId);

        // delete the employee
        entityManager.remove(theNewEmployee);
    }
}
