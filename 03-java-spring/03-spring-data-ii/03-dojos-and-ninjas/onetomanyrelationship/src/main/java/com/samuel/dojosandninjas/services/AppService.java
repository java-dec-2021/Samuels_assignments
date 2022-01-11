package com.samuel.dojosandninjas.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.samuel.dojosandninjas.models.Dojos;
import com.samuel.dojosandninjas.models.Ninjas;
import com.samuel.dojosandninjas.repositories.DojosRepo;
import com.samuel.dojosandninjas.repositories.NinjasRepo;


@Service
public class AppService {

	@Autowired
	private DojosRepo dojoRepo;
	
	@Autowired
	private NinjasRepo ninjaRepo;
	
	// CRUD Operations
	
	public Dojos createDojo(Dojos dojo) {
		return this.dojoRepo.save(dojo);
	}
	
	public Ninjas createNinja(Ninjas ninja) {
		return this.ninjaRepo.save(ninja);
	}

	public List<Dojos> findAll() {
		return this.dojoRepo.findAll();
	}
	
	public Dojos findOneDojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
	
}