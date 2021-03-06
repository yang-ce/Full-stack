package com.iiht.emart.items.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.emart.items.entity.PurchaseHistoryEntity;




@Repository
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistoryEntity, Integer>{

	public List<PurchaseHistoryEntity> findAll();

	public PurchaseHistoryEntity findById(Integer id);
}
