package com.niit.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.app.model.Faculty;
import com.niit.app.service.FacultyService;

@Controller
@RequestMapping("/faculty")
public class FacultyController {

	@Autowired
	private FacultyService facultyService;
	
	@GetMapping("/list")
	public String listStudents(Model theModel) {
		List<Faculty> faculty = facultyService.getFaculties();
		theModel.addAttribute("faculties", faculty);
		return "list-faculties";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Faculty faculty = new Faculty();
		theModel.addAttribute("faculty", faculty);
		return "";
	}
	
	@RequestMapping(value="/saveFaculty",method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("faculty") Faculty faculty) {
		facultyService.saveFaculty(faculty);	
		return "redirect:/faculty/list";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("emailId") String emailId,
									Model theModel) {
		Faculty faculty = facultyService.getFaculty(emailId);	
		theModel.addAttribute("faculty", faculty);
		return "facultyRegistration";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("emailId") String emailId) {
		facultyService.deleteFaculty(emailId);
		return "redirect:/faculty/list";
	}
}
