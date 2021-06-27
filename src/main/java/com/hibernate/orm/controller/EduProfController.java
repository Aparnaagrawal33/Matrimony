package com.hibernate.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.orm.entity.EducationProfessionalDetails;
import com.hibernate.orm.repository.EduProfRepository;

@RestController
public class EduProfController {
	@Autowired
	private EduProfRepository eduprofRepo;
	
	@GetMapping("/eduProfDetails/get/")
    public List<EducationProfessionalDetails> getEduDetails() {
        return eduprofRepo.findAll();
    }
	
	 @GetMapping("/eduProfDetails/get/{id}")
	    public EducationProfessionalDetails getEduDetails(@PathVariable Long id) {
	        if(eduprofRepo.findById(id).isPresent())
	            return eduprofRepo.findById(id).get();
	        else return null;
	    }

}
