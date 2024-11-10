//package controller;

//import model.Administrator;
//import service.AdministratorService;

//import java.util.List;

//public class AdministratorController {
//    private AdministratorService service = new AdministratorService();

//    public void createAdministrator(String id, String email, String password) {
//        Administrator admin = new Administrator(id, email, password);
//        service.createAdministrator(admin);
//    }
    
//    public void showAllAdministrators() {
//        List<Administrator> admins = service.getAllAdministrators();
//        for (Administrator admin : admins) {
//            System.out.println("ID: " + admin.getId());
//            System.out.println("Email: " + admin.getEmail());
//            System.out.println("----------------");
//        }
//    }

//    public void updateAdministrator(String id, String newEmail, String newPassword) {
//        Administrator admin = new Administrator(id, newEmail, newPassword);
//        service.updateAdministrator(admin);
//    }

//    public void deleteAdministrator(String id) {
//        service.deleteAdministrator(id);
//    }
//}


package controller;

import model.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AdministratorService;

import java.util.List;

@RestController
@RequestMapping("/administrators")
public class AdministratorController {

    @Autowired
    private AdministratorService service;

    @PostMapping("/create")
    public void createAdministrator(@RequestBody Administrator admin) {
        service.createAdministrator(admin);
    }

    @GetMapping("/all")
    public List<Administrator> showAllAdministrators() {
        return service.getAllAdministrators();
    }

    @PutMapping("/update")
    public void updateAdministrator(@RequestBody Administrator admin) {
        service.updateAdministrator(admin);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAdministrator(@PathVariable String id) {
        service.deleteAdministrator(id);
    }
}
