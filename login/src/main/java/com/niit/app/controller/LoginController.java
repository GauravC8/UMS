package com.niit.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.app.model.User;
import com.niit.app.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController {

	@Autowired
	private UserService userService;

	@GetMapping("/loginForm")
	public String showFormForAdd(Model theModel) {
		User theUser = new User();
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
			model = new ModelAndView("studentIndex");
			model.addObject("usr", usr.getEmailId());
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
			model.addObject("usr", usr.getEmailId());
		}
		return model;
	}

}


//package com.niit.app.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.niit.app.model.User;
//import com.niit.app.service.UserService;
//
//@Controller
//@RequestMapping("/user")
//public class LoginController {
//
//	@Autowired
//	private UserService userService;
//
//	@GetMapping("/loginForm")
//	public String showFormForAdd(Model theModel) {
//		User theUser = new User();
//		theModel.addAttribute("user", theUser);
//		return "login-user";
//	}
//
//	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
//	public ModelAndView processLogin(@ModelAttribute User theUser) {
//		User usr = userService.checkUser(theUser);
//		ModelAndView model = null;
//		if (usr == null) {
//			model = new ModelAndView("login-user");
//			model.addObject("error", "Invalid Username or Password");
//		} else {
//			model = new ModelAndView("studentIndex");
//			model.addObject("usr", usr.getEmailId());
//		}
//		return model;
//	}
//
//	@GetMapping("/facultyloginForm")
//	public String showFormForAdd1(Model theModel) {
//		User theUser = new User();
//		theModel.addAttribute("user", theUser);
//		return "login-user";
//	}
//
//	@RequestMapping(value = "/facultyloginUser", method = RequestMethod.POST)
//	public ModelAndView processLogin1(@ModelAttribute User theUser) {
//		User usr = userService.checkUser(theUser);
//		ModelAndView model = null;
//		if (usr == null) {
//			model = new ModelAndView("login-user");
//			model.addObject("error", "Invalid Username or Password");
//		} else {
//			model = new ModelAndView("facultyIndex");
//			model.addObject("usr", usr.getEmailId());
//		}
//		return model;
//	}
//
//}
