/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataBase.DatabaseConfig;
import dto.UserDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Carolina
 */
public class UserRepository {
    
    public UserDTO findById(String nombre) throws SQLException {
        String query = "SELECT * FROM user WHERE nombre = " + nombre;
        try (Connection connection = DatabaseConfig.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {
            if (resultSet.next()) {
                return new UserDTO(
                    resultSet.getString("contrasena"),
                    resultSet.getString("name"),
                    resultSet.getString("email")
    );
        } else {
        return null;
             }
        }
}

public void save(UserDTO user) throws SQLException {
    String query = "INSERT INTO users (nombre, correo,contrasena) VALUES ('" +user.getNombre() + "', '" + user.getCorreo() + "' +user.getContrasena()";
    try (Connection connection = DatabaseConfig.getConnection();
        Statement statement = connection.createStatement()) {
        statement.executeUpdate(query);
}
}

    
}
