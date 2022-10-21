package com.project.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.studentmanagementsystem.entity.Student;
import com.project.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student("Raghav", "Kapoor", "raghav.kapoor@gmail.com");
		Student s2 = new Student("Henry", "Potter", "potter.henry@yahoo.com");
		Student s3 = new Student("Patrick", "Lam", "pat.lam@hotmail.com");
		studentRepository.save(s1);
		studentRepository.save(s2);
		studentRepository.save(s3);
	}

}
