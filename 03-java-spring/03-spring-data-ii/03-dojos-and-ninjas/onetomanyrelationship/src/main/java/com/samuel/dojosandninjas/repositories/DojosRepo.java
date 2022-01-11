package com.samuel.dojosandninjas.repositories;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.samuel.dojosandninjas.models.Dojos;


@Repository
public interface DojosRepo extends CrudRepository<Dojos, Long> {
	
	List<Dojos> findAll();

}