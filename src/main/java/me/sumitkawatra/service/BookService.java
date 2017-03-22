package me.sumitkawatra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.sumitkawatra.model.Book;
import me.sumitkawatra.repoitory.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public List<Book> findByCategoryId(String id) {
		return (List<Book>) bookRepository.findByCategoryId(id);
	}
	
	public void addBook(Book Book) {
		bookRepository.save(Book);
	}
	
	public void deleteBook(String isbn) {
		bookRepository.delete(isbn);
	}
	
	public List<Book> findAllBooks() {
		return (List<Book>) bookRepository.findAll();
	} 
	
	public void updateBook(Book book) {
		bookRepository.save(book);
	}
	

	public BookRepository getBookRepository() {
		return bookRepository;
	}

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

}
