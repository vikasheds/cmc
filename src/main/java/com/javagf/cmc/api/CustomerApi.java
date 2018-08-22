package com.javagf.cmc.api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javagf.cmc.dto.Customer;

public interface CustomerApi {
	String PATH_CREATE_CUSTOMER = "/customer";
	String PATH_GET_CUSTOMER = "/get/{id}";
	String PATH_GET_ALL_CUSTOMER = "/get";
	String PATH_UPDATE_CUSTOMER = "/update/{id}";
	String PATH_DELETE_CUSTOMER = "/delete/{id}";

	@RequestMapping(value = PATH_CREATE_CUSTOMER, method = RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer customer);

	@RequestMapping(value = PATH_GET_CUSTOMER, method = RequestMethod.GET)
	public Optional<Customer> getCustomer(@PathVariable String id);

	@RequestMapping(value = PATH_GET_ALL_CUSTOMER, method = RequestMethod.GET)
	public List<Customer> getAllCustomer();

	@RequestMapping(value = PATH_UPDATE_CUSTOMER, method = RequestMethod.PUT)
	public void updateCustomer(@PathVariable String id, @RequestBody Customer customer);

	@RequestMapping(value = PATH_DELETE_CUSTOMER, method = RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable String id);
}
