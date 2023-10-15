package com.khan.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khan.sms.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
