package com.iiht.emart.subcategory.service;

import java.util.List;

import com.iiht.emart.subcategory.entity.SubCategoryEntity;



public interface SubCategoryService {

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */
	public List<SubCategoryEntity> findAllCategory();
	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */

	public SubCategoryEntity findById(Integer id);
	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */

	public SubCategoryEntity createSubCategory(SubCategoryEntity category);

	/**
	 * �����û���Ϣ
	 *
	 * @param user
	 * @return
	 */
	public SubCategoryEntity updateSubCategory(SubCategoryEntity category);

	/**
	 * �����û�
	 *
	 * @param id
	 * @return
	 */

	public void delete(Integer id);
}
