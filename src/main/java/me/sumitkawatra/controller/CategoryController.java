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

import me.sumitkawatra.model.Category;
import me.sumitkawatra.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	
	@GetMapping(value="/categories" )
	public List<Category> getAllCategories() {
		return categoryService.getAllCategories();
	}
	
	@PostMapping(value="/categories")
	public void addCategory(@RequestBody Category category) {
		categoryService.addCategory(category);
	}
	
	@PutMapping(value="/categories/{categoryId}")
	public void updateCategory(@PathVariable("categoryId") String categoryId,@RequestBody Category category) {
		category.setId(categoryId);
		categoryService.updateCategory(category);
	}
	
	@DeleteMapping(value="/categories/{categoryId}")
	public void updateCategory(@PathVariable("categoryId") String categoryId) {
		categoryService.deleteCategory(categoryId);
	}
	
	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
}
