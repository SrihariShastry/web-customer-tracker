package com.project.crmsolution.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.project.crmsolution.entity.Customer;

@Component
public interface CustomerDAO {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
