/*package com.niit.e_comBack.test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.dao.SupplierDAO;
import com.niit.e_com.congifrn.HybernateConfig;
import com.niit.ecomBack.model.Supplier;
import com.niit.ecomBack.model.User;
@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=HybernateConfig.class)
public class SupplierTest 
{
	@Autowired
	SupplierDAO supplierDAO;
	@Test
	public void addSupplier()
	{
		Supplier supplier=new Supplier();
		supplier.setSupplierId(111);
		supplier.setSupplierName("Raju");
		supplier.setAddress("wdwefvgdfs");
		assertTrue("User Inserted",supplierDAO.addSupplier(supplier));
	}
	@Test
	public void updateSupplier()
	{
		Supplier supplier=supplierDAO.getSupplier(66);
		System.out.println(supplier.getSupplierId());
		supplier.setSupplierName("ravi");
		supplierDAO.updateSupplier(supplier);	
		
	}
	@Test
	public void getSupplier()
	{
		Supplier supplier=supplierDAO.getSupplier(68);
		System.out.println(supplier.getSupplierName());
	}

}
*/