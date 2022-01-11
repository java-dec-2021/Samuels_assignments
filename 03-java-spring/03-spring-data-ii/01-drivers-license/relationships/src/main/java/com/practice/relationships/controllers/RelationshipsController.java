package com.practice.relationships.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.relationships.models.LicenseModel;
import com.practice.relationships.models.PersonModel;
import com.practice.relationships.services.RelationshipService;


@Controller
public class RelationshipsController {
	
	@Autowired
	private RelationshipService relationshipService;
	
//	private final RelationshipService relationshipService;
//	public RelationshipsController(RelationshipService relationshipService) {
//		this.relationshipService = relationshipService;
//	}
	
	// Home Page Route
	@GetMapping("/")
	public String index(@ModelAttribute("person") PersonModel personObj, Model model) {
		List<PersonModel> persons = relationshipService.allPersons();
		model.addAttribute("persons", persons);
		return "index.jsp";
	}
	
	// Show Create Person Form Page Route
	@GetMapping("/new")
	public String showForm(@ModelAttribute("person") PersonModel personObj) {
		return "new.jsp";
	}
	
	// Person Form Processing Route
	@PostMapping("/persons/new")
	public String createPerson(@Valid @ModelAttribute("person") PersonModel personObj, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}
		else {
			this.relationshipService.createPerson(personObj);			
			return "redirect:/";
		}
	}

	// Route To Show license Form
	@GetMapping("/new/license")
	public String showLicense(Model model, @ModelAttribute("license") LicenseModel licenseObj) {
		model.addAttribute("people", this.relationshipService.getUnlicensedPersons());
		return "license.jsp";
		}

	// Route To Process The License
	@PostMapping("/newlicense")
	public String createLicense(@Valid @ModelAttribute("license") LicenseModel licenseObj, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("people", this.relationshipService.getUnlicensedPersons());
			return "license.jsp";
		}
		this.relationshipService.createLicense(licenseObj);
		return "redirect:/";
	}
	
	// Route To Show A User
	@GetMapping("/person/{id}")
	public String showPerson(Model model, @PathVariable("id") Long id) {
		model.addAttribute("aPerson", this.relationshipService.findAPerson(id));
		return "show.jsp";
	}
}