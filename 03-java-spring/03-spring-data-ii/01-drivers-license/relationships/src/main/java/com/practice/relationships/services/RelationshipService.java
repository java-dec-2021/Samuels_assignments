// Since The Person And License Are  kind Of Working Within One Another,
// I Can Create One Service Class, But Usually I Want To Separate Them Respectively.
package com.practice.relationships.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practice.relationships.models.LicenseModel;
import com.practice.relationships.models.PersonModel;
import com.practice.relationships.repositories.LicenseRepository;
import com.practice.relationships.repositories.RelationshipsRepository;


@Service
public class RelationshipService {
	
	@Autowired
	private RelationshipsRepository relationshipsRepository;
	
	@Autowired
	private LicenseRepository licenseRepository;
	
	// Same As Autowired
//	private final RelationshipsRepository relationshipsRepository;
//	private final LicenseRepository licenseRepository;
//	public RelationshipsService(RelationshipsRepository relationshipsRepository, LicenseRepsoitory licenseRepository) {
//		this.relationshipsRepository = relationshipsRepository;
//		this.licenseRepository = licenseRepository;
//	}

	public List<PersonModel> allPersons() {
		return this.relationshipsRepository.findAll();
	}
	
	public PersonModel createPerson(PersonModel person) {
		return this.relationshipsRepository.save(person);
	}
	
	// Remember On Optional's I Need Too Tell Spring What To Return If No Object Is Found
	public PersonModel findAPerson(Long id) {
		return this.relationshipsRepository.findById(id).orElse(null);
	}
	
	public List<PersonModel> getUnlicensedPersons() {
		return this.relationshipsRepository.findByLicenseModelIdIsNull();
	}
	
	public LicenseModel createLicense(LicenseModel licenseObj) {
		licenseObj.setNumber(generateLicenseNumber());
		return this.licenseRepository.save(licenseObj);
	}
	
	public int generateLicenseNumber() {
		LicenseModel license = this.licenseRepository.findTopByOrderByNumberDesc();
		if(license == null) {
			return 1;
		}
		int previousLicenseNumber = license.getNumber();
		previousLicenseNumber++;
		return (previousLicenseNumber);
			
	}
}