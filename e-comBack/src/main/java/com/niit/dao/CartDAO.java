package com.niit.dao;
import java.util.List;
import com.niit.ecomBack.model.CartItem;
public interface CartDAO 
{
	
	public boolean addCartItem(CartItem cartItem);
	public boolean deleteCartItem(CartItem cartItem);
	public boolean updateCartItem(CartItem cartItem);
	public List<CartItem>retrieveCartItems(String user);
	public CartItem getCartItem(int cartItemId);
	public List<CartItem> retrieveCartItemsByProduct(String userName,int pid);

}
