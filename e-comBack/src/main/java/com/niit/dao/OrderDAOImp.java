package com.niit.dao;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.ecomBack.model.OrderDetail;
@Repository("OrderDAO")
@Transactional
public class OrderDAOImp implements OrderDAO  
{
	@Autowired
	SessionFactory sessionFactory;
	
	public boolean insertOrderDetail(OrderDetail orderdetail)
	{
		try
		{
			sessionFactory.getCurrentSession().save(orderdetail);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
}
	


