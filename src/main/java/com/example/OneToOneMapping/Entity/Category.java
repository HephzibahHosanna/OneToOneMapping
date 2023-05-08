package com.example.OneToOneMapping.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private long categoryid;
	
	@Column(name = "name",nullable = false, unique = true)
	@NotBlank(message="category name should not be blank")
	private String name;
	
	@OneToOne(mappedBy = "categoryid")
	private Asset asset;
	
	public long getcategoryId() {
		return categoryid;
	}

	public void setId(long categoryid) {
		this.categoryid = categoryid;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category(String name) {
		super();
		this.name = name;
	}
	
	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	
	public Category(@NotBlank(message = "category name should not be blank") String name, Asset asset) {
		super();
		this.name = name;
		this.asset = asset;
	}

	public Category () {
		
	}
}
