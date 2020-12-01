package com.project.crmsolution.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.crmsolution.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	List<Customer> findAll();

	Customer findById(int id);

}
