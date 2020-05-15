package com.iiht.emart.discounts.controller;

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

import com.iiht.emart.discounts.entity.DiscountsEntity;
import com.iiht.emart.discounts.service.DiscountsBusiness;


@RestController
@RequestMapping("/api/discounts")
//@CrossOrigin(origins="http://localhost:4200")
public class DiscountsController {
	@Autowired
	private DiscountsBusiness discountsBusiness;

	/**
	 *
	 * @return
	 */
	@GetMapping
	public List<DiscountsEntity> findAll(){

		return discountsBusiness.findAll();
	}

	@PostMapping
	public ResponseEntity<DiscountsEntity> create(DiscountsEntity discounts){
		DiscountsEntity discountsEntity = discountsBusiness.create(discounts);
		return ResponseEntity.status(HttpStatus.CREATED).body(discountsEntity);
	}

	@GetMapping("/{id}")
	public ResponseEntity<DiscountsEntity> findById(@PathVariable Integer id){
		DiscountsEntity discountsEntity = discountsBusiness.findById(id);
		return ResponseEntity.ok(discountsEntity);
	}
	@PutMapping
	public ResponseEntity<DiscountsEntity> update(DiscountsEntity discounts){
		DiscountsEntity discountsEntity = discountsBusiness.update(discounts);
		return ResponseEntity.ok(discountsEntity);
	}


	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		discountsBusiness.delete(id);
		return ResponseEntity.ok("Delete discounts successfully.");
	}
}
