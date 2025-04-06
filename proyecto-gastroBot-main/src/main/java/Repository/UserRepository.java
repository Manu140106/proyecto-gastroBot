/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import dataBaseConfig.DatabaseConfig;
import dto.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Carolina
 */
public class UserRepository {
    
    public UserDTO findByCorreoAndContraseña(String correo, String contraseña) throws SQLException {
        String query = "SELECT * FROM Usuario WHERE correo=? AND contraseña=?";
       try (Connection connection = DatabaseConfig.getConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {

        statement.setString(1, correo);
        statement.setString(2, contraseña);

        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                return new UserDTO(
                    
                    resultSet.getString("nombre"),
                    resultSet.getString("correo"),
                    resultSet.getString("contraseña")
                );
            } else {
                return null;
            }
        }
    }
}
    
    
    
    

public void save(UserDTO Usuario) throws SQLException {
    String query = "INSERT INTO Usuario (idUusario, nombre, correo,contraseña) VALUES ('" + Usuario.getNombre() + "', '" 
                    + Usuario.getCorreo() + "', '" 
                    + Usuario.getContraseña() + "')";
    try (Connection connection = DatabaseConfig.getConnection();
        Statement statement = connection.createStatement()) {
        statement.executeUpdate(query);
}
}

public void actualizarContraseña(String correo, String nuevaContraseña) throws SQLException {
    String sql = "UPDATE Usuario SET contraseña = ? WHERE correo = ?";

    try (Connection conn = DatabaseConfig.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, nuevaContraseña);
        stmt.setString(2, correo);
        stmt.executeUpdate();
    }
}

    
}
