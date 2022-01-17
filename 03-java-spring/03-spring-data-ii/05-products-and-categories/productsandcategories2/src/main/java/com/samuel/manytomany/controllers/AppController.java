package com.samuel.manytomany.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.samuel.manytomany.models.Categories;
import com.samuel.manytomany.models.Products;
import com.samuel.manytomany.services.AppService;


@Controller
public class AppController {

	@Autowired
	private AppService appService;
	
	// GET Route to show all Products and Categories
	@GetMapping("/")
	public String redirect(Model model, @ModelAttribute("prod") Products productObjs, @ModelAttribute("category") Categories categoryObjs) {
		model.addAttribute("prods", this.appService.findAll());
		model.addAttribute("cats", this.appService.findAllCats());
		return "index.jsp";
	}
	
	// GET for ProductsObjs page
	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute("prod") Products productObjs) {
		return "product.jsp";
	}
	
	// POST Route to Create ProductsObjs
	@PostMapping("/created/prod")
	public String createProduct(@Valid @ModelAttribute("prod") Products productObjs, BindingResult result) {
		if(result.hasErrors()) {
			return "product.jsp";
		}
		this.appService.createProduct(productObjs);
		return "redirect:/";
	}
	
	// GET route for CategroyObjs
	@GetMapping("/categories/new")
	public String newCategory(@ModelAttribute("category") Categories categoryObjs) {
		return "categories.jsp";
	}
	
	// POST route to Create CategoryObjs
	@PostMapping("/created/cat")
	public String createCategory(@Valid @ModelAttribute("category") Categories categoryObjs, BindingResult result) {
		if(result.hasErrors()) {
			return "categories.jsp";
		}
		this.appService.createCategory(categoryObjs);
		return "redirect:/";
	}
	
	// GET route to show one Product to add Categories to
	@GetMapping("/show/{id}")
	public String showProd(@PathVariable("id") Long id, Model model) {
		// gaining access to this object from the URL
		Products oneProd = this.appService.findOneProd(id);
		// putting the actual Product object in the model so I can use its attributes on the Front-end
		model.addAttribute("products", oneProd);
		// returns a list of Categories not in a Product
		model.addAttribute("notInProduct", this.appService.findCatsNotInProd(oneProd));
		return "showProduct.jsp";
	}
	
	// working with a regular HTML form instead of a jsp form:form
	// POST route to add a Category to a Product
	@PostMapping("/addCat/{id}")
	public String addCat(@RequestParam("categories") Long id, @PathVariable("id") Long productId) {
		Products prodToAddCatTo = this.appService.findOneProd(productId);
		Categories catToAdd = this.appService.findOneCat(id);
		this.appService.addCategory(prodToAddCatTo, catToAdd);
		return "redirect:/show/{id}";
	}
	
	// GET route to show one Category to add Products to
	@GetMapping("/showCat/{id}")
	public String showCat(@PathVariable("id") Long id, Model model) {
		Categories oneCat = this.appService.findOneCat(id);
		model.addAttribute("cats", oneCat);
		model.addAttribute("notInCategory", this.appService.findProdsNotInCat(oneCat));
		return "showCategory.jsp";
	}
	
	// POST route to add a Product to a Category
	@PostMapping("/addProd/{id}")
	public String addProd(@RequestParam("products") Long id, @PathVariable("id") Long CategoryId) {
		Categories catToAddProdTo = this.appService.findOneCat(CategoryId);
		Products prodToAdd = this.appService.findOneProd(id);
		this.appService.addProduct(catToAddProdTo, prodToAdd);
		return "redirect:/showCat/{id}";
	}
}