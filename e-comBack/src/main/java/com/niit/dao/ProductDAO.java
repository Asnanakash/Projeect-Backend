package com.niit.dao;
import java.util.List;
import com.niit.ecomBack.model.Product;
public interface ProductDAO 
{
	public boolean persist(Product product);
	public boolean update(Product product);
	public Product findById(int id);
	public boolean delete(Product product);
	public List<Product> getAllProducts();
	public List<Product> getFilterProducts(int cid);
	public void deleteAll();
}
