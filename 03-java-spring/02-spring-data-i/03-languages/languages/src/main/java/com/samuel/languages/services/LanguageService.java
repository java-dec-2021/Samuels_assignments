// This class Contains My Business Logic

// This Is The Name Of The Package I Am In
package com.samuel.languages.services;

// Always import My Dependencies
import org.springframework.stereotype.Service;
import com.samuel.languages.models.Language;
import com.samuel.languages.repositories.LanguageRepository;
import java.util.List;

// This Tells Spring That This Is A service class
@Service
public class LanguageService {
	// I have To Inject My Repository To Use The CrudRepository Functionality
	private final LanguageRepository languageRepository;
	
	// Have To Use Dependency Injection To Have The Repository Available To This class
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	// Writing Methods To Wrap My CrudRepository Interface In
	
	public List<Language> allLanguages() {
		return languageRepository.findAll();
	}
	
	public Language createLanguage(Language lang) {
		return languageRepository.save(lang);
	}
	
	public Language findALanguage(Long id) {
		 return languageRepository.findById(id).orElse(null);
	}
	
	public Language updateLanguage(Language langObject) {
			return languageRepository.save(langObject);
	}

	public void deleteLanguage(Long id) {
		languageRepository.deleteById(id);
	}
}