package com.niit.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.app.model.User;
import com.niit.app.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping("/loginForm")
	public String showFormForAdd(@RequestParam("role") String role, Model theModel) {
		User theUser = new User();
		//theUser.setRole(role);
		theModel.addAttribute("role", role);
		theModel.addAttribute("user", theUser);
		return "login-user";
	}

	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute User theUser) {
		User usr = userService.checkUser(theUser);
		ModelAndView model = null;
		if (usr == null) {
			model = new ModelAndView("login-user");
			model.addObject("error", "Invalid Username or Password");
		} else {
			if(usr.getRole().equalsIgnoreCase("f")) {
				model = new ModelAndView("facultyIndex");	
			}
			else if(usr.getRole().equalsIgnoreCase("s")) {
				model = new ModelAndView("studentIndex");
			}
			else
			model = new ModelAndView("adminIndex");
			//model = new ModelAndView("facultyIndex");
			model.addObject("usr", usr);
		}
		return model;
	}

	@RequestMapping(value = "/loginAdmin", method = RequestMethod.POST)
	public ModelAndView processAdminLogin(@ModelAttribute User theUser) {
		ModelAndView model = null;
		
		if((theUser.getEmailId().equals("admin")) && (theUser.getPassword().equals("admin"))) 
		{
			
			model = new ModelAndView("adminIndex");
					}
		return model;

		
	}
	
	
	@GetMapping("/facultyloginForm")
	public String showFormForAdd1(Model theModel) {
		User theUser = new User();
		theModel.addAttribute("user", theUser);
		return "login-user";
	}

	@RequestMapping(value = "/facultyloginUser", method = RequestMethod.POST)
	public ModelAndView processLogin1(@ModelAttribute User theUser) {
		User usr = userService.checkUser(theUser);
		ModelAndView model = null;
		if (usr == null) {
			model = new ModelAndView("login-user");
			model.addObject("error", "Invalid Username or Password");
		} else {
			model = new ModelAndView("facultyIndex");
			model.addObject("usr", usr.getId());
		}
		return model;
	}
	

	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.invalidate();
		System.out.println("logout successfull");
		return "logout";
	}


}
