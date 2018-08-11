package com.javagf.cmc.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Customer {

	@Id
	private String id;
	private Integer roll;
	private String name;
	private String address;

	public Customer() {

	}

	public Customer(String id, Integer roll, String name, String address) {
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

}
