package com.iiht.emart.subcategory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="e_sub_category")
public class SubCategoryEntity {

	private Integer id;
	private String subCategoryName;
	private Integer categoryId;
	private String brief;
	private Double GST;


	@Id
	@GeneratedValue
	@Column(name="ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="CATEGORY_ID")
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name="SUB_CATEGORY_NAME")
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	@Column(name="BRIEF")
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}

	@Column(name="GST")
	public Double getGST() {
		return GST;
	}
	public void setGST(Double GST) {
		this.GST = GST;
	}


}
