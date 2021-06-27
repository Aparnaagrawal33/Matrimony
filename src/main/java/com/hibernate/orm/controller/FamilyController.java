package com.hibernate.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.orm.entity.FamilyBackground;
import com.hibernate.orm.repository.FamilyBackgroundRepository;

@RestController
public class FamilyController {
	@Autowired
	private FamilyBackgroundRepository familyRepo;
	
	@GetMapping("/family/get/")
    public List<FamilyBackground> getEduDetails() {
        return familyRepo.findAll();
    }
	
	 @GetMapping("/family/get/{id}")
	    public FamilyBackground getEduDetails(@PathVariable Long id) {
	        if(familyRepo.findById(id).isPresent())
	            return familyRepo.findById(id).get();
	        else return null;
	    }


}
