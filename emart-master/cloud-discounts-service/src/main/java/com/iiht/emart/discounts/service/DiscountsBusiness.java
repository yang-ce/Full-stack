package com.iiht.emart.discounts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.emart.discounts.entity.DiscountsEntity;
import com.iiht.emart.discounts.repository.DiscountsRepository;


@Service
public class DiscountsBusiness implements DiscountsService{
	@Autowired
	private DiscountsRepository discountsRepository;



	public List<DiscountsEntity> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return discountsRepository.findAll();
	}

	public DiscountsEntity findById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return discountsRepository.findById(id);
	}

	public DiscountsEntity create(DiscountsEntity discounts) {
		// TODO 自動生成されたメソッド・スタブ
		return discountsRepository.save(discounts);
	}



	public DiscountsEntity update(DiscountsEntity discounts) {
		// TODO 自動生成されたメソッド・スタブ
		return discountsRepository.save(discounts);
	}



	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
