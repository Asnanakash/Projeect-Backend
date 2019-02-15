package com.ecomm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.model.Product;
@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO
{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addProduct(Product product)
	{
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return true;
		}
		
		catch(Exception e)
		{
			return false;
		}
	}
	
	@Override
	public boolean deleteProduct(Product product)
	{
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}
	
	@Override
	public boolean updateProduct(Product product)
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
	
	@Override
	public Product getProduct(int productId)
	{
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class,productId);
		session.close();
		return product;
	}
	
	@Override
	public List<Product> listProducts()
	{
	
		Session session=sessionFactory.openSession();
		List<Product> listproduct=(List<Product>)session.createQuery("from Product").list();
		session.close();
		return listproduct;
	}
	
	
	
	
	

}
