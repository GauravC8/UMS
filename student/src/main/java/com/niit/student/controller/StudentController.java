package com.niit.timetable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.timetable.model.*;
import com.niit.timetable.service.*;

@Controller
@RequestMapping("/timetable")
public class TimetableController {

	@Autowired
	private TimetableService timetableService;
	
	@RequestMapping("/list")
	public String listTimetables(Model theModel) {
		List<Timetable> theTimetables = timetableService.getTimetables();
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
	public String saveTimetable(@ModelAttribute("timetable") Timetable theTimetable) {
		timetableService.saveTimetable(theTimetable);	
		return "redirect:/list";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("timetableId") int theId,
									Model theModel) {
		Timetable  theTimetable= timetableService.getTimetable(theId);	
		theModel.addAttribute("timetable", theTimetable );
		return "timetable-entry";
	}
	
	@GetMapping("/delete")
	public String deleteTimetable(@RequestParam("timetableId") int theId) {
		timetableService.deleteTimetable(theId);
		return "redirect:/list";
	}
}
