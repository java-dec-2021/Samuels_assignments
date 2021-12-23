package com.practice.mvc.repositories;

// Always import My Dependences
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.practice.mvc.models.Book;
import java.util.List;

// Annotate This class To Tell Spring This Is A Repository
@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

    // this method retrieves all the books from the database
    List<Book> findAll();
    
    // Examples Of What The CrudRepository Can Do/Create
    
//    // this method finds books with descriptions containing the search string
//    List<Book> findByDescriptionContaining(String search);
//    // this method counts how many titles contain a certain string
//    Long countByTitleContaining(String search);
//    // this method deletes a book that starts with a specific title
//    Long deleteByTitleStartingWith(String search);
}