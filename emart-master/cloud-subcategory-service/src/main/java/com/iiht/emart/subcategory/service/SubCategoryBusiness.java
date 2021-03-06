package com.iiht.emart.subcategory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.emart.subcategory.entity.SubCategoryEntity;
import com.iiht.emart.subcategory.repository.SubCategoryRepository;


@Service
public class SubCategoryBusiness implements SubCategoryService{
	@Autowired
	private SubCategoryRepository subCategoryRepository;



	public List<SubCategoryEntity> findAllCategory() {
		// TODO 自動生成されたメソッド・スタブ
		return subCategoryRepository.findAll();
	}

	public SubCategoryEntity findById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return subCategoryRepository.findById(id);
	}

	public SubCategoryEntity createSubCategory(SubCategoryEntity subCategory) {
		// TODO 自動生成されたメソッド・スタブ
		return subCategoryRepository.save(subCategory);
	}



	public SubCategoryEntity updateSubCategory(SubCategoryEntity subCategory) {
		// TODO 自動生成されたメソッド・スタブ
		return subCategoryRepository.save(subCategory);
	}



	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
