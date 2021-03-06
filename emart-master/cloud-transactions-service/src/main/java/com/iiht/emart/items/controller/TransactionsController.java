package com.iiht.emart.items.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.emart.items.entity.TransactionsEntity;
import com.iiht.emart.items.service.TransactionsBusiness;


@RestController
@RequestMapping("/api/transactions")
//@CrossOrigin(origins="http://localhost:4200")
public class TransactionsController {
	@Autowired
	private TransactionsBusiness transactionsBusiness;

	/**
	 *
	 * @return
	 */
	@GetMapping
	public List<TransactionsEntity> findAll(){

		return transactionsBusiness.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<TransactionsEntity> findById(@PathVariable Integer id){
		TransactionsEntity transactionsEntity = transactionsBusiness.findById(id);
		return ResponseEntity.ok(transactionsEntity);
	}

	@PostMapping
	public ResponseEntity<TransactionsEntity> create(TransactionsEntity transactions){
		TransactionsEntity transactionsEntity = transactionsBusiness.create(transactions);
		return ResponseEntity.status(HttpStatus.CREATED).body(transactionsEntity);
	}

	@PutMapping
	public ResponseEntity<TransactionsEntity> update(TransactionsEntity subCategory){
		TransactionsEntity transactionsEntity = transactionsBusiness.update(subCategory);
		return ResponseEntity.ok(transactionsEntity);
	}


	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		transactionsBusiness.delete(id);
		return ResponseEntity.ok("Delete category successfully.");
	}
}
