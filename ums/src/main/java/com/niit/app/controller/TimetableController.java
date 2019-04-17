package com.niit.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.app.model.Timetable;
import com.niit.app.service.TimetableService;
import com.niit.app.model.*;
import com.niit.app.service.*;

@Controller
@RequestMapping("/timetable")
public class TimetableController {

	@Autowired
	private TimetableService timetableService;
	
	@RequestMapping("/list")
	public String listTimetables(@RequestParam("role") String role, Model theModel) {
		List<Timetable> theTimetables = timetableService.getTimetables();
		if(theTimetables.get(0)!=null)
			theTimetables.get(0).setRole(role);
		theModel.addAttribute("timetables", theTimetables);
		return "list-timetable";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Timetable theTimetable = new Timetable();
		theModel.addAttribute("timetable", theTimetable);
		return "timetable-entry";
	}
	
	
	  @PostMapping("/saveTimetable") 
	  public String saveTimetable(@ModelAttribute("timetable") Timetable theTimetable, Model theModel) {
	  timetableService.saveTimetable(theTimetable); 
	  List<Timetable> theTimetables = new ArrayList<Timetable>();
	  theTimetables.add(theTimetable);
	  theModel.addAttribute("timetables", theTimetables);
	  
	 return "list-timetable"; }
	 
	
	
	  @GetMapping("/updateForm") public String
	 showFormForUpdate(@RequestParam("timetableId") int theId, Model theModel) {
	  Timetable theTimetable= timetableService.getTimetable(theId);
	  theModel.addAttribute("timetable", theTimetable ); return "timetable-entry";
	  }
	 
	
	
	 @GetMapping("/delete") public String
	  deleteTimetable(@RequestParam("timetableId") int theId) {
	  timetableService.deleteTimetable(theId);
return "redirect:/list"; }
	 }
