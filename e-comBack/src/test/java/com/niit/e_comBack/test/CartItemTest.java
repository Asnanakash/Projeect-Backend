/*package com.niit.e_comBack.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.niit.dao.CartDAO;
import com.niit.ecomBack.model.CartItem;
import com.niit.ecomBack.model.Category;
public class CartItemTest 
{
	CartDAO cartDAO;
	@Test
	public void addCartItem()
	{
		CartItem cartItem=new CartItem();
		cartItem.setCartItemId(121);
		cartItem.setProductId(456);
		cartItem.setProductName("kids");
		cartItem.setPstatus("NP");
		cartItem.setQuantity(18);
		cartItem.setUserName("jishnu");	
		assertTrue("cartItem Inserted",cartDAO.addCartItem(cartItem));
	}
	@Test
	public void updateCartItem()
	{
		CartItem cartItem=CartDAO.findById(12);
		System.out.println(cartItem.getCartItemName());
		cartItem.setCartItemName("babies");
		CartDAO.update(cartItem);
	}
	public void deleteCategory()
	{
		CartItem cartItem=CartDAO.findById(13);
		System.out.println(cartItem.getCartItemName());
		CartDAO.delete(cartItem);
	}
}
*/