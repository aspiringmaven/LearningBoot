package me.sumitkawatra.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	private String isbn;
	private String title;
	private String author;
	@ManyToOne
	private Category category;

	public Book() {
		super();
	}

	public Book(String isbn, String title, String author, String categoryId) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.category = new Category(categoryId, "", "");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [isbn=");
		builder.append(isbn);
		builder.append(", title=");
		builder.append(title);
		builder.append(", author=");
		builder.append(author);
		builder.append(", category=");
		builder.append(category);
		builder.append("]");
		return builder.toString();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
