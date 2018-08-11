package com.javagf.cmc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javagf.cmc.dto.Customer;

public interface CustomerRepositery extends CrudRepository<Customer, String> {
	public List<Customer> findByAddressId(String id);
}
