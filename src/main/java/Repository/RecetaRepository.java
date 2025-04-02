/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataBase.DatabaseConfig;
import dto.RecetaDTO;
import dto.UserDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Carolina
 */
public class RecetaRepository{
    
    public RecetaDTO findById(int nombre) throws SQLException {
        String query = "SELECT * FROM receta WHERE nombre = " + nombre;
        try (Connection connection = DatabaseConfig.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {
            if (resultSet.next()) {
                return new RecetaDTO(
                    resultSet.getString("ingredientes"),
                    resultSet.getString("nombre"),
                    resultSet.getString("paso"),
                    resultSet.getString("proteinaselceccionada")
                        
                        
    );
        } else {
        return null;
             }
        }
}

    
    public void save(RecetaDTO receta) throws SQLException {
    String query = "INSERT INTO receta  (nombre, ingredientes ,pasos, proteinaseleccionada ) VALUES ('" +receta.getNombre() + "', '" + receta.getIngredientes()+  "', '" + receta.getPasos()+ "," ;
    try (Connection connection = DatabaseConfig.getConnection();
        Statement statement = connection.createStatement()) {
        statement.executeUpdate(query);
}
}

   
    
}
