package com.practice.mvc.controllers;

// import My Dependences Always!!!
import org.springframework.web.bind.annotation.RestController;
import com.practice.mvc.services.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import com.practice.mvc.models.Book;

// This Controller Renders Raw Data Or JSON
@RestController
public class BooksApi {

	// First I Have To Inject My Service class
	// This Is The Service class Instance I Will Be Using
	// The Variable Will Be Calling/Invoking All Of The Method Signatures From My Service class
	private final BookService bookService;

	// NOW I'm Using Dependency Injection To Have The Service class Available To Me To Call/Invoke
	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}

	// This Method Returns The "bookService.allBooks()", Which In Turn Calls The "allBooks()" Method In My "BookService", Which Returns The "findAll()" Method Which Is Then Called In My "BookRepository" 
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }
    
    // Route To Create A Book In The Database
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(
    		@RequestParam(value="title") String title,
    		@RequestParam(value="description") String desc,
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="pages") Integer numOfPages)
    {
    	// Calls The "Book" Constructor From My "Book" class
        Book book = new Book(title, desc, lang, numOfPages);
        // Returns The "save(b)" Method From The "createBook()" Method In My "BookService" Service Layer
        return bookService.createBook(book);
    }
    
    // Route To Display A Single Book
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    
    // Route To Update A Single Book
    @RequestMapping(value="/api/books/update/{id}", method=RequestMethod.PUT)
    public Book create(
    		@PathVariable("id") Long id,
    		@RequestParam(value="title") String title,
    		@RequestParam(value="description") String desc,
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="pages") Integer numOfPages)
    {
        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
        return book;
    }
    
    // Route To Delete A Single Book
    @RequestMapping(value="/api/books/delete/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}