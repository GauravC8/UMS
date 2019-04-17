package com.niit.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.app.dao.AssignmentDAO;
import com.niit.app.dao.StudentDAO;
import com.niit.app.model.Assignment;
import com.niit.app.model.Student;


@Controller
@RequestMapping("/assign")
public class AssignmentController {
	
	@Autowired
	AssignmentDAO assignmentDAO;
	
	@RequestMapping(value="/viewAssignment")
	public String viewAssignment(Model theModel,@RequestParam("studentId")String studentId) {
		System.out.println("view Assignment:"+studentId);
		theModel.addAttribute("studentId", studentId);
		return "assignment";
	}
	
	@RequestMapping(value="/uploadAssignment",method=RequestMethod.POST)
	public String uploadAssignment(@RequestParam("studentId")String studentId, @RequestParam("assignmentsfile")String assignmentsfile,ModelMap modelMap)
	{
	
		Assignment assig=new Assignment();
		
		assig.setStudentCourseEnroll(Integer.parseInt("10"));
		assig.setAssignment(assignmentsfile.getBytes());
		Student student = new Student();
		System.out.println("upload Assignment:"+studentId);
		student.setId(Integer.parseInt(studentId));
		assig.setStudent(student);
		assignmentDAO.saveAssignements(assig);
		
		return "assignment";
		
	
	}



}
