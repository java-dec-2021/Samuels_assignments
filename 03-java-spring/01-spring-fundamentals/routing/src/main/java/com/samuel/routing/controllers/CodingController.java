package com.samuel.routing.controllers;

// importing My Dependences
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Annotation To Get My Controllers To Respond With Data
@RestController
public class CodingController {
	// Annotation For Mapping A Web Request Onto A Specific handler "class" or method
	@RequestMapping("/")
	public String index() {
		return "Welcome to the index page";
	}
	
	@RequestMapping("/coding")
	public String hello() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/coding/python")
	public String coding() {
		return "Python/Django was aweome!";
	}
	
	@RequestMapping("/coding/java")
	public String dojo() {
		return "Java/Spring is better!";
	}
}