package com.samuel.manytomany.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.manytomany.models.Categories;
import com.samuel.manytomany.models.Products;
import com.samuel.manytomany.repositories.CategoriesInterface;
import com.samuel.manytomany.repositories.ProductsInterface;


@Service
public class AppService {

	@Autowired
	private CategoriesInterface cRepo;
	
	@Autowired
	private ProductsInterface pRepo;
	
	// save a Product
	public Products createProduct(Products product) {
		return this.pRepo.save(product);
	}
	
	// Find one Product
	public Products findOneProd(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	// Find all Products
	public List<Products> findAll() {
		return this.pRepo.findAll();
	}
	
	// save a category
	public Categories createCategory(Categories category) {
		return this.cRepo.save(category);
	}
	
	// Find one Category
	public Categories findOneCat(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	// Find all Categories
	public List<Categories> findAllCats() {
		return this.cRepo.findAll();
	}
	
	// lists Categories that a Product does not have /  this is coming from the datastore
	public List<Categories> findCatsNotInProd(Products productsObjs) {
		return this.cRepo.findByProductsObjsNotContains(productsObjs);
	}
	
	// lists Products that a Category does not have /  this is coming from the datastore
	public List<Products> findProdsNotInCat(Categories categoriesObjs) {
		return this.pRepo.findByCategoriesObjsNotContains(categoriesObjs);
	}
	
	// to actually add a Category to a Product
	public void addCategory(Products productsObjs, Categories categoriesObjs) {
		List<Categories> catsToAdd = productsObjs.getCategoriesObjs();
		catsToAdd.add(categoriesObjs);
		this.pRepo.save(productsObjs);
	}
	
	// to actually add a Product to a Category
	public void addProduct(Categories categoriesObjs, Products productsObjs) {
		List<Products> prodsToAdd = categoriesObjs.getProductsObjs();
		prodsToAdd.add(productsObjs);
		this.cRepo.save(categoriesObjs);
	}
}