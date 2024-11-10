//package repository;
//
//import model.Administrator;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class AdministratorRepository {
//
//    public List<Administrator> findAll() {
//        List<Administrator> administrators = new ArrayList<>();
//        String query = "SELECT * FROM Administrator";
//        try (Connection conn = DatabaseConnection.getConnection();
//             PreparedStatement stmt = conn.prepareStatement(query);
//             ResultSet rs = stmt.executeQuery()) {
//
//            while (rs.next()) {
//                administrators.add(new Administrator(
//                        rs.getString("id_administrator"),
//                        rs.getString("email_administrator"),
//                        rs.getString("password_administrator")));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return administrators;
//    }
//
//    public void update(Administrator admin) {
//        String query = "UPDATE administrator SET email_administrator = ?, password_administrator = ? WHERE id_administrator = ?";
//        try (Connection conn = DatabaseConnection.getConnection();
//             PreparedStatement stmt = conn.prepareStatement(query)) {
//
//            stmt.setString(1, admin.getEmail());
//            stmt.setString(2, admin.getPassword());
//            stmt.setString(3, admin.getId());
//            stmt.executeUpdate();
//            System.out.println("Administrador actualizado con éxito.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void delete(String id) {
//        String query = "DELETE FROM Administrator WHERE id_administrator = ?";
//        try (Connection conn = DatabaseConnection.getConnection();
//             PreparedStatement stmt = conn.prepareStatement(query)) {
//
//            stmt.setString(1, id);
//            stmt.executeUpdate();
//            System.out.println("Administrador eliminado con éxito.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}

package repository;

import model.Administrator;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AdministratorRepository {

    public List<Administrator> findAll() {
        // Código de consulta a la base de datos...
    }

    public void update(Administrator admin) {
        // Código de actualización...
    }

    public void delete(String id) {
        // Código de eliminación...
    }

    public void create(Administrator admin) {
        // Método de creación de administrador...
    }
}
