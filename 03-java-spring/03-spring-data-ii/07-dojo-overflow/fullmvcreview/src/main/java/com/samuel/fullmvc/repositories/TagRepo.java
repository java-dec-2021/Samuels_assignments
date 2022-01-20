package com.samuel.fullmvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samuel.fullmvc.models.Tags;

@Repository
public interface TagRepo extends CrudRepository<Tags, Long> {
	
	List<Tags> findAll();
	
	boolean existsBySubject(String subject);
	
	Tags findBySubject(String subject);

}