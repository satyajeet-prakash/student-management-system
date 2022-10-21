package com.project.studentmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.studentmanagementsystem.service.StudentService;

@Controller
public class StudentContoller {
	
	private StudentService studentService;

	public StudentContoller(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	// handler method to handle list students and return model and view
	@RequestMapping("/students")
	public String getAllStudentList(Model model) {
		model.addAttribute("students", studentService.getAllStudent());
		return "students";
	}
}
