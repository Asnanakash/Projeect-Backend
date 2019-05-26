package com.niit.dao;
import java.util.List;

import javax.transaction.Transactional;

import com.niit.ecomBack.model.CartItem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("cartDAO")
@Transactional
public class CartDAOImpl implements CartDAO
{
	@Autowired
	SessionFactory sessionFactory;
	public boolean addCartItem(CartItem cartItem) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(cartItem);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("------Exception :----"+e.getMessage());
			return false;
		}
	}
	public boolean deleteCartItem(CartItem cartItem) 
	{
		try
		{
			sessionFactory.getCurrentSession().delete(cartItem);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean updateCartItem(CartItem cartItem)
	{
		try
		{
			sessionFactory.getCurrentSession().update(cartItem);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public CartItem getCartItem(int cartItemId) 
	{
		CartItem cartItem=(CartItem)sessionFactory.getCurrentSession().get(CartItem.class,cartItemId);
		return cartItem;
       
	}
	public List<CartItem> retrieveCartItems(String userName)
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from CartItem where U_ID='"+userName+"'");
		
		List<CartItem> listCartItem=query.list();
		session.close();
		return listCartItem;	
	}
	public List<CartItem> retrieveCartItemsByProduct(String userName,int pid)
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from CartItem where U_ID='"+userName+"' and P_ID="+pid);
		
		List<CartItem> listCartItem=query.list();
		session.close();
		return listCartItem;	
	}
}
