package com.iiht.emart.category.service;

import java.util.List;

import com.iiht.emart.category.entity.CategoryEntity;



public interface CategoryService {

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */
	public List<CategoryEntity> findAllCategory();

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */

	public CategoryEntity findCategoryById(Integer id);

	/**
	 * ����ID��ѯһ���û�
	 *
	 * @param
	 * @return
	 */

	public CategoryEntity createCategory(CategoryEntity category);

	/**
	 * �����û���Ϣ
	 *
	 * @param user
	 * @return
	 */
	public CategoryEntity updateCategory(CategoryEntity category);

	/**
	 * �����û�
	 *
	 * @param id
	 * @return
	 */

	public void delete(Integer id);
}
