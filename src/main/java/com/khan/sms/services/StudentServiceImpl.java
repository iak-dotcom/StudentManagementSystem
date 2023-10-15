package com.khan.sms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khan.sms.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
}
