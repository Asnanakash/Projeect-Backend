package com.niit.ecomBack.model;
import java.util.Date;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class User 
{
	@Id	
	private String u_mail;
	private String u_name;
	private int age;
	private String address;
	private String u_phone;
	private String u_password;
	private String role;
	private Date added_date;
	public User()
	{
		super();
	}
	public String getU_mail()
	{
		return u_mail;
	}
	public void setU_mail(String u_mail) 
	{
		this.u_mail = u_mail;
	}
	public String getU_name()
	{
		return u_name;
	}
	public void setU_name(String u_name) 
	{
		this.u_name = u_name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getU_phone() 
	{
		return u_phone;
	}
	public void setU_phone(String u_phone) 
	{
		this.u_phone = u_phone;
	}
	public String getU_password() 
	{
		return u_password;
	}
	public void setU_password(String u_password)
	{
		this.u_password = u_password;
	}
	public String getRole()
	
	{
		return role;
	}
	public void setRole(String role)
	{
		this.role = role;
	}
	public Date getAdded_date() {
		return added_date;
	}
	public void setAdded_date(Date added_date) {
		this.added_date = added_date;
	}
	
}
