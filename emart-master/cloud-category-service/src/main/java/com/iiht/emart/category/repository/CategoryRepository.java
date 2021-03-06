package com.iiht.emart.category.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.emart.category.entity.CategoryEntity;




@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer>{

	public List<CategoryEntity> findAll();

	public CategoryEntity findById(Integer id);



}
