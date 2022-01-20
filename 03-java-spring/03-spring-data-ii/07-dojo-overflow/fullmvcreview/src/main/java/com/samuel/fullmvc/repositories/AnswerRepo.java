package com.samuel.fullmvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samuel.fullmvc.models.Answers;

@Repository
public interface AnswerRepo extends CrudRepository<Answers, Long> {
	
	List<Answers> findAll();

}