package com.khan.sms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.khan.sms.entities.Student;
import com.khan.sms.services.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	//Handler method to handle list students and return model and view
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	//Just to open the form
	@GetMapping("/students/new") //as defined in students.html button address
	public String createStudentForm(Model model) {
		//create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student",student);
		return "create_Student";
	}
//To post the filled form
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute ("student")Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}

}
