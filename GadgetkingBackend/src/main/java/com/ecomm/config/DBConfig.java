package com.ecomm.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ecomm.dao.CategoryDAOImpl;
import com.ecomm.dao.CategoryDAO;
import com.ecomm.dao.ProductDAO;
import com.ecomm.dao.ProductDAOImpl;

import com.ecomm.dao.SupplierDAOImpl;
import com.ecomm.dao.UserDAO;
import com.ecomm.dao.UserDAOImpl;
import com.ecomm.model.Category;
import com.ecomm.model.Product;
import com.ecomm.model.Supplier;
import com.ecomm.model.UserDetail;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.ecomm")
public class DBConfig 
{
	
	//1. Create a DataSource object
	@Bean(name="dataSource") 
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/Asna/work/java/maven");
		System.out.println("===Creating the DataSource Bean=====");
		return dataSource;
	}
	
	//2. Create a SessionFactory object
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties hibernateProperties=new Properties();
		hibernateProperties.put("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		
		LocalSessionFactoryBuilder factory1=new LocalSessionFactoryBuilder(getH2DataSource());
		factory1.addProperties(hibernateProperties);
		factory1.addAnnotatedClass(Category.class);
		factory1.addAnnotatedClass(Product.class);
		factory1.addAnnotatedClass(UserDetail.class);
		factory1.addAnnotatedClass(Supplier.class);
		SessionFactory sessionFactory=factory1.buildSessionFactory();
		
		System.out.println("===Creating the SessionFactory Bean=====");
		return sessionFactory;
	}
	
	@Bean(name="categoryDAO")
	public CategoryDAO getCategoryDAO()
	{
		System.out.println("----Category DAO Implementation---");
		return new CategoryDAOImpl();
	}

	@Bean(name="productDAO")
	public ProductDAO getProductDAO()
	{
		System.out.println("----Product DAO Implementation---");
		return new ProductDAOImpl();
	}
	@Bean(name="userDAO")
	public UserDAO getUserDAO()
	{
		System.out.println("----User DAO Implementation---");
		return new UserDAOImpl();
	}
	
	@Bean(name="supplierDAO")
	public SupplierDAOImpl getSupplierDAO()
	{
		System.out.println("----supplier  DAO Implementation---");
		return new SupplierDAOImpl();
	}

	//3. Create a HibernateTransactionManager
	
	@Bean(name="txManager")
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("===Creating the TransactionManager Object=====");
		return new HibernateTransactionManager(getSessionFactory());
	}
}
