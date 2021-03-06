package com.iiht.emart.items.service;

import java.util.List;

import com.iiht.emart.items.entity.TransactionsEntity;



public interface TransactionsService {

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */
	public List<TransactionsEntity> findAll();

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */

	public TransactionsEntity findById(Integer id);

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */


	public TransactionsEntity create(TransactionsEntity category);

	/**
	 * �����û���Ϣ
	 *
	 * @param user
	 * @return
	 */
	public TransactionsEntity update(TransactionsEntity category);

	/**
	 * �����û�
	 *
	 * @param id
	 * @return
	 */

	public void delete(Integer id);
}
