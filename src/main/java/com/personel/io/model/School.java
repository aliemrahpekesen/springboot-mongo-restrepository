package com.personel.io.model;

import lombok.Data;

@Data
public class School {
	private String code;
	private String name;
	private boolean funding;
	private PostalAddress address;
}
