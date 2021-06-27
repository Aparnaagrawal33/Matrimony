package com.hibernate.orm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="education_professional_details")
public class EducationProfessionalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String educationQualification;
	private String educationProfessionName;
	private String description;
	private String occupationType;
	private String jobRole;
	private String roleDescription;
	private String occupationDescription;
	private double income;
	
	@JsonManagedReference(value="candidate-EduProf")
    @OneToOne(targetEntity = Candidate.class, mappedBy = "educationProfessionalDetails")
    private Candidate candidate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEducationQualification() {
		return educationQualification;
	}

	public void setEducationQualification(String educationQualification) {
		this.educationQualification = educationQualification;
	}

	public String getEducationProfessionName() {
		return educationProfessionName;
	}

	public void setEducationProfessionName(String educationProfessionName) {
		this.educationProfessionName = educationProfessionName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOccupationType() {
		return occupationType;
	}

	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public String getOccupationDescription() {
		return occupationDescription;
	}

	public void setOccupationDescription(String occupationDescription) {
		this.occupationDescription = occupationDescription;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	
	
}
