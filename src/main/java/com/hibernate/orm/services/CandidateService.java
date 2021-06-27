package com.hibernate.orm.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.orm.entity.*;
import com.hibernate.orm.repository.*;

@Service
public class CandidateService {
	
	private HoroscopeRepository horoscopeRepo;
	private FamilyBackgroundRepository familyBackgorundRepo;
	private EduProfRepository eduProfRepo;
	private PartnerRepository partnerRepo;
	private CandidateRepository candidateRepo;
	
	
	public CandidateService(HoroscopeRepository horoscopeRepo, FamilyBackgroundRepository familyBackgorundRepo, 
			EduProfRepository eduProfRepo, PartnerRepository partnerRepo,CandidateRepository candidateRepo ) {
		this.horoscopeRepo = horoscopeRepo;
		this.candidateRepo = candidateRepo;
		this.eduProfRepo = eduProfRepo;
		this.familyBackgorundRepo = familyBackgorundRepo;
		this.partnerRepo = partnerRepo;
	}
	
	@Transactional
	public ResponseEntity<Object> createCandidate(Candidate candidate) {
		Candidate c = new Candidate();
		c = candidate;
		Candidate savedCand = candidateRepo.save(c);
		 if(candidateRepo.findById(savedCand.getId()).isPresent())
	            return ResponseEntity.ok().body("Candidate created successfully.");
	    else return ResponseEntity.unprocessableEntity().body("Failed to save the Candidate specified.");
		
	}

}
