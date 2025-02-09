package com.shubhamgroup.crudapidemo;

import com.shubhamgroup.crudapidemo.dao.StudentDAO;
import com.shubhamgroup.crudapidemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudapidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudapidemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return  runner -> {
//			createStudent(studentDAO);
//			crateMultipleStudent(studentDAO);
//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			updateStudent(studentDAO);
			deleteStudent(studentDAO);
		};
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 3;
		System.out.println("Deleteing the student id " + studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {
		//retrieve the student based on the id: primary key
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findStudentById(studentId);

		// change the first name of
		System.out.println("Updating name");
		myStudent.setFirstName("Shubh");

		// update the student
		studentDAO.update(myStudent);

		// display the updated student
		System.out.println("Updating student: " + studentDAO.findStudentById(studentId));
	}

	private void queryForStudents(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		//Create a student object
		System.out.println("Creating the student");
		Student tempStudent = new Student("Shubham", "Somwanshi", "shubham@gmail.com");

		// save the student
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);


		// display the id of the saved student
		int savedId = tempStudent.getId();
		System.out.println("Printing id of the student" + tempStudent.getId());

		// retrive student based on the id : primary key
		System.out.println("Retrving the student id " + savedId);
		Student retrivedStudent = studentDAO.findStudentById(savedId);

		// display student
		System.out.println("Found the student " + retrivedStudent);
	}

	private void crateMultipleStudent(StudentDAO studentDAO) {
		// create a student
		System.out.println("Creating the student");
		Student tempStudent1 = new Student("Shubham1", "Somwanshi1", "shubham1@gmail.com");
		Student tempStudent2 = new Student("Shubham2", "Somwanshi2", "shubham1@gmail.com");
		Student tempStudent3 = new Student("Shubham3", "Somwanshi3", "shubham1@gmail.com");

		// save the student
		System.out.println("Saving the student");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);


		// display the id of the student
		System.out.println("Printing id of the student" + tempStudent1.getId());
		System.out.println("Printing id of the student" + tempStudent2.getId());
		System.out.println("Printing id of the student" + tempStudent3.getId());

	}

	private void createStudent(StudentDAO studentDAO) {
		// create a student
		System.out.println("Creating the student");
		Student tempStudent = new Student("Shubham", "Somwanshi", "shubham@gmail.com");

		// save the student
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);


		// display the id of the student
		System.out.println("Printing id of the student" + tempStudent.getId());

	}
}
