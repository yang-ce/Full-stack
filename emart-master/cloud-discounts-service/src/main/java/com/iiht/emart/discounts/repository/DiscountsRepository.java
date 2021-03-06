package com.iiht.emart.discounts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.emart.discounts.entity.DiscountsEntity;




@Repository
public interface DiscountsRepository extends JpaRepository<DiscountsEntity, Integer>{

	public List<DiscountsEntity> findAll();

	public DiscountsEntity findById(Integer id);
}
