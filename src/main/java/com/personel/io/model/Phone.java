package com.personel.io.model;

import lombok.Data;

@Data
public class Phone extends ContactInfo {
	private String internationalCode;
	private String areaCode;
	private String phoneNumber;
	private String extension;
}
