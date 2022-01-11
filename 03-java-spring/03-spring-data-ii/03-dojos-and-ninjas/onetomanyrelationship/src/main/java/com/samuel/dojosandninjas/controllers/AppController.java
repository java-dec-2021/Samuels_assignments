package com.samuel.dojosandninjas.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {
	
	@GetMapping("/")
	public String newDojo() {
		return "redirect:/dojos/new";
	}
}