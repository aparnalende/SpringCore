package com.hibernate.spring.dao;

import java.util.List;

import com.hibernate.spring.model.Customer;
@SuppressWarnings("rawtypes")
public interface CustomerDao {
	
	 
	 public List listAllCustomers();
	 
	 public void saveOrUpdate(Customer customer);
	 
	 public Customer findCustomerById(int id);
	 
	 public void deleteCustomer(int id);
	 
}
