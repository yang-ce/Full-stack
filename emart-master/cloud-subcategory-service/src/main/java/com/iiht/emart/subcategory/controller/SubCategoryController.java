package com.iiht.emart.subcategory.controller;

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

import com.iiht.emart.subcategory.entity.SubCategoryEntity;
import com.iiht.emart.subcategory.service.SubCategoryBusiness;


@RestController
@RequestMapping("/api/subcategory")
//@CrossOrigin(origins="http://localhost:4200")
public class SubCategoryController {
	@Autowired
	private SubCategoryBusiness subCategoryBusiness;

	/**
	 *
	 * @return
	 */
	@GetMapping
	public List<SubCategoryEntity> findAllCategory(){

		return subCategoryBusiness.findAllCategory();
	}
	@GetMapping("/{id}")
	public ResponseEntity<SubCategoryEntity> findById(@PathVariable Integer id){
		SubCategoryEntity subCategoryEntity = subCategoryBusiness.findById(id);
		return ResponseEntity.ok(subCategoryEntity);
	}

	@PostMapping
	public ResponseEntity<SubCategoryEntity> create(SubCategoryEntity subCategory){
		SubCategoryEntity subCategoryEntity = subCategoryBusiness.createSubCategory(subCategory);
		return ResponseEntity.status(HttpStatus.CREATED).body(subCategoryEntity);
	}

	@PutMapping
	public ResponseEntity<SubCategoryEntity> update(SubCategoryEntity subCategory){
		SubCategoryEntity subCategoryEntity = subCategoryBusiness.updateSubCategory(subCategory);
		return ResponseEntity.ok(subCategoryEntity);
	}


	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		subCategoryBusiness.delete(id);
		return ResponseEntity.ok("Delete subcategory successfully.");
	}
}
