package com.samuel.dojosurvey.controller;

// Always import My Dependences!!!
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// "@Controller" Needed To Render Views
@Controller
// "@RequestMapping" Set To class level, Which Is By Default "@GetMapping"
//@RequestMapping("/")
public class DojoSurveyController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	// Using "@RequestParam" To Get The Values From My Form
	// Using Dependency Injection To Inject The "Model" Attribute In Order To Display Values From My Form
	// One Way To Handle "POST" Data
//	@RequestMapping(path="/result", method=RequestMethod.POST)
	// The Other Way To Handle "POST" Data, Which Will Be Treated As A 100% "POST" Route
	// Won't Have To Specify The "Method=" Either
	@PostMapping("/result")
	public String result(
			@RequestParam("firstName") String firstName,
			@RequestParam("location") String location,
			@RequestParam("language") String language,
			@RequestParam("comment") String comment,
			Model programModel)
	{
		// Injecting The Values,(Not Passing), In My View
		programModel.addAttribute("firstName", firstName);
		programModel.addAttribute("location", location);
		programModel.addAttribute("language", language);
		programModel.addAttribute("comment", comment);
		
		// If Check To See What Language They Chose
		if (language.equals("Java")) {
			return "java.jsp";
		}
		
		return "results.jsp";
	}
	
}