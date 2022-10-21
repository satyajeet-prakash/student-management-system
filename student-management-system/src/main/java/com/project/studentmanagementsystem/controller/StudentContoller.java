package com.project.studentmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.studentmanagementsystem.entity.Student;
import com.project.studentmanagementsystem.service.StudentService;

@Controller
public class StudentContoller {
	
	private StudentService studentService;

	public StudentContoller(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	// handler method to handle list students and return model and view
	@GetMapping("/students")
	public String getAllStudentList(Model model) {
		model.addAttribute("students", studentService.getAllStudent());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String addStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "add_student";
	}
	
	@PostMapping("/students")
	public String addStudent(@ModelAttribute("student") Student student) {
		studentService.addStudent(student);
		return "redirect:/students";
	}
}
