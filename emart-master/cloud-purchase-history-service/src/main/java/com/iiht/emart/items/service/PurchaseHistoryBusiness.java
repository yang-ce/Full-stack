package com.iiht.emart.items.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.emart.items.entity.PurchaseHistoryEntity;
import com.iiht.emart.items.repository.PurchaseHistoryRepository;


@Service
public class PurchaseHistoryBusiness implements PurchaseHistoryService{
	@Autowired
	private PurchaseHistoryRepository purchaseHistoryRepository;



	public List<PurchaseHistoryEntity> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return purchaseHistoryRepository.findAll();
	}

	public PurchaseHistoryEntity findById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return purchaseHistoryRepository.findById(id);
	}

	public PurchaseHistoryEntity createPurchaseHistory(PurchaseHistoryEntity subCategory) {
		// TODO 自動生成されたメソッド・スタブ
		return purchaseHistoryRepository.save(subCategory);
	}



	public PurchaseHistoryEntity updatePurchaseHistory(PurchaseHistoryEntity subCategory) {
		// TODO 自動生成されたメソッド・スタブ
		return purchaseHistoryRepository.save(subCategory);
	}



	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ

	}



}
