package com.practice.mvc.services;

// Always Remember To import My Dependences
import org.springframework.stereotype.Service;
import com.practice.mvc.repositories.BookRepository;
import java.util.List;
import com.practice.mvc.models.Book;
import java.util.Optional;

// Annotating This class To Tell Spring This Is A Service
@Service
public class BookService {

	// First I Have To Inject My Repository Interface
	// This Is The Repository Interface Instance I Will Be Using
	// The Variable Will Be Calling/Invoking All Of The Method Signatures From My Repository Interface
	private final BookRepository bookRepository;
	
	// NOW I'm Using Dependency Injection To Have The Repository Interface Available To Me To Call/Invoke
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    // Creates a book. "save()" Is Also The Method I Call To Update A Book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
    // retrieves a book/ Optional Means It Could Exists Or Not
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        }
        else {
            return null;
        }
    }

    // To Update A Book
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages)
    {
    	Optional<Book> book = bookRepository.findById(id);
    	if(book.isPresent()) {
    		Book holdingInstance = book.get();
    		return bookRepository.save(holdingInstance);
    	}
    	else {
    		return null;
    	}
     }

    // To Delete A Book
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
     }
}