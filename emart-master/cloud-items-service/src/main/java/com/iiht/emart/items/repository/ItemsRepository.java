package com.iiht.emart.items.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.emart.items.entity.ItemsEntity;




@Repository
public interface ItemsRepository extends JpaRepository<ItemsEntity, Integer>{

	public List<ItemsEntity> findAll();

	public ItemsEntity findById(Integer id);
}
