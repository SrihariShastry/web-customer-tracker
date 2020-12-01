package com.project.crmsolution.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.crmsolution.entity.Customer;
import com.project.crmsolution.services.CustomerService;

@Controller
public class HomeController {

	@Autowired
	CustomerService service;
	
	@RequestMapping("/")
	public String redirect(Model model) {
		List<Customer> customers = new ArrayList<>();
		customers = service.getCustomers();
		model.addAttribute("customers",customers);
		return "list-customer";
	}
	
//	@GetMapping("/list-customers")
//	public String getCustomers(Model model) {
//		
//		return "list-customer";
//	}

	@GetMapping("/showFormAdd")
	public String showFormAdd(Model model) {
		// create model attribute to bind form data
		Customer theCustomer = new Customer();
		model.addAttribute("customer",theCustomer);
		return "addCustomer";
	}

	@PostMapping
	public String addCustomer(@ModelAttribute Customer customer) {
		service.saveCustomer(customer);
		return "list-customer";
	}

}
