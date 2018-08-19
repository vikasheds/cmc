package com.javagf.cmc.api.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javagf.cmc.api.CustomerApi;
import com.javagf.cmc.dto.Customer;
import com.javagf.cmc.service.CustomerService;
import com.javagf.cmc.utils.RestConstants;

@RestController
@RequestMapping(value = RestConstants.API + RestConstants.CUSTOMER_API + CustomerApiImpl.VERSION)
public class CustomerApiImpl implements CustomerApi {
	public static final String VERSION = "v1";

	@Autowired
	private CustomerService customerService;

	@Override
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

	@Override
	public Optional<Customer> getCustomer(@PathVariable String id) {
		return customerService.getCustomer(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

	public void updateCustomer(String id, Customer customer) {
		customerService.updateCustomer(id, customer);
	}

	public void deleteCustomer(@PathVariable String id) {
		customerService.deleteCustomer(id);
	}

}
