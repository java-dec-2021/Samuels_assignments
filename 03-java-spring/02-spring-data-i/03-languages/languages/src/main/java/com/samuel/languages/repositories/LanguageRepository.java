// The Repositories Are Going To Be How I Query The Information From My Database
// (Create/Read/Update/Delete)

// Name Of The Package I Am In
package com.samuel.languages.repositories;

import java.util.List;

// Always import Dependencies
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.samuel.languages.models.Language;

// This Annotation Tells Spring This class Is A Repository
// Also This Manages Which Dependencies To import
@Repository
// Then I Want To Extend(Inherit) From The CrudRepository
// Long Is The Type Of My Primary Key
public interface LanguageRepository extends CrudRepository<Language, Long>{

    // this method retrieves all the languages from the database
    List<Language> findAll();

}