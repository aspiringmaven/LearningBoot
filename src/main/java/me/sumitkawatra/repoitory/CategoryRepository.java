package me.sumitkawatra.repoitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.sumitkawatra.model.Category;;

@Repository
public interface CategoryRepository extends CrudRepository<Category, String> {

}
