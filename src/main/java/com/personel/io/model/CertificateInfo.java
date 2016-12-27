package com.personel.io.model;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.personel.io.datetime.utils.LocalDateDeserializer;
import com.personel.io.datetime.utils.LocalDateSerializer;

import lombok.Data;

@Data
public class CertificateInfo {
	private String id;
	private String code;
	private String name;
	private String organization;
	private String topic;
	private String gradeOver;
	
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate startDate;
	
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate expiryDate;
}
