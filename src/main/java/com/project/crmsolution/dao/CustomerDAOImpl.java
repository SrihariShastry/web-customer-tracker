package com.project.crmsolution.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.crmsolution.entity.Customer;
import com.project.crmsolution.repository.CustomerRepository;
@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	CustomerRepository repo;
	
	@Override
	public List<Customer> getCustomers() {
		// get the current hibernate session
		List<Customer> customers= new ArrayList<>();
		
		customers=repo.findAll();
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		repo.save(theCustomer);

	}

	@Override
	public Customer getCustomer(int theId) {
		return repo.findById(theId);
	}

	@Override
	public void deleteCustomer(int theId) {
		repo.deleteById(theId);

	}

}
