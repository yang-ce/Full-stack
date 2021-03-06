package com.iiht.emart.items.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.emart.items.entity.ItemsEntity;
import com.iiht.emart.items.repository.ItemsRepository;


@Service
public class ItemsBusiness implements ItemsService{
	@Autowired
	private ItemsRepository itemsRepository;



	public List<ItemsEntity> findAllItems() {
		// TODO 自動生成されたメソッド・スタブ
		return itemsRepository.findAll();
	}

	public ItemsEntity findById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return itemsRepository.findById(id);
	}

	public ItemsEntity createItems(ItemsEntity itemsEntity) {
		// TODO 自動生成されたメソッド・スタブ
		return itemsRepository.save(itemsEntity);
	}



	public ItemsEntity updateItems(ItemsEntity itemsEntity) {
		// TODO 自動生成されたメソッド・スタブ
		return itemsRepository.save(itemsEntity);
	}



	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
