package com.example.estramipyme.repository;

import com.example.estramipyme.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


import com.example.estramipyme.models.Test;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {


}
