package me.sumitkawatra.repoitory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.sumitkawatra.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String>{
	
	public List<Book> findByCategoryId(String id);
	
}
