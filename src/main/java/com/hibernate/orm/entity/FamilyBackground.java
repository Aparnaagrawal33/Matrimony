package com.hibernate.orm.entity;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="family_backgound")
public class FamilyBackground {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String father;
	private String fatherName;
	private String mother;
	private String motherName;
	private String brother;
	private String marriedBrother;
	private String sister;
	private String marriedSister;
	private String jointFamily;
	private String familyOccupation;
	private String residenceCity;
	private String wealth;
	private String nativeCity;
	private String intercastMarriage;
	private String intercastMarriageDescription;
	
	@JsonManagedReference(value="candidate-family")
    @OneToOne(targetEntity = Candidate.class, mappedBy = "familyBackground")
    private Candidate candidate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getBrother() {
		return brother;
	}

	public void setBrother(String brother) {
		this.brother = brother;
	}

	public String getMarriedBrother() {
		return marriedBrother;
	}

	public void setMarriedBrother(String marriedBrother) {
		this.marriedBrother = marriedBrother;
	}

	public String getSister() {
		return sister;
	}

	public void setSister(String sister) {
		this.sister = sister;
	}

	public String getMarriedSister() {
		return marriedSister;
	}

	public void setMarriedSister(String marriedSister) {
		this.marriedSister = marriedSister;
	}

	public String getJointFamily() {
		return jointFamily;
	}

	public void setJointFamily(String jointFamily) {
		this.jointFamily = jointFamily;
	}

	public String getFamilyOccupation() {
		return familyOccupation;
	}

	public void setFamilyOccupation(String familyOccupation) {
		this.familyOccupation = familyOccupation;
	}

	public String getResidenceCity() {
		return residenceCity;
	}

	public void setResidenceCity(String residenceCity) {
		this.residenceCity = residenceCity;
	}

	public String getWealth() {
		return wealth;
	}

	public void setWealth(String wealth) {
		this.wealth = wealth;
	}

	public String getNativeCity() {
		return nativeCity;
	}

	public void setNativeCity(String nativeCity) {
		this.nativeCity = nativeCity;
	}

	public String getIntercastMarriage() {
		return intercastMarriage;
	}

	public void setIntercastMarriage(String intercastMarriage) {
		this.intercastMarriage = intercastMarriage;
	}

	public String getIntercastMarriageDescription() {
		return intercastMarriageDescription;
	}

	public void setIntercastMarriageDescription(String intercastMarriageDescription) {
		this.intercastMarriageDescription = intercastMarriageDescription;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	
}
