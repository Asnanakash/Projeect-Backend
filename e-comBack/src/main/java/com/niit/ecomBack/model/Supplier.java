package com.niit.ecomBack.model;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class Supplier
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int supplierId;
	private String supplierName;
	private String address;
	@OneToMany(targetEntity=Product.class,mappedBy="supplier",cascade=CascadeType.ALL)
	Set<Product> products;
	
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public int getSupplierId() 
	{
		return supplierId;
	}
	public void setSupplierId(int supplierId)
	{
		this.supplierId = supplierId;
	}
	public String getSupplierName() 
	{
		return supplierName;
	}
	public void setSupplierName(String supplierName)
	{
		this.supplierName = supplierName;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
}
