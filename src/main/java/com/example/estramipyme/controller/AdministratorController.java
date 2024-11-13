package com.example.estramipyme.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.estramipyme.models.Administrator;
import com.example.estramipyme.service.AdministratorService;

@RestController
@RequestMapping("api/administrators")
public class AdministratorController {

    @Autowired
    private AdministratorService service;

    @PostMapping("/create")
    public Administrator createAdministrator(@RequestBody Administrator admin) {
        return service.createAdministrator(admin);
    }

    @GetMapping("/all")
    public List<Administrator> showAllAdministrators() {
        return service.getAllAdministrators();
    }

    @PutMapping("/{id}")
public ResponseEntity<Administrator> updateAdministrator(@PathVariable String id, @RequestBody Administrator administrator) {
    return service.findAdministratorById(id).map(existingAdministrator -> {
        administrator.setIdAdministrator(id); 
        return ResponseEntity.ok(service.saveAdministrator(administrator)); 
    }).orElse(ResponseEntity.notFound().build());
}


    @DeleteMapping("/delete/{id}")
    public void deleteAdministrator(@PathVariable String id) {
        service.deleteAdministrator(id);
    }
}
