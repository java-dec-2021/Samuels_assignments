package com.practice.mvc.controllers;

//Always import My Dependences
import org.springframework.stereotype.Controller;
import com.practice.mvc.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.ui.Model;
import java.util.List;
import com.practice.mvc.models.Book;
import org.springframework.web.bind.annotation.ModelAttribute;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;

// Controller To Render Pages
@Controller
public class BooksController {

	// First I Have To Inject My Service class Again
	// This Is The Service class Instance I Will Be Using
	// The Variable Will Be Calling/Invoking All Of The Method Signatures From My Service class
    private final BookService bookService;
    
    // NOW I'm Using Dependency Injection To Have The Service class Available To Me To Call/Invoke
    // A Constructor To Be Able To Call The Methods For My Service Layer/Business Logic
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }
    
    // To Show All The Books From My Databases
    
    @GetMapping("/books")
    // Using Model model To Access The Data (By Request) And Display In My View
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "/books/index.jsp";
    }
    
    // To Show Form To Create A New Book/ And Creates A New Book In My Database
    
    @GetMapping("/books/new")
    // Using "@ModelAttribute" To Instantiate A New Book Object
    public String newBook(@ModelAttribute("book") Book book) {
        return "/books/new.jsp";
    }
    
    @PostMapping(path="/books/new")
    // "BindingResult" Must Immediately Come After "@Valid"
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
    	// If There Are Any Errors Return The Same Page Displaying The Errors
        if (result.hasErrors()) {
            return "/books/new.jsp";
        }
        // Else Create The Book Object And Redirect To Home page Showing All The Books
        else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }

    // To Edit A Book
    
    @GetMapping("/books/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "/books/edit.jsp";
    }
    
    @PutMapping(path="/books/edit/{id}")
    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "/books/edit.jsp";
        }
        else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }
    
    // To Delete A Book
    
    @DeleteMapping(path="/books/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }
    
    // To Show One Book From Database
    
    @GetMapping("/books/show/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "/books/show.jsp";
    }
}