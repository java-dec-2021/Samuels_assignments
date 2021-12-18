package com.samuel.displaydate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
@RequestMapping("/")
public class DisplayDateController {
	
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {

		// Breaking up And Creating A "SimpleDateFormat" For Each Piece Of The Date I Want
		SimpleDateFormat dateFor = new SimpleDateFormat("EEEE");
		SimpleDateFormat dateFor0 = new SimpleDateFormat("dd");
		SimpleDateFormat dateFor1 = new SimpleDateFormat("MMMM");
		SimpleDateFormat dateFor2 = new SimpleDateFormat("yyyy");
		
		// Setting Each Piece To Get Formatted
		String day = dateFor.format(new Date());
		String date = dateFor0.format(new Date());
		String month = dateFor1.format(new Date());
		String year = dateFor2.format(new Date());
		
		// Concatenating Each Piece With String Literals
		String realDate = day + ", the " + date + " of " + month + ", " + year;
		
		// Using "Model" To Add "realDate" Value To My "View"
		model.addAttribute("dateFormat", realDate);
		
		// Returning My "View"
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat time = new SimpleDateFormat("h:m");
		model.addAttribute("var", time.format(new Date()));
		return "time.jsp";
	}

}