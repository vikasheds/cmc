package com.javagf.cmc.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Address> address = new ArrayList<Address>();

	public Customer() {
		// Don't remove.
	}

	public Customer(String id, Integer roll, String name, String address) {
		this.id = id;
		this.roll = roll;
		this.name = name;
	}

}
