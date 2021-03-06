package com.iiht.emart.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.emart.category.entity.CategoryEntity;
import com.iiht.emart.category.repository.CategoryRepository;


@Service
public class CategoryBusiness implements CategoryService{
	@Autowired
	private CategoryRepository categoryRepository;



	public List<CategoryEntity> findAllCategory() {
		// TODO 自動生成されたメソッド・スタブ
		return categoryRepository.findAll();
	}



	public CategoryEntity createCategory(CategoryEntity category) {
		// TODO 自動生成されたメソッド・スタブ
		return categoryRepository.save(category);
	}



	public CategoryEntity updateCategory(CategoryEntity category) {
		// TODO 自動生成されたメソッド・スタブ
		return categoryRepository.save(category);
	}



	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ

	}


	public CategoryEntity findCategoryById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return categoryRepository.findById(id);
	}
}
