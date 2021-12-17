package com.samuel.routing.controllers;

// My imported Dependences I Need In Order To Use My Annotations
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Add My Annotation For My Controllers, So That They Can Respond With Data (Text, or JSON)
@RestController
public class DojoController {

	// Mapping A Specific Web Request Onto A Specific Handler "class" or method 
	@RequestMapping("/{dojo}")
	// Using "@PathVariable" To Find And Display The Exact Resource Needed By The Client
	public String dojo(@PathVariable("dojo") String dojoWelcome) {
		System.out.println(dojoWelcome);
		return "The Dojo is awesome!";
	}
	
	// Mapping A Specific Web Request Onto A Specific Handler "class" or method 
	@RequestMapping("/{dojo}/{location}")
	// Using "@PathVariable" To Find And Display The Exact Resource Needed By The Client
	public String dojo(@PathVariable("dojo") String dojoWelcome, @PathVariable("location") String location) {
		// switch Statement To Evaluate Each "@PathVariable" case For "location"
		switch(location) {
		case "burbank":
			System.out.println(location);
			return "Burbank Dojo is located in Southern California";
		case "san-jose":
			System.out.println(location);
			return "SJ Dojo is the Headquarters";
		default:
			System.out.println(location);
			return String.format("%s is pretty sweet!", location);
		}
	}
	
}
