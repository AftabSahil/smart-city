package com.smartcity.smartcity.repository;

import com.smartcity.smartcity.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
    
}
