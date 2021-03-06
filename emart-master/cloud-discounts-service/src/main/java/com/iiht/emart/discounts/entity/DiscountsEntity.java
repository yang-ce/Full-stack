package com.iiht.emart.discounts.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="e_discounts")
public class DiscountsEntity {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="DISCONT_CODE")
	public Integer getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(Integer discountCode) {
		this.discountCode = discountCode;
	}
	@Column(name="PERCENTAGE")
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	@Column(name="START_DATE")
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@Column(name="END_DATE")
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Column(name="REMARKS")
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	private Integer discountCode;
	private Double percentage;
	private Date startDate;
	private Date endDate;
	private String remarks;





}
