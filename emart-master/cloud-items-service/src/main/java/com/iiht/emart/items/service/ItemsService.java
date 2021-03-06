package com.iiht.emart.items.service;

import java.util.List;

import com.iiht.emart.items.entity.ItemsEntity;



public interface ItemsService {

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */
	public List<ItemsEntity> findAllItems();

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */

	public ItemsEntity findById(Integer id);

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */

	public ItemsEntity createItems(ItemsEntity itemsEntity);

	/**
	 * �����û���Ϣ
	 *
	 * @param user
	 * @return
	 */
	public ItemsEntity updateItems(ItemsEntity itemsEntity);

	/**
	 * �����û�
	 *
	 * @param id
	 * @return
	 */

	public void delete(Integer id);
}
