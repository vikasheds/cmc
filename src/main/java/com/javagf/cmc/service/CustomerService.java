package com.javagf.cmc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javagf.cmc.dao.CustomerRepositery;
import com.javagf.cmc.dto.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepositery customerRepositery;

	public Customer createCustomer(Customer customer) {
		Customer c = customerRepositery.save(customer);
		return c;
	}

	public void updateCustomer(String id, Customer customer) {
		customerRepositery.save(customer);
	}

	public void deleteCustomer(String id) {
		customerRepositery.deleteById(id);
	}

	public Optional<Customer> getCustomer(String id) {
		Optional<Customer> c = customerRepositery.findById(id);
		return c;
	}

	public List<Customer> getAllCustomer() {
		List<Customer> customers = new ArrayList<>();
		customerRepositery.findAll().forEach(customers::add);
		return customers;
	}
	
}
