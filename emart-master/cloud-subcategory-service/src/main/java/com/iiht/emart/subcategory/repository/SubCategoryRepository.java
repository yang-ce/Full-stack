package com.iiht.emart.subcategory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.emart.subcategory.entity.SubCategoryEntity;




@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategoryEntity, Integer>{

	public List<SubCategoryEntity> findAll();

	public SubCategoryEntity findById(Integer id);
}
