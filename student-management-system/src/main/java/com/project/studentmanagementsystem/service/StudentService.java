package com.project.studentmanagementsystem.service;

import java.util.List;

import com.project.studentmanagementsystem.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudent();

	void addStudent(Student student);
}
