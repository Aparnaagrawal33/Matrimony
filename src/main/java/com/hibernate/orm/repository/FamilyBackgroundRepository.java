package com.hibernate.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.orm.entity.FamilyBackground;

@Repository
public interface FamilyBackgroundRepository extends JpaRepository<FamilyBackground,Long>{

}
