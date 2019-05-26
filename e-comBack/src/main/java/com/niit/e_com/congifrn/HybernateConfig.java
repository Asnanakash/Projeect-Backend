package com.niit.e_com.congifrn;
import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.niit")
public class HybernateConfig 
{
	@Bean(name="dataSource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		 dataSource.setDriverClassName("org.h2.Driver");
	     dataSource.setUrl("jdbc:h2:tcp://localhost/~/fasionDb");
	     dataSource.setUsername("sa");
	     dataSource.setPassword("");
		System.out.println("DataSource Created....");
		return dataSource;	
	}
	private Properties getHibernateProperties()
	{
		Properties prop=new Properties();
		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		prop.setProperty("hibernate.show_sql","true");
		prop.setProperty("hibernate.hbm2ddl.auto","update");
		return prop;
	}
	
	@Bean(name="sessionFactory")
	@Autowired
	public LocalSessionFactoryBean getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBean  sessionFactory=new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setHibernateProperties(getHibernateProperties());
		sessionFactory.setPackagesToScan("com.niit.ecomBack.model");
		System.out.println("Session Factory Created....");
		
		return sessionFactory;
		
	}
	
	@Bean(name="transactionManager")
	@Autowired
	public HibernateTransactionManager  getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionManager =new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		System.out.println("Transaction Created....");
		return transactionManager;
	}
	
	

}

