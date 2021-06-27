package com.hibernate.orm.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t_address")
public class Address {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	    private String city;
	    private String state;
	    private String country;
	    private String zipcode;
	    
	    @JsonManagedReference
	    @OneToOne(targetEntity = Organization.class, mappedBy = "address")
	    private Organization organization;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
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
		public String getZipcode() {
			return zipcode;
		}
		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}
		public Organization getOrganization() {
			return organization;
		}
		public void setOrganization(Organization organization) {
			this.organization = organization;
		}    

}
