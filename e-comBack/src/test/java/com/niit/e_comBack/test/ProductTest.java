/*package com.niit.e_comBack.test;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;
import com.niit.dao.ProductDAO;
import com.niit.e_com.congifrn.HybernateConfig;
import com.niit.ecomBack.model.Product;
@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=HybernateConfig.class)
public class ProductTest 
{

	@Autowired
	ProductDAO productDAO;
	@Test
	public void persist()
	{
		Product product=new Product();
		product.setProductId(14);
		product.setProductName("dress");
		product.setProductDesc("Men dress");
		product.setPrice(500);
		product.setStock(5);
		assertTrue("Product Inserted",productDAO.persist(product));
		
	}
	
	
	@Test
	public void update()
	{
		Product product=productDAO.findById(65);
		System.out.println(product.getProductName());
		product.setProductName("Ladies");
		productDAO.update(product);
	}
	
	
	@Test                                                                    
	public void delete()
	{
		Product product=productDAO.findById(71);
		System.out.println(product.getProductName());
		productDAO.delete(product);
		
	}
	
	
	@Test
	public void getAllProducts()
	{
		List<Product> product=productDAO.getAllProducts();
		for(Product p:product)
		{
			System.out.println(p);
		}
		
	}
	
	
	@Test
	public void getFilterProducts()
	{
		
		
	}
}
*/