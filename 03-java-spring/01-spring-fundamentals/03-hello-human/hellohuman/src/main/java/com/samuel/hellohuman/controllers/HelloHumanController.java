package com.samuel.hellohuman.controllers;

// import Dependences Always!!!
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HelloHumanController {
	@RequestMapping("/")
	// Using Query Strings/URL Parameter(s)/Query Parameter(s) To Populate My Page
	public String index(
			@RequestParam (value="name", required = false, defaultValue = "Human") String name, 
			@RequestParam (value="last_name", required = false, defaultValue = "") String lastName,
			@RequestParam (value="times", required = false) String times,
			Model model)
	{
		// Using The "addAttribute()" Method Of Model To Add Data To My "View"
		model.addAttribute("name", name);
		model.addAttribute("last_name", lastName);
		model.addAttribute("times", times);
		//Returning A "View"
		return "index.jsp";
	}
}