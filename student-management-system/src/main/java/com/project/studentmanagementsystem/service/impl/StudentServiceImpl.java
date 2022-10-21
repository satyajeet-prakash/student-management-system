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

	@Override
	public List<Student> getAllStudent() {
		return repository.findAll();
	}


	@Override
	public void addStudent(Student student) {
		repository.save(student);
	}

}
