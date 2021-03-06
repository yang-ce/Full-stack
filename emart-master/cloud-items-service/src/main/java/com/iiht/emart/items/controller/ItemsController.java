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

import com.iiht.emart.items.entity.ItemsEntity;
import com.iiht.emart.items.service.ItemsBusiness;


@RestController
@RequestMapping("/api/items")
//@CrossOrigin(origins="http://localhost:4200")
public class ItemsController {
	@Autowired
	private ItemsBusiness itemsBusiness;

	/**
	 *
	 * @return
	 */
	@GetMapping
	public List<ItemsEntity> findAllItems(){

		return itemsBusiness.findAllItems();
	}

	@GetMapping("/{id}")
	public ResponseEntity<ItemsEntity> findById(@PathVariable Integer id){
		ItemsEntity itemsEntity = itemsBusiness.findById(id);
		return ResponseEntity.ok(itemsEntity);
	}

	@PostMapping
	public ResponseEntity<ItemsEntity> create(ItemsEntity items){
		ItemsEntity itemsEntity = itemsBusiness.createItems(items);
		return ResponseEntity.status(HttpStatus.CREATED).body(itemsEntity);
	}

	@PutMapping
	public ResponseEntity<ItemsEntity> update(ItemsEntity items){
		ItemsEntity itemsEntity = itemsBusiness.updateItems(items);
		return ResponseEntity.ok(itemsEntity);
	}


	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		itemsBusiness.delete(id);
		return ResponseEntity.ok("Delete category successfully.");
	}
}
