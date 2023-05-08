package com.example.OneToOneMapping.Entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "assets")
public class Asset {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "asset_id")
	private long id;
	
	@Column(name = "name",nullable = false,unique = true)
	@NotBlank(message="asset name should not be blank")
	private String name;
	
	@CreationTimestamp
	private Date createdAt;
	
	@OneToOne
	@JoinColumn(name = "category_id")
	private Category categoryid;
	
	//Generated Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return categoryid;
	}

	public void setCategory(Category categoryid) {
		this.categoryid = categoryid;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	//default constructor
	public Asset() {
		
	}

	public Asset(@NotBlank(message = "asset name should not be blank") String name, Date createdAt,
			Category categoryid) {
		super();
		this.name = name;
		this.createdAt = createdAt;
		this.categoryid = categoryid;
	}	
}
