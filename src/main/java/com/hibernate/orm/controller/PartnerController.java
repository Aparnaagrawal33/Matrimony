package com.hibernate.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.orm.entity.PartnerExpectation;
import com.hibernate.orm.repository.PartnerRepository;

@RestController
public class PartnerController {
	@Autowired
	private PartnerRepository partnerRepo;
	
	@GetMapping("/partner/get/")
    public List<PartnerExpectation> getEduDetails() {
        return partnerRepo.findAll();
    }
	
	 @GetMapping("/partner/get/{id}")
	    public PartnerExpectation getEduDetails(@PathVariable Long id) {
	        if(partnerRepo.findById(id).isPresent())
	            return partnerRepo.findById(id).get();
	        else return null;
	    }

}
