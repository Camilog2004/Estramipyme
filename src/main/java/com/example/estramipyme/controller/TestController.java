package com.example.estramipyme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.estramipyme.models.Test;
import com.example.estramipyme.service.TestService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/tests")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/all")
    public List<Test> getAllTests() {
        return testService.findAllTests();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Test> getTestById(@PathVariable int id) {
        return testService.findTestById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Test> createTest(@RequestBody Test test) {
        return ResponseEntity.ok(testService.saveTest(test));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Test> updateTest(@PathVariable int id, @RequestBody Test test) {
        return testService.findTestById(id).map(existingTest -> {
            test.setIdTest(id); 
            return ResponseEntity.ok(testService.saveTest(test));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTest(@PathVariable int id) {
        if (testService.existsById(id)) {
            testService.deleteTest(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
