package com.example.estramipyme.repository;

import com.example.estramipyme.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.estramipyme.models.Company;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {
    List<Company> findByEmail(String email);
}
