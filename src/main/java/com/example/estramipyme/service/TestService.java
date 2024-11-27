package com.example.estramipyme.service;

import java.util.List;
import java.util.Optional;

import com.example.estramipyme.models.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.estramipyme.models.Test;
import com.example.estramipyme.repository.TestRepository;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public List<Test> findAllTests() {
        return testRepository.findAll();
    }

    public Optional<Test> findTestById(int id) {
        return testRepository.findById(id);
    }



    public Test saveTest(Test test) {
        return testRepository.save(test);
    }

    public void deleteTest(int id) {
        testRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return testRepository.existsById(id);
    }
}
