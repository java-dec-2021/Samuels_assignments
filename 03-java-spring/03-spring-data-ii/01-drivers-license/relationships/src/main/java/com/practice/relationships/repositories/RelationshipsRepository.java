package com.practice.relationships.repositories;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.practice.relationships.models.PersonModel;


@Repository
public interface RelationshipsRepository extends CrudRepository<PersonModel, Long> {
	
	List<PersonModel> findAll();
	List<PersonModel> findByLicenseModelIdIsNull();
}