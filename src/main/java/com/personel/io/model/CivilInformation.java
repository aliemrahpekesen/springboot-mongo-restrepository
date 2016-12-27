package com.personel.io.model;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.personel.io.datetime.utils.LocalDateDeserializer;
import com.personel.io.datetime.utils.LocalDateSerializer;

import lombok.Data;

@Data
public class CivilInformation {
	private String nationalId;
	private String socialSecurityNumber;
	private Gender gender;
	private String bloodType;
	
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate birthDate;
	
	private String birthPlace;
	private MaritalStatus maritalStatus;
	
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate marriageDate;
}
