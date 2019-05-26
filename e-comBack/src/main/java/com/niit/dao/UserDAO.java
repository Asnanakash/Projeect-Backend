package com.niit.dao;
import java.util.List;
import com.niit.ecomBack.model.User;
public interface UserDAO 
{
	public boolean addUser(User user);
	public boolean deleteUser(User user);
	public boolean updateUser(User user);
	public List<User> retrieveUsers(String userName);
	public User getUser(String mail);
	public User validate(String emailID, String password);


}
