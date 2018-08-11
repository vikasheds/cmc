package com.javagf.cmc.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Address {
	@Id
	private String id;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
}
