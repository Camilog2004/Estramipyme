package com.example.estramipyme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.estramipyme.models.Administrator;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, String> {
}