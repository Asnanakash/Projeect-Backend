package com.niit.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecomBack.model.Category;
import com.niit.ecomBack.model.Product;
@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf)
	{
		this.sessionFactory = sf;
	}
	public boolean persist(Product product) 
	{	
		try
		{
		sessionFactory.getCurrentSession().save(product);
		
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}  
	public boolean update(Product product) 
	{
		try
		{
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public Product findById(int id) 
	{
		Product product=(Product)sessionFactory.getCurrentSession().get(Product.class, id);
		return product;
	}
	public boolean delete(Product product) 
	{
		try
		{
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	public List<Product> getAllProducts() 
	{
		List<Product> list=sessionFactory.getCurrentSession().createQuery("from Product").list();
		System.out.println(list);
		return list;
	}
	public void deleteAll() 
	{
		
		
	}
	public List<Product> getFilterProducts(int cid)
	{
		List<Product> results=sessionFactory.getCurrentSession().createQuery("from Product where c_id="+cid).list();
		return results;
		
	}		
}
	
	


