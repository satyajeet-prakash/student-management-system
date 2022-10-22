package com.project.studentmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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
	

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student) {
		studentService.updateStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String updateStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "update_student";
	}
	
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
}
