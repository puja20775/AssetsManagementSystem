package com.asset.management.puja.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Assets {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long assetId;
	
	private String assetName;
	
	private String purchaseDate;
	
	private String conditionNotes;
	
	private String categoryName;
	
	private String status;
	
//mapping with category	
	@ManyToOne(fetch = FetchType.LAZY)
	private Category category;
	
//mapping with employee	
	@OneToOne(fetch = FetchType.LAZY , optional = false)
	@JoinColumn(name="empId" , nullable =false)
	private Employee employee;
	
	

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getConditionNotes() {
		return conditionNotes;
	}

	public void setConditionNotes(String conditionNotes) {
		this.conditionNotes = conditionNotes;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Assets [assetId=" + assetId + ", assetName=" + assetName + ", purchaseDate=" + purchaseDate
				+ ", conditionNotes=" + conditionNotes + ", categoryName=" + categoryName + ", status=" + status + "]";
	}

	public Assets(Long assetId, String assetName, String purchaseDate, String conditionNotes, String categoryName,
			String status) {
		super();
		this.assetId = assetId;
		this.assetName = assetName;
		this.purchaseDate = purchaseDate;
		this.conditionNotes = conditionNotes;
		this.categoryName = categoryName;
		this.status = status;
	}

	public Assets() {
		super();
	}
	
	
}
