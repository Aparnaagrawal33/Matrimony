package com.hibernate.orm.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="partner_expectation")
public class PartnerExpectation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String preferedCountry;
	private String preferredCity;
	private String mangal;
	private String caste;
	private int ageDifference;
	private double height;
	private String educationType;
	private String educationNames;
	private String occupation;
	private String divorced;
	private double income;
	private String description;

	@JsonManagedReference(value="candidate-partner")
    @OneToOne(targetEntity = Candidate.class, mappedBy = "partnerExpectation")
    private Candidate candidate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPreferedCountry() {
		return preferedCountry;
	}

	public void setPreferedCountry(String preferedCountry) {
		this.preferedCountry = preferedCountry;
	}

	public String getPreferredCity() {
		return preferredCity;
	}

	public void setPreferredCity(String preferredCity) {
		this.preferredCity = preferredCity;
	}

	public String getMangal() {
		return mangal;
	}

	public void setMangal(String mangal) {
		this.mangal = mangal;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public int getAgeDifference() {
		return ageDifference;
	}

	public void setAgeDifference(int ageDifference) {
		this.ageDifference = ageDifference;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getEducationType() {
		return educationType;
	}

	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}

	public String getEducationNames() {
		return educationNames;
	}

	public void setEducationNames(String educationNames) {
		this.educationNames = educationNames;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDivorced() {
		return divorced;
	}

	public void setDivorced(String divorced) {
		this.divorced = divorced;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	
	
}
