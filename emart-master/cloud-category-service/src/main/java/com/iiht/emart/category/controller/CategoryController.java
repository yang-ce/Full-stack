package com.iiht.emart.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.emart.category.entity.CategoryEntity;
import com.iiht.emart.category.service.CategoryBusiness;


@RestController
@RequestMapping("/api/category")
//@CrossOrigin(origins="http://localhost:8090")
public class CategoryController {
	@Autowired
	private CategoryBusiness categoryBusiness;

	/**
	 *
	 * @return
	 */
	@GetMapping
	public List<CategoryEntity> findAllCategory(){

		return categoryBusiness.findAllCategory();
	}

	@GetMapping("/{id}")
	public ResponseEntity<CategoryEntity> findById(@PathVariable Integer id){
		CategoryEntity categoryEntity = categoryBusiness.findCategoryById(id);
		return ResponseEntity.ok(categoryEntity);
	}

	@PostMapping
	public ResponseEntity<CategoryEntity> create(CategoryEntity category){
		CategoryEntity categoryEntity = categoryBusiness.createCategory(category);
		return ResponseEntity.status(HttpStatus.CREATED).body(categoryEntity);
	}

	@PutMapping
	public ResponseEntity<CategoryEntity> update(CategoryEntity category){
		CategoryEntity categoryEntity = categoryBusiness.updateCategory(category);
		return ResponseEntity.ok(categoryEntity);
	}


	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		categoryBusiness.delete(id);
		return ResponseEntity.ok("Delete category successfully.");
	}
}
