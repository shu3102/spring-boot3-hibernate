package com.shubham.demo.rest;

import com.shubham.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @post constructor to load the student data

    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Shubham", "Somwanshi"));
        theStudents.add(new Student("Sara", "Tendulkar"));
        theStudents.add(new Student("Ruchita", "Verma"));
    }


    // define endpoint for /students
    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;
    }

    // define the endpoint or "/student/{studentId} - return student at that index.
    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        // check the studentId is in size
        if(studentId >= theStudents.size()) {
            throw new StudentNotFoundException("Student Not Found" + studentId);
        }
        return theStudents.get(studentId);
    }


}









