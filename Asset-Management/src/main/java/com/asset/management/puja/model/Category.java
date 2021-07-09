package com.asset.management.puja.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Category {
   @Id
//   @GeneratedValue(strategy = GenerationType.AUTO)
	private Long categoryId;
   
    private String categoryName;
    
    private String discription;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    //@JoinColumn(name="CP_FK",referencedColumnName="categoryName")
    private Set<Assets>assets = new HashSet<>();
    
    

	public Set<Assets> getAssets() {
		return assets;
	}

	public void setAssets(Set<Assets> assets) {
		this.assets = assets;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", discription=" + discription
				+ "]";
	}

	public Category(Long categoryId, String categoryName, String discription) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.discription = discription;
	}

	public Category() {
		super();
	}
    
    
}
