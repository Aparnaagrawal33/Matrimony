package com.hibernate.orm.entity;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="candidate")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull(message="Please provide firstName")
	private String firstName;
	private String middleName;
	@NotNull(message="Please provide lastName")
	private String lastName;
	
	private String dateOfBirth;
	private int castId;
	private String maritalStatus;
	@NotNull(message="Please provide height")
	private double height;
	@NotNull(message="Please provide weight")
	private double weight;
	@NotNull(message="Please provide blood group")
	private String bloodGroup;
	private String complexion;
	private String physicalAbility;
	private String physicalAbilityDescription;
	private String diet;
	private String spectacle;
	private String lens;
	private String personality;
	@NotNull(message="Please provide govt. id type")
	private String govtIdType;
	@NotNull(message="Please provide govt. id")
	private String govtId;
	@NotNull(message="Please provide Address")
	private String address;
	@NotNull(message="Please provide email")
	private String email;
	@NotNull(message="Please provide mobile no.")
	private String mobileNumber;
	private String mobileNumber2;
	@NotNull(message="Please provide city")
	private String city;
	@NotNull(message="Please provide state")
	private String state;
	@NotNull(message="Please provide country")
	private String country;
	
	// Joined Tables
	@JsonBackReference(value="candidate-family")
	@OneToOne(targetEntity = FamilyBackground.class, cascade = CascadeType.ALL)
	private FamilyBackground familyBackground;
	
	@JsonBackReference(value="candidate-EduProf")
	@OneToOne(targetEntity = EducationProfessionalDetails.class, cascade = CascadeType.ALL)
	private EducationProfessionalDetails educationProfessionalDetails;
	
	@JsonBackReference(value="candidate-horoscope")
	@OneToOne(targetEntity = Horoscope.class, cascade = CascadeType.ALL)
	private Horoscope horoscope;
	
	@JsonBackReference(value="candidate-partner")
	@OneToOne(targetEntity = PartnerExpectation.class, cascade = CascadeType.ALL)
	private PartnerExpectation partnerExpectation;
	
	@CreationTimestamp
	private Date CreationTime;
	
	@UpdateTimestamp
	private Date UpdateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getCastId() {
		return castId;
	}

	public void setCastId(int castId) {
		this.castId = castId;
	}

	public String getMaritialStatus() {
		return maritalStatus;
	}

	public void setMaritialStatus(String maritialStatus) {
		this.maritalStatus = maritialStatus;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getComplexion() {
		return complexion;
	}

	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}

	public String getPhysicalAbility() {
		return physicalAbility;
	}

	public void setPhysicalAbility(String physicalAbility) {
		this.physicalAbility = physicalAbility;
	}

	public String getPhysicalAbilityDescription() {
		return physicalAbilityDescription;
	}

	public void setPhysicalAbilityDescription(String physicalAbilityDescription) {
		this.physicalAbilityDescription = physicalAbilityDescription;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getSpectacle() {
		return spectacle;
	}

	public void setSpectacle(String spectacle) {
		this.spectacle = spectacle;
	}

	public String getLens() {
		return lens;
	}

	public void setLens(String lens) {
		this.lens = lens;
	}

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public String getGovtIdType() {
		return govtIdType;
	}

	public void setGovtIdType(String govtIdType) {
		this.govtIdType = govtIdType;
	}

	public String getGovtId() {
		return govtId;
	}

	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMobileNumber2() {
		return mobileNumber2;
	}

	public void setMobileNumber2(String mobileNumber2) {
		this.mobileNumber2 = mobileNumber2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public FamilyBackground getFamilyBackground() {
		return familyBackground;
	}

	public void setFamilyBackground(FamilyBackground familyBackground) {
		this.familyBackground = familyBackground;
	}

	public EducationProfessionalDetails getEducationProfessionalDetails() {
		return educationProfessionalDetails;
	}

	public void setEducationProfessionalDetails(EducationProfessionalDetails educationProfessionalDetails) {
		this.educationProfessionalDetails = educationProfessionalDetails;
	}

	public Horoscope getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(Horoscope horoscope) {
		this.horoscope = horoscope;
	}

	public PartnerExpectation getPartnerExpectation() {
		return partnerExpectation;
	}

	public void setPartnerExpectation(PartnerExpectation partnerExpectation) {
		this.partnerExpectation = partnerExpectation;
	}

	public Date getCreationTime() {
		return CreationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.CreationTime = creationTime;
	}

	public Date getUpdateTime() {
		return UpdateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.UpdateTime = updateTime;
	}
	
	

}
