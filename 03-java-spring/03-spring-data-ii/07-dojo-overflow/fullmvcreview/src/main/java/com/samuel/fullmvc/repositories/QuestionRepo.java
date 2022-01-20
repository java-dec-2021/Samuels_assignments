package com.samuel.fullmvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samuel.fullmvc.models.Questions;

@Repository
public interface QuestionRepo extends CrudRepository<Questions, Long> {
	
	List<Questions> findAll();

}