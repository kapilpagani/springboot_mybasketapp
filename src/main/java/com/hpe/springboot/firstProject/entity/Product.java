package com.hpe.springboot.firstProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="products")
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	
	private String name;
	private String description;
	
	@Column(name="QUANTITY_PER_UNIT")
	private String quantityPerUnit;
	
	@Column(name="UNIT_PRICE")
	private String unitPrice;
	
	private String picture;
	
	private Double discount;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@ManyToOne 
	@JoinColumn(name="brand_id")
	private Brand brand;
	
	
	
}
