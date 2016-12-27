package com.personel.io.model;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.personel.io.datetime.utils.LocalDateDeserializer;
import com.personel.io.datetime.utils.LocalDateSerializer;

import lombok.Data;

@Data
public class JobInfo {
	private String company;
	private String industry;
	private PostalAddress address;
	private Phone phone;
	private Email Email;
	private String jobTitle;
	private String jobDescription;
	private String leaveReason;
	
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate startDate;
	
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate endDate;
}
