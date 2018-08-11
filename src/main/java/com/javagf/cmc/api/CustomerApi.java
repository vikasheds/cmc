package com.javagf.cmc.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javagf.cmc.dto.Customer;
import com.javagf.cmc.service.CustomerService;

@RestController
public class CustomerApi {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Customer> getCustomer(@PathVariable String id) {
		return customerService.getCustomer(id);
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public void updateCustomer(@PathVariable String id, @RequestBody Customer customer) {
		customerService.updateCustomer(id, customer);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable String id) {
		customerService.deleteCustomer(id);
	}

}
