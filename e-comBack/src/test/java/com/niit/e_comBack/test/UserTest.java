/*package com.niit.e_comBack.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.dao.UserDAO;
import com.niit.e_com.congifrn.HybernateConfig;
import com.niit.ecomBack.model.Category;
import com.niit.ecomBack.model.User;
@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=HybernateConfig.class)

public class UserTest 
{
	@Autowired
	UserDAO userDAO; 
	@Test
	public void addUser()
	{
		User user=new User();
		user.setU_mail("krish1055gmail.com");
		user.setU_name("Krishna");
		user.setAddress("Krishna nivas");
		user.setAge(20);
		user.setU_password("67890");
		user.setU_phone("1234567890");
		user.setRole("user");
		assertTrue("User Inserted",userDAO.addUser(user));
	}
	@Test
	public void updateUser()
	{
		User user=userDAO.getUser("ksaswathi98gmail.com");
		System.out.println(user.getU_name());
		user.setAge(24);
		userDAO.updateUser(user);	
	}
	
	@Test
	public void deleteUser()
	{
		User user=userDAO.getUser("ksaswathi98gmail.com");
		System.out.println(user.getU_name());
		userDAO.deleteUser(user);
	}
	@Test
	public void getUser()
	{
		User user=userDAO.getUser("ksaswathi98gmail.com");
		System.out.println(user.getU_name());
	}

	  }
*/