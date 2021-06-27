package com.hibernate.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.orm.entity.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long>  {

}
