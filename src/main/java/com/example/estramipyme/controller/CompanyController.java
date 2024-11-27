package com.example.estramipyme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.estramipyme.models.Company;
import com.example.estramipyme.service.CompanyService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/all")
    public List<Company> getAllCompanies() {
        return companyService.findAllCompanies();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable String id) {
        return companyService.findCompanyById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Company> getCompaniesByEmail(@RequestParam String email) {
        return companyService.findAllCompaniesByEmail(email);
    }

    @PostMapping
    public ResponseEntity<Company> createCompany(@RequestBody Company company) {
        if (companyService.findCompanyById(company.getId()).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(companyService.saveCompany(company));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> updateCompany(@PathVariable String id, @RequestBody Company company) {
        return companyService.findCompanyById(id).map(existingCompany -> {
            company.setId(id);
            return ResponseEntity.ok(companyService.saveCompany(company));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable String id) {
        if (companyService.findCompanyById(id).isPresent()) {
            companyService.deleteCompany(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
