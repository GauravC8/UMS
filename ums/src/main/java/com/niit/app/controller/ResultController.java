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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.app.model.Result;
import com.niit.app.service.ResultService;




@Controller
@RequestMapping("/result")
public class ResultController {

	@Autowired
	private ResultService resultService;
	
	@RequestMapping(value = "/list")
	public String listResults(@RequestParam("role") String role, Model theModel) {
		System.out.println("listResults: "+role);
		List<Result> theResults = resultService.getResults();
		if(theResults.get(0)!=null)
		theResults.get(0).setRole(role);
		theModel.addAttribute("results", theResults);
		return "list-result";
	}
	
	@RequestMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		System.out.println("showFormForAddshowFormForAdd");
		Result theResult = new Result();
		theModel.addAttribute("result", theResult);
		return "result-entry";
	}
	
	@PostMapping("/saveResult")
	public String saveResult(@ModelAttribute("result") Result theResult, Model theModel) {
		Result result = resultService.saveResult(theResult);
		List<Result> theResults = new ArrayList<Result>();
		theResults.add(result);
		theModel.addAttribute("results", theResults);
		return "list-result";
	}
	
	@RequestMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("resultId") int theId,
									Model theModel) {
		Result  theResult= resultService.getResult(theId);	
		theModel.addAttribute("result", theResult );
		return "result-entry";
	}
	
	@RequestMapping("/delete")
	public String deleteResult(@RequestParam("resultId") int theId) {
		resultService.deleteResult(theId);
		return "redirect:/list";
	}
}
