package com.samuel.manytomany.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samuel.manytomany.models.Products;
import com.samuel.manytomany.models.Categories;


@Repository
public interface ProductsInterface extends CrudRepository<Products, Long> {

	List<Products> findAll();
	
	// Retrieves a list of all categories for a particular product
    List<Products> findByCategoriesObjsNotContains(Categories categoriesObjs);
}