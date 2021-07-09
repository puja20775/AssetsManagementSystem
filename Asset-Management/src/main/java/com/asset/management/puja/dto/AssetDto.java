package com.asset.management.puja.dto;

public class AssetDto {
private Long assetId;
	
	private String assetName;
	
	private String purchaseDate;
	
	private String conditionNotes;
	
	private String categoryName;
	
	private String status;

	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}

	public  String getAssetName() {
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

	public AssetDto(Long assetId, String assetName, String purchaseDate, String conditionNotes, String categoryName,
			String status) {
		super();
		this.assetId = assetId;
		this.assetName = assetName;
		this.purchaseDate = purchaseDate;
		this.conditionNotes = conditionNotes;
		this.categoryName = categoryName;
		this.status = status;
	}
	
	

}
