package com.personel.io.model;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.personel.io.datetime.utils.LocalDateDeserializer;
import com.personel.io.datetime.utils.LocalDateSerializer;

import lombok.Data;

@Data
@Document(collection = "PROFILES")
public class Profile {

	@Id
	private BigInteger id;

	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate startingDateOfEmployment;

	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate endingDateOfemployment;

	private String photoPath;
	private Name name;
	private CivilInformation civilInformation;
	private List<Email> emails;
	private List<Phone> phones;
	private List<PostalAddress> postalAddresses;
	private List<EducationInfo> educationInfos;
	private List<CertificateInfo> certificateInfos;
	private List<ReferenceInfo> referenceInfos;
	private List<JobInfo> jobInfos;
	private FinancialInfo financialInfo;
}
