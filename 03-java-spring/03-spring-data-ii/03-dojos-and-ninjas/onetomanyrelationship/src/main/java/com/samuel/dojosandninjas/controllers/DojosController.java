package com.samuel.dojosandninjas.controllers;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.samuel.dojosandninjas.models.Dojos;
import com.samuel.dojosandninjas.services.AppService;


@Controller
@RequestMapping("/dojos")
public class DojosController {

	@Autowired
	private AppService appService;
	
	@GetMapping("/new")
	public String newDojo(@ModelAttribute("dojo") Dojos dojo, Model model) {
		model.addAttribute("dojos", this.appService.findAll());
		return "index.jsp";
	}
	
	@PostMapping("/createDojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojos dojo,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		this.appService.createDojo(dojo);
		return "redirect:/ninja/new";
	}
	
	@GetMapping("/{id}")
	public String showDetails(Model model, @PathVariable("id") Long id) {
		model.addAttribute("displayDojo", this.appService.findOneDojo(id));
		return "showdetails.jsp";
	}
}