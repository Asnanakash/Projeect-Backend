/*package com.niit.test;


import static org.junit.Assert.*;
import java.util.List;



import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.ecomm.dao.ProductDAO;
import com.ecomm.dao.ProductDAOImpl;
import com.ecomm.model.Category;
import com.ecomm.model.Product;

public class ProductDAOUnitTestCases {
	static ProductDAO productDAO;

	@BeforeClass
	public static  void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		
		productDAO=(ProductDAO)context.getBean("productDAO");
	}
	
	
	@Test
	public void addProductUnitTest()
	{
		Product product = new Product();
		product.setProductName("Lumia 8");
		product.setProductDesc(" mobile with 4G connectivity and 8MP Back camera, 1.3MP Front Camera");
		product.setPrice(24049);
		product.setStock(10);
		product.setCategoryId(1);
		product.setSupplierId(2);
		assertTrue("Problem in adding the Category ",productDAO.addProduct(product));
	}
	
	@Ignore
	@Test
	public void deleteProductTest()
	{
		Product product=productDAO.getProduct(38);
		assertTrue("Problem in Deletion:",productDAO.deleteProduct(product));
	}
    
	@Ignore
	@Test
	public void updateProductTest()
	{
		Product product=productDAO.getProduct(36);
		product.setProductName(" xiomi mobile Phone");
		assertTrue("Problem in Updation",productDAO.updateProduct(product));
	}
	@Ignore
	@Test
	public void getProductTest()
	{
		assertNotNull("Problem in getting 	Product",productDAO.getProduct(36));
	}
	
	@Ignore
	@Test
	public void listProductTest()
	{
		List<Product> listProducts=productDAO.listProducts();
		assertNotNull("No Categories",listProducts);
		
		for(Product product:listProducts)
		{
			System.out.print(product.getProductId()+":::");
			System.out.print(product.getProductName()+":::");
			System.out.println(product.getProductDesc());
		}
	}
    
	
}

*/