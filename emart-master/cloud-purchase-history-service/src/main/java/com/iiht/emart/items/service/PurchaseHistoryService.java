package com.iiht.emart.items.service;

import java.util.List;

import com.iiht.emart.items.entity.PurchaseHistoryEntity;



public interface PurchaseHistoryService {

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */
	public List<PurchaseHistoryEntity> findAll();
	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */

	public PurchaseHistoryEntity findById(Integer id);

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */

	public PurchaseHistoryEntity createPurchaseHistory(PurchaseHistoryEntity purchaseHistory);

	/**
	 * �����û���Ϣ
	 *
	 * @param user
	 * @return
	 */
	public PurchaseHistoryEntity updatePurchaseHistory(PurchaseHistoryEntity purchaseHistory);

	/**
	 * �����û�
	 *
	 * @param id
	 * @return
	 */

	public void delete(Integer id);
}
