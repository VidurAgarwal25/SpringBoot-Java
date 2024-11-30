package springboot.devtools.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.devtools.entities.Book;
import springboot.devtools.services.BookService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class BookController {
	
	@Autowired
	private BookService bookService ;

	@GetMapping("/books")
	public List<Book> getBooks() {		
		return this.bookService.getAllBooks();	
	}
	
	@GetMapping("/book/{id}")
	public Book getBook(@PathVariable("id") int id) {		
		return this.bookService.getBookById(id);	
	}
	
	@PostMapping("/addbook")
	public Book createBook(@RequestBody Book book) {
		 this.bookService.addBook(book);
		 return book;
	}
	
	@DeleteMapping("/deletebook")
	public Book deleteBook(@RequestBody Book book) {
		 this.bookService.deleteBook(book);
		 return book;
	}
	
	@PutMapping("update/{id}")
	public Book putMethodName(@PathVariable("id") int id, @RequestBody Book entity) {
		//TODO: process PUT request
		this.bookService.updateBook(id,entity);
		return entity;
	}
}
