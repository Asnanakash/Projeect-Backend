package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecomBack.model.Supplier;
import com.niit.ecomBack.model.User;

@Repository("UserDAO")
@Transactional
public class UserDAOImpl implements UserDAO
{
	@Autowired
	SessionFactory sessionFactory;
	public boolean addUser(User user) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean deleteUser(User user) 
	{
		try
		{
			sessionFactory.getCurrentSession().delete(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean updateUser(User user)
	{
		try
		{
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public User getUser(String mail) 
	{
		User user=sessionFactory.getCurrentSession().get(User.class,mail);
		
		return user;	
	}
	public List<User> retrieveUsers(String userName)
	{
		List<User> listUser=sessionFactory.getCurrentSession().createQuery("from User").list();
		return listUser;
	}
	@SuppressWarnings("deprecation")
	public User validate(String emailID, String password)
	{

		return	(User) sessionFactory.getCurrentSession().createCriteria(User.class)

			.add(Restrictions.eq("emailID", emailID))

			.add(Restrictions.eq("password", password)).uniqueResult();

		

	}
	
	
}

