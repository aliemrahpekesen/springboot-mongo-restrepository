package com.personel.io.model;

import lombok.Data;

@Data
public class PostalAddress extends ContactInfo {
	private String country;
	private String state;
	private String city;
	private String county;
	private String addressLine;
	private String poBox;
	private String zipCode;
}
