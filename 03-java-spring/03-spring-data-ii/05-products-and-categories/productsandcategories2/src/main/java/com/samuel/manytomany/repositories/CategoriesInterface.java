package com.samuel.manytomany.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samuel.manytomany.models.Categories;
import com.samuel.manytomany.models.Products;


@Repository
public interface CategoriesInterface extends CrudRepository<Categories, Long> {

	List<Categories> findAll();
	
    // Retrieves a list of any categories a particular product
    // does not belong to.
    List<Categories> findByProductsObjsNotContains(Products productsObjs);
}