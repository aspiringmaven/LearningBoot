package me.sumitkawatra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import me.sumitkawatra.model.Book;
import me.sumitkawatra.model.Category;
import me.sumitkawatra.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/categories/{categoryId}/books")
	public List<Book> getAllBooks(@PathVariable("categoryId") String categoryId) {
		return bookService.findByCategoryId(categoryId);
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.findAllBooks();
	}
	
	@PostMapping("/categories/{categoryId}/books")
	public void addBook(@PathVariable("categoryId") String categoryId, @RequestBody Book book) {
		book.setCategory( new Category(categoryId, "", ""));
		bookService.addBook(book);
	}
	
	@PutMapping("/categories/{categoryId}/books/{isbn}")
	public void updateBook(@PathVariable("categoryId") String categoryId, @PathVariable("isbn") String isbn,@RequestBody Book book) {
		book.setCategory( new Category(categoryId, "", ""));
		book.setIsbn(isbn);
		bookService.addBook(book);
	}
	
	@DeleteMapping("/categories/{categoryId}/books/{isbn}")
	public void addBook(@PathVariable("categoryId") String categoryId, @PathVariable("isbn") String isbn) {
		bookService.deleteBook(isbn);
	}
	
	
	
	

	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	
}
