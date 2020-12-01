package com.project.crmsolution.services;

import java.util.List;

import com.project.crmsolution.entity.Customer;



public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
