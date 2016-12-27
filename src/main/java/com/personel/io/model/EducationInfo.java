package com.personel.io.model;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.personel.io.datetime.utils.LocalDateDeserializer;
import com.personel.io.datetime.utils.LocalDateSerializer;

import lombok.Data;

@Data
public class EducationInfo {
	private SchoolType schoolType;
	private School school;
	private Department department;
	private String educationLanguage;
	
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate startDate;
	
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate endDate;
	
	private String gradeOver;
	private String description;
	private String webLink;
}
