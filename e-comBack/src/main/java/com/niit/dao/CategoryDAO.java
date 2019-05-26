package com.niit.dao;
import java.util.List;
import com.niit.ecomBack.model.Category;
import com.niit.ecomBack.model.Product;
public interface CategoryDAO 
{
	public boolean persist(Category category);
	public boolean update(Category category);
	public Category findById(int id);
	public boolean delete(Category category);
	public List<Category> getAllCategories();
}
