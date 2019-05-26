package com.niit.dao;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.ecomBack.model.Category;
@Repository(value="categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO 
{
    @Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf)
	{
		this.sessionFactory = sf;
	}
	public boolean persist(Category category) 
	{
		
		try
		{
			sessionFactory.getCurrentSession().save(category);
			System.out.println("Categoty saved"+category.getCategoryName());
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Error occurd : "+e.getMessage());
			return false;
		}
	}
	public boolean update(Category category) 
	{
		
		try
		{
			sessionFactory.getCurrentSession().update(category);
			
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Error occurd : "+e.getMessage());
			return false;
		}
	}
	public Category findById(int id) 
	{
		Category category=(Category)sessionFactory.getCurrentSession().get(Category.class, id);
		return category;
	}
	public boolean delete(Category category)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	//@SuppressWarnings("unchecked")
	public List<Category> getAllCategories() 
	{
		List<Category> list=sessionFactory.getCurrentSession().createQuery("from Category").list();
		
		System.out.println(list);
		return list;
	}

}
	


