package com.shubhamgroup.crudapidemo.dao;

import com.shubhamgroup.crudapidemo.entity.Student;
import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findStudentById(Integer id);

    List<Student> findAll();

    void update(Student theStudent);

    void delete(Integer id);
}
