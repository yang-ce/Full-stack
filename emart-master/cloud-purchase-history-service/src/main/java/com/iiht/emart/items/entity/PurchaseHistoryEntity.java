package com.iiht.emart.items.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="e_purchase_history")
public class PurchaseHistoryEntity {
	private Integer id;
	private Integer buyerId;
	private Integer sellerId;
	private Integer transactionId;
	private Integer itemsNum;
	private Date transactionDate;
	private String remark;


	@Id
	@GeneratedValue
	@Column(name="ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="BUYER_ID")
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	@Column(name="SELLER_ID")
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	@Column(name="TRANSACTION_ID")
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	@Column(name="NUMBER_OF_ITEMS")
	public Integer getItemsNum() {
		return itemsNum;
	}
	public void setItemsNum(Integer itemsNum) {
		this.itemsNum = itemsNum;
	}
	@Column(name="TRANSACTION_DATE")
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	@Column(name="REMARK")
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
