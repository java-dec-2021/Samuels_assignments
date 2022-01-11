package com.samuel.dojosandninjas.controllers;


import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.samuel.dojosandninjas.models.Dojos;
import com.samuel.dojosandninjas.models.Ninjas;
import com.samuel.dojosandninjas.services.AppService;


@Controller
@RequestMapping("/ninja")
public class NinjasController {

	@Autowired
	private AppService appService;
	
	@GetMapping("/new")
	public String newNinja(@ModelAttribute("ninja") Ninjas ninja, Model model) {
		List<Dojos> allDojos = this.appService.findAll();
		model.addAttribute("allDojos", allDojos);
		return "ninja.jsp";
	}
	
	@PostMapping("/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninjas ninja,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			List<Dojos> allDojos = this.appService.findAll();
			model.addAttribute("allDojos", allDojos);
			return "ninja.jsp";
		}
		this.appService.createNinja(ninja);
		return "redirect:/";
	}
}