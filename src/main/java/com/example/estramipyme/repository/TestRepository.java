package com.example.estramipyme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.estramipyme.models.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {
}
