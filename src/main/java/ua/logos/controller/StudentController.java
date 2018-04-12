package ua.logos.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.logos.entity.Student;
import ua.logos.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/add")
	public String showAddStudentsForm(Model model) {
		model.addAttribute("pageTitle", "Add Student From");
		model.addAttribute("studentModel", new Student());
		model.addAttribute("countries", Arrays.asList("Ukraine","Italy","Spain","German","Poland"));
		model.addAttribute("progLanguages", Arrays.asList("Java","C++","C#","GO","JavaScript"));
		model.addAttribute("hobbies", Arrays.asList("Programming","Walking","Sleeping","Eating","Reading"));
		return "student/add-student";
		
	}
	
	@PostMapping("/add")
	public String saveStudent(@ModelAttribute("studentModel") Student student) {
		System.out.println(">" + student.getFirstName() + " " + student.getLastName());
		studentService.saveStudent(student);
		return "redirect:/student/add";
	}
	
	@GetMapping("/students")
	public String showStudents(Model model) {
		
		model.addAttribute("studentsList", studentService.findAllStudents());
		return "student/students";
	}
}
