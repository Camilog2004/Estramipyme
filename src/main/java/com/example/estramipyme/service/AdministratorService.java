package com.example.estramipyme.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.estramipyme.models.Administrator;
import com.example.estramipyme.repository.AdministratorRepository;

@Service
public class AdministratorService {

    @Autowired
    private AdministratorRepository repository;

    public Administrator createAdministrator(Administrator admin) {
        return repository.save(admin);
    }

    public List<Administrator> getAllAdministrators() {
        return repository.findAll();
    }

    public Optional<Administrator> findAdministratorById(String id) {
        return repository.findById(id);
    }

    public Administrator saveAdministrator(Administrator administrator) {
        return repository.save(administrator);
    }

    public void deleteAdministrator(String id) {
        repository.deleteById(id);
    }
}
