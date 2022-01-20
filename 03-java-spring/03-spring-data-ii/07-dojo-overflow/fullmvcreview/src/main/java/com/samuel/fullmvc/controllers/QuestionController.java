package com.samuel.fullmvc.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.samuel.fullmvc.models.Answers;
import com.samuel.fullmvc.models.Questions;
import com.samuel.fullmvc.services.AppService;
import com.samuel.fullmvc.valid.TagValidator;

@Controller
public class QuestionController {
	
	@Autowired
	private AppService appService;
	
	@Autowired
	private TagValidator validator;
	
	@GetMapping("/questions")
	public String dashBoard(@ModelAttribute("question") Questions question, Model model) {
		model.addAttribute("allQuestions", this.appService.findAllQuestions());
		return "questionDash.jsp";
	}
	
	@GetMapping("/questions/new")
	public String showQForm(@ModelAttribute("question") Questions question) {
		return "createQuestion.jsp";
	}
	
	@PostMapping("/created")
	public String createQuestionWithTag(@Valid @ModelAttribute("question") Questions question, BindingResult result) {
		validator.validate(question, result);
		if(result.hasErrors()) {
			return "createQuestion.jsp";
		}
		this.appService.createQuestion(question);
		return "redirect:/";
	}
	
	@GetMapping("/questions/{id}")
	public String ShowAnswer(@PathVariable("id") Long id, Model model, @ModelAttribute("answer") Answers answer) {
		Questions questionToShow = this.appService.findAQuestion(id);
		model.addAttribute("showQuestion", questionToShow);
		return "answer.jsp";
	}
	
	@PostMapping("/created/answer")
	public String CreateAnswer(@Valid @ModelAttribute("answer") Answers answer, BindingResult result, Model model) {
		if(result.hasErrors()) {
			Questions questionToShow = this.appService.findAQuestion(answer.getQuest().getId());
			model.addAttribute("showQuestion", questionToShow);
			return "answer.jsp";
		}
		this.appService.createAnswer(answer);
		return "redirect:/questions/" + answer.getQuest().getId();
	}
}