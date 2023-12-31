package com.khan.sms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.khan.sms.entities.Student;

@Service
public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	//TO get the edit form data
	Student getStudentById(Long id);
	//TO update the data
	Student updateStudent(Student student);
	
	//TO delete
	void deleteStudentById(Long id);
	
}
