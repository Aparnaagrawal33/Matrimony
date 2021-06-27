package com.hibernate.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.orm.entity.Address;
import com.hibernate.orm.repository.AddressRepository;

@RestController
public class AddressController {
	
    @Autowired
    private AddressRepository addressRepository;
    @GetMapping("/address/get/all")
    public List<Address> getAddress() {
        return addressRepository.findAll();
    }
}