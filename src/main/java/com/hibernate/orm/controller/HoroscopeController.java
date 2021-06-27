package com.hibernate.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.orm.entity.Horoscope;
import com.hibernate.orm.repository.HoroscopeRepository;

@RestController
public class HoroscopeController {
	
	@Autowired
	private HoroscopeRepository horoscoprRepo;
	
	@GetMapping("/horoscope/get/")
    public List<Horoscope> getEduDetails() {
        return horoscoprRepo.findAll();
    }
	
	 @GetMapping("/horoscope/get/{id}")
	    public Horoscope getDetails(@PathVariable Long id) {
	        if(horoscoprRepo.findById(id).isPresent())
	            return horoscoprRepo.findById(id).get();
	        else return null;
	    }


}
