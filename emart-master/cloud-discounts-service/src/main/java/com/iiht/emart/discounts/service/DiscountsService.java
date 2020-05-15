package com.iiht.emart.discounts.service;

import java.util.List;

import com.iiht.emart.discounts.entity.DiscountsEntity;



public interface DiscountsService {

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */
	public List<DiscountsEntity> findAll();

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */

	public DiscountsEntity findById(Integer id);

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */

	public DiscountsEntity create(DiscountsEntity discounts);

	/**
	 * �����û���Ϣ
	 *
	 * @param user
	 * @return
	 */
	public DiscountsEntity update(DiscountsEntity discounts);

	/**
	 * �����û�
	 *
	 * @param id
	 * @return
	 */

	public void delete(Integer id);
}
