package com.practice.relationships.repositories;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.practice.relationships.models.LicenseModel;


@Repository
public interface LicenseRepository extends CrudRepository<LicenseModel, Long> {
	
	List<LicenseModel> findAll();
	LicenseModel findTopByOrderByNumberDesc();
}