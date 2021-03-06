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

import com.iiht.emart.items.entity.PurchaseHistoryEntity;
import com.iiht.emart.items.service.PurchaseHistoryBusiness;


@RestController
@RequestMapping("/api/purchaseHistory")
//@CrossOrigin(origins="http://localhost:4200")
public class PurchaseHistoryController {
	@Autowired
	private PurchaseHistoryBusiness purchaseHistoryBusiness;

	/**
	 *
	 * @return
	 */
	@GetMapping
	public List<PurchaseHistoryEntity> findAllPurchaseHistory(){

		return purchaseHistoryBusiness.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<PurchaseHistoryEntity> findById(@PathVariable Integer id){
		PurchaseHistoryEntity purchaseHistoryEntity = purchaseHistoryBusiness.findById(id);
		return ResponseEntity.ok(purchaseHistoryEntity);
	}

	@PostMapping
	public ResponseEntity<PurchaseHistoryEntity> create(PurchaseHistoryEntity purchaseHistory){
		PurchaseHistoryEntity purchaseHistoryEntity = purchaseHistoryBusiness.createPurchaseHistory(purchaseHistory);
		return ResponseEntity.status(HttpStatus.CREATED).body(purchaseHistoryEntity);
	}

	@PutMapping
	public ResponseEntity<PurchaseHistoryEntity> update(PurchaseHistoryEntity purchaseHistory){
		PurchaseHistoryEntity purchaseHistoryEntity = purchaseHistoryBusiness.updatePurchaseHistory(purchaseHistory);
		return ResponseEntity.ok(purchaseHistoryEntity);
	}


	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		purchaseHistoryBusiness.delete(id);
		return ResponseEntity.ok("Delete category successfully.");
	}
}
