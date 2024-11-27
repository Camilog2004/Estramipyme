package com.example.estramipyme.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.estramipyme.models.Administrator;
import com.example.estramipyme.service.AdministratorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/administrators")
public class AdministratorController {

    @Autowired
    private AdministratorService service;

    @PostMapping("/create")
    public Administrator createAdministrator(@RequestBody Administrator admin) {
        return service.createAdministrator(admin);
    }

    @GetMapping
    public List<Administrator> getAdministratorsByEmail(@RequestParam String email) {
        return service.findAllCompaniesByEmail(email);
    }

    @GetMapping("/all")
    public List<Administrator> showAllAdministrators() {
        return service.getAllAdministrators();
    }

    @PutMapping("/{id}")
public ResponseEntity<Administrator> updateAdministrator(@PathVariable String id, @RequestBody Administrator administrator) {
    return service.findAdministratorById(id).map(existingAdministrator -> {
        administrator.setId(id);
        return ResponseEntity.ok(service.saveAdministrator(administrator)); 
    }).orElse(ResponseEntity.notFound().build());
}


    @DeleteMapping("/delete/{id}")
    public void deleteAdministrator(@PathVariable String id) {
        service.deleteAdministrator(id);
    }
}
