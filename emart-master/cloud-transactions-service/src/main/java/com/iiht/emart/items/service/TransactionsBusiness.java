package com.iiht.emart.items.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.emart.items.entity.TransactionsEntity;
import com.iiht.emart.items.repository.TransactionsRepository;


@Service
public class TransactionsBusiness implements TransactionsService{
	@Autowired
	private TransactionsRepository transactionsRepository;



	public List<TransactionsEntity> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return transactionsRepository.findAll();
	}

	public TransactionsEntity findById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return transactionsRepository.findById(id);
	}

	public TransactionsEntity create(TransactionsEntity transactions) {
		// TODO 自動生成されたメソッド・スタブ
		return transactionsRepository.save(transactions);
	}



	public TransactionsEntity update(TransactionsEntity transactions) {
		// TODO 自動生成されたメソッド・スタブ
		return transactionsRepository.save(transactions);
	}



	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
