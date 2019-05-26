/*package com.niit.e_comBack.test;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;
import com.niit.dao.CategoryDAO;
import com.niit.e_com.congifrn.HybernateConfig;
import com.niit.ecomBack.model.Category;
@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=HybernateConfig.class)
public class CategoryTest 
{
	@Autowired
	CategoryDAO categoryDAO;
	@Test
	public void addCategory()
	{
		Category category=new Category();
		category.setCategoryName("Ladies");
		category.setCategoryDesc("Ladies section");
		assertTrue("Category Inserted",categoryDAO.persist(category));
	}
	
	@Test
	public void updateCategory()
	{
		Category category=categoryDAO.findById(35);
		System.out.println(category.getCategoryName());
		category.setCategoryName("babies");
		categoryDAO.update(category);
		
		
	}
	@Test
	public void deleteCategory()
	{
		Category category=categoryDAO.findById(38);
		System.out.println(category.getCategoryName());
		categoryDAO.delete(category);
	}
	
	@Test
	public void viewAllCategory()
	{
		List<Category> category=categoryDAO.getAllCategories();
		for(Category c:category)
		{
			System.out.println(c);
		}
	}

}
*/