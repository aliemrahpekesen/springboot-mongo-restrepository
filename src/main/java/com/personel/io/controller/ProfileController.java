package com.personel.io.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.personel.io.model.Profile;
import com.personel.io.repository.ProfileRepository;

@RestController(value="pController")
public class ProfileController {

	@Autowired
	ProfileRepository profileRepository;

	@RequestMapping(method = RequestMethod.GET, path = "/healthCheck")
	public List<Profile> checkIfWorks() {
		return profileRepository.findAll();
	}
}
