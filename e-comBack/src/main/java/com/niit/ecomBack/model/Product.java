package com.niit.ecomBack.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class Product 
{
	@Id
	@GeneratedValue	
	private int productId;
	private String productName;
	private int price;
	private String productDesc;
	private int stock;
	private  Date added_date;
	@ManyToOne
	@JoinColumn(name="c_id")
	Category category;
	@ManyToOne
	@JoinColumn(name="s_id")
	Supplier supplier;
	
	public Product()
	{
		super();
	}
	public int getProductId()
	{
		return productId;
	}
	public void setProductId(int productId) 
	{
		this.productId = productId;
	}
	public String getProductName() 
	{
		return productName;
	}
	public void setProductName(String productName) 
	{
		this.productName = productName;
	}
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	public String getProductDesc() 
	{
		return productDesc;
	}
	public void setProductDesc(String productDesc) 
	{
		this.productDesc = productDesc;
	}
	public Category getCategory()
	{
		return category;
	}
	public void setCategory(Category category) 
	{
		this.category = category;
	}
	public Supplier getSupplier() 
	{
		return supplier;
	}
	public void setSupplier(Supplier supplier) 
	{
		this.supplier = supplier;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getAdded_date() {
		return added_date;
	}
	public void setAdded_date(Date added_date) {
		this.added_date = added_date;
	}
	
	
}
