package com.student.docker.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.docker.domain.Student;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

	@GetMapping("/getStudent")
	public Student getStudent() {
		Student student = new Student();
		student.setStudentId(UUID.randomUUID().hashCode());
		student.setFirstName("Venkata");
		student.setMiddleName("Sivakumar");
		student.setLastName("Panchakshari");
		student.setGender("Male");
		student.setDateOfBirth("05-12-2001");
		return student;
	}
}
