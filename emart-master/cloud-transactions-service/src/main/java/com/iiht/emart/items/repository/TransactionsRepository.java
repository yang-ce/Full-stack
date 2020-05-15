package com.iiht.emart.items.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.emart.items.entity.TransactionsEntity;




@Repository
public interface TransactionsRepository extends JpaRepository<TransactionsEntity, Integer>{

	public List<TransactionsEntity> findAll();

	public TransactionsEntity findById(Integer id);
}
