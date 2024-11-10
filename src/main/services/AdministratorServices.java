//package service;
//
//import model.Administrator;
//import repository.AdministratorRepository;
//
//import java.util.List;
//
//public class AdministratorService {
//    private AdministratorRepository repository = new AdministratorRepository();
//
//    public void createAdministrator(Administrator admin) {
//        repository.create(admin);
//    }
//
//    public List<Administrator> getAllAdministrators() {
//        return repository.findAll();
//    }
//
//    public void updateAdministrator(Administrator admin) {
//        repository.update(admin);
//    }
//
//    public void deleteAdministrator(String id) {
//        repository.delete(id);
//    }
//}

package service;

import model.Administrator;
import org.springframework.stereotype.Service;
import repository.AdministratorRepository;

import java.util.List;

@Service
public class AdministratorService {
    private final AdministratorRepository repository = new AdministratorRepository();

    public void createAdministrator(Administrator admin) {
        repository.create(admin);
    }

    public List<Administrator> getAllAdministrators() {
        return repository.findAll();
    }

    public void updateAdministrator(Administrator admin) {
        repository.update(admin);
    }

    public void deleteAdministrator(String id) {
        repository.delete(id);
    }
}
