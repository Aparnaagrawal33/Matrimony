package com.hibernate.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.orm.entity.EducationProfessionalDetails;

@Repository
public interface EduProfRepository extends JpaRepository<EducationProfessionalDetails,Long> {

}
