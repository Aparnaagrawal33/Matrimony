package com.hibernate.orm.entity;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "t_organization")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String orgId;
    
    @JsonBackReference
    @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
    private Address address;
    
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOrgId() {
        return this.orgId;
    }
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Address getAddress() {
        return this.address;
    }
    public void setAddress(Address address) {
    	this.address = address;
    }
}