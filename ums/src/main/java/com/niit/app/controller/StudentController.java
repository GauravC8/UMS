package com.niit.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.app.model.Student;
import com.niit.app.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/list")
	public String listStudents(Model theModel) {
		System.out.println("in listy");
		List<Student> student = studentService.getStudents();
		theModel.addAttribute("students", student);
		return "list-students";
	}
	
	@RequestMapping(value="/showStudent", method = RequestMethod.GET)
	public String getStudent(@RequestParam("studentId")int studentId, Model theModel) {
		System.out.println("getStudent:"+studentId);
	    Student student = studentService.showStudent(studentId);
	    List<Student> student1 = new ArrayList<Student>();
	    student1.add(student);
		theModel.addAttribute("students", student1);
		return "list-students";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Student student = new Student();
		theModel.addAttribute("student", student);
		return "list";
	}
	
	@RequestMapping(value="/saveStudent",method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);	
		return "redirect:/student/list";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("id")int id,
									Model theModel) {
		System.out.println("showFormForUpdate:"+id);
		Student student = studentService.showStudent(id);	
		System.out.println("getStudent:"+student);
		theModel.addAttribute("Student", student);
		return "studentRegistration";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("id") int id) {
		 studentService.deleteStudent(id);
		return "redirect:list";
	}
}
