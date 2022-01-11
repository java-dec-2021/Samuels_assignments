package com.samuel.dojosandninjas.repositories;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.samuel.dojosandninjas.models.Ninjas;


@Repository
public interface NinjasRepo extends CrudRepository<Ninjas, Long> {
	
	List<Ninjas> findAll();

}