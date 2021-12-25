// This class Handles All The Request Made By The Client

// This Is The User-Created Package I Am In
package com.samuel.languages.controllers;

//Always import My Dependencies
import org.springframework.stereotype.Controller;
import com.samuel.languages.services.LanguageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.List;
import com.samuel.languages.models.Language;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

// Tell Spring I Will Be Rendering Views Not Raw Data Or JSON
@Controller
public class LanguagesController {

	// Have To Inject My service class To Use Its Functionality To Query My Database
	private final LanguageService languageService;
	
	// Have To Use Dependency Injection To Have The service class Available To This class
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	// Using Model model To inject Data Via Request To My View
	// Using @ModelAttribute To Tell The Page I will Be Instantiating A Object
	@GetMapping("/")
	public String index(@ModelAttribute("languageOne") Language langInstance, Model model) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		return "/languages/index.jsp";
	}
	
	// Using @ModelAttribute To Instantiate A Language Object
	// BindingResult Must Come Immediately After @Valid
	@PostMapping("/languages/new")
	public String create(
			@Valid @ModelAttribute("languageOne") Language langInstance,
			BindingResult result)
	{
		if(result.hasErrors()) {
			return "/languages/index.jsp";
		}
		else {
			languageService.createLanguage(langInstance);
			return "redirect:/";
		}
	}
	
	// Have To Use @PathVariable To Transmit Which id(Object) I Want To show To The Server Via URL
	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findALanguage(id);
		model.addAttribute("lang", language);
		return "/languages/show.jsp";
	}
	
	// @PathVariable To Transmit To The Server Which id(Object) I Want To edit Via URL
	// Using @ModelAttribute To Be Able To Retrieve The Object
	@GetMapping("/edit/{id}")
	public String edit(
			@ModelAttribute(value = "language") Language langOne,
			@PathVariable("id") Long id,
			Model model)
	{
		Language language = languageService.findALanguage(id);
		model.addAttribute("langs", language);
		return "/languages/edit.jsp";
	}
	
	// @ModelAttribute To Instantiate The New updated Language Object
	@PutMapping("/language/edit/{id}")
	public String update(
			@Valid @ModelAttribute(value = "language") Language langOne,
			BindingResult result)
	{
		if(result.hasErrors()) {
			return "/languages/edit.jsp";
		}
		else {
			languageService.updateLanguage(langOne);
			return "redirect:/";
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/";
	}
}