package com.project.studentmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.studentmanagementsystem.entity.Student;
import com.project.studentmanagementsystem.repository.StudentRepository;
import com.project.studentmanagementsystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository repository;
	
	public StudentServiceImpl(StudentRepository repository) {
		super();
		this.repository = repository;
	}


	/*
	new Student((long) 1, "Raghav", "Kapoor", "raghav.kapoor@gmail.com")
	new Student((long) 2, "Henry", "Potter", "potter.henry@yahoo.com"),
	new Student((long) 3, "Patrick", "Lam", "pat.lam@hotmail.com")
	*/

	@Override
	public List<Student> getAllStudent() {
		return repository.findAll();
	}

}
