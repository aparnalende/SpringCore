package com.hibernate.spring.service;

import java.util.List;

import com.hibernate.spring.model.Customer;
@SuppressWarnings("rawtypes")
public interface CustomerService {
	 
	 public List listAllCustomers();
	 
	 public void saveOrUpdate(Customer customer);
	 
	 public Customer findCustomerById(int id);
	 
	 public void deleteCustomer(int id);
	}

