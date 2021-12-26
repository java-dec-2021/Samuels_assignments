// This class Handles All The Request Made By The Client

// This Is The User-Created Package I Am In
package com.samuel.languages.controllers;

//Always import My Dependencies
import org.springframework.stereotype.Controller;
import com.samuel.languages.services.LanguageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
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

	// Injecting My service class To Use Its Functionality To Query My Database/ Or @Autowired
	private final LanguageService languageService;
	
	// Constructor
	// To Use Dependency Injection To Have The service class Available To This class
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	// Using Model model To inject Data Via Request To My View
	// Using @ModelAttribute To Get A Blank Object For This Request view
	@GetMapping("/languages")
	public String index(@ModelAttribute("language") Language langInstance, Model model) {
//		List<Language> languages = languageService.allLanguages();
		model.addAttribute("allLanguages", this.languageService.allLanguages());
		return "/languages/index.jsp";
	}
	
	// Using @ModelAttribute To Instantiate That Blank Language Object And Create It
	// BindingResult Must Come Immediately After @Valid
	@PostMapping("/languages")
	public String create(
			@Valid @ModelAttribute("language") Language langInstance,
			BindingResult result,
			Model model)
	{
		if(result.hasErrors()) {
			// To be Able To Render The Page The Exact Same Way, With The Languages Showing
			model.addAttribute("allLanguages", this.languageService.allLanguages());
			return "/languages/index.jsp";
		}
		else {
			languageService.createLanguage(langInstance);
			return "redirect:/languages";
		}
	}
	
	// Have To Use @PathVariable To Transmit Which id(Object) I Want To show To The Server Via URL
	@GetMapping("/languages/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Language languages = languageService.findALanguage(id);
		model.addAttribute("allLanguages", languages);
		return "/languages/show.jsp";
	}
	
	// @PathVariable To Transmit To The Server Which id(Object) I Want To edit Via URL
	// Using @ModelAttribute To Be Able To Retrieve A Blank Object For This Request
	// If I Have A edit "id" For My @GetMapping, It Has To Match For My @PostMapping,
	// For The update Functionality To Work. Otherwise It Will Be Creating New Objects
	// Instead Of updating The Current One.
	@GetMapping("/languages/{id}/edit")
	public String edit(
			@ModelAttribute("language") Language langInstance,
			@PathVariable("id") Long id,
			Model model)
	{
		model.addAttribute("allLangs", this.languageService.findALanguage(id));
		return "/languages/edit.jsp";
	}
	
	// @ModelAttribute To Instantiate The New "updated" Blank Language Object
	@PutMapping("/languages/{id}/edit")
	public String update(
			@Valid @ModelAttribute(value = "language") Language langInstance,
			BindingResult result,
			@PathVariable("id") Long id,
			Model model)
	{
		if(result.hasErrors()) {
			model.addAttribute("allLangs", this.languageService.findALanguage(id));
			return "/languages/edit.jsp";
		}
		else {
			languageService.updateLanguage(langInstance);
			return "redirect:/languages";
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}

}