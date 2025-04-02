/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataBase.DatabaseConfig;
import dto.RecetaIngredienteDTO;
import dto.UserDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Carolina
 */
public class RecetaIngredienteRepository {
    
     public RecetaIngredienteDTO findById(int idReceta) throws SQLException {
        String query = "SELECT * FROM recetaIngrediente WHERE nombre = " + idReceta;
        try (Connection connection = DatabaseConfig.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {
            if (resultSet.next()) {
                return new RecetaIngredienteDTO(
                    resultSet.getInt("idReceta"),
                    resultSet.getInt("idIngrediente"),
                    resultSet.getString("cantidad")
    );
        } else {
        return null;
             }
        }
}

public void save(RecetaIngredienteDTO recetaIngrediente) throws SQLException {
    String query = "INSERT INTO recetaIngrediente (idReceta, idIngrediente,cantidad) VALUES ('" +recetaIngrediente.getIdReceta()+ "', '" + recetaIngrediente.getIdIngrediente() + "' + recetaIngrediente.getCantidad()";
    try (Connection connection = DatabaseConfig.getConnection();
        Statement statement = connection.createStatement()) {
        statement.executeUpdate(query);
}
}
}
    

