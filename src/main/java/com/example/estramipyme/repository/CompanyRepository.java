package com.example.estramipyme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.estramipyme.models.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {
}
