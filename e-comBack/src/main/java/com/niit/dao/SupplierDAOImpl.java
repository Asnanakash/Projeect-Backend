package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.ecomBack.model.Supplier;

@Repository("SupplierDAO")
@Transactional
public class SupplierDAOImpl implements SupplierDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	public boolean addSupplier(Supplier supplier) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean deleteSupplier(Supplier supplier) 
	{
		try
		{
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean updateSupplier(Supplier supplier)
	{
		try
		{
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public Supplier getSupplier(int supplierId) 
	{
		Supplier supplier=sessionFactory.getCurrentSession().get(Supplier.class,supplierId);
		
		return supplier;	
	}
	public List<Supplier> retrieveSuppliers()
	{
		List<Supplier> listSupplier=sessionFactory.getCurrentSession().createQuery("from Supplier").list();
		return listSupplier;	
	}
	
	
}
