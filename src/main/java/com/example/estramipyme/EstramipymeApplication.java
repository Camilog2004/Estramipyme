//package com.example.Estramipyme;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import controller.administratorController;

//@SpringBootApplication
//public class EstramipymeApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(EstramipymeApplication.class, args);
//        AdministratorController controller = new AdministratorController();
//        // Crear un nuevo administrador
//        controller.createAdministrator("admin01", "admin@example.com", "password123");
//
// Mostrar todos los administradores
//        controller.showAllAdministrators();

// Actualizar un administrador
//        controller.updateAdministrator("admin01", "updated_admin@example.com", "newpassword456");

// Eliminar un administrador
//        controller.deleteAdministrator("admin01");
//    }
//}

package com.example.estramipyme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstramipymeApplication {
    public static void main(String[] args) {
        SpringApplication.run(EstramipymeApplication.class, args);
    }
}