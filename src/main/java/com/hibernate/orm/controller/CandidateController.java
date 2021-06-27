package com.hibernate.orm.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.orm.entity.Candidate;
import com.hibernate.orm.entity.Organization;
import com.hibernate.orm.repository.CandidateRepository;
import com.hibernate.orm.services.CandidateService;

@RestController
public class CandidateController {
	
	private CandidateService candidateService;
    private CandidateRepository candidateRepository;
    
    public CandidateController(CandidateService candidateService, CandidateRepository candidateRepository ) {
    	this.candidateService = candidateService;
    	this.candidateRepository = candidateRepository;
    }
    
    @PostMapping("/candidate/save")
    public ResponseEntity<Object> createCandidate(@RequestBody Candidate c) {
        return candidateService.createCandidate(c);
    }
    
    @GetMapping("/candidate/get")
    public List<Candidate> getAllCandadate() {
        return candidateRepository.findAll();
    }
    
    @GetMapping("/candidate/get/{id}")
    public Candidate getOrganization(@PathVariable Long id) {
        if(candidateRepository.findById(id).isPresent())
            return candidateRepository.findById(id).get();
        else return null;
    }
    
    @DeleteMapping("/candidate/delete/{id}")
    public ResponseEntity<Object> deleteOrganization(@PathVariable Long id) {
        if(candidateRepository.findById(id).isPresent()) {
        	candidateRepository.deleteById(id);
            if (candidateRepository.findById(id).isPresent())
                return ResponseEntity.unprocessableEntity().body("Failed to delete the specified candidate");
            else return ResponseEntity.ok("Candidate deleted Successfully ");
        } else return ResponseEntity.unprocessableEntity().body("Specified candidate not present");
    }
    

}
