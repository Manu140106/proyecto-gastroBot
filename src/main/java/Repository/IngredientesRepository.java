/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataBase.DatabaseConfig;
import dto.IngredienteDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Carolina
 */
public class IngredientesRepository {
    
     public IngredienteDTO findById(int idIngrediente) throws SQLException {
        String query = "SELECT * FROM  WHERE preferencia ingrediente = " + idIngrediente;
        try (Connection connection = DatabaseConfig.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {
            if (resultSet.next()) {
                return new IngredienteDTO(
                    resultSet.getInt("idingrediente"),
                    resultSet.getString("nombre"),
                    resultSet.getDate("fechaVencimiento"),
                    resultSet.getDouble("cantidad"),
                    resultSet.getInt("Idusuario"),
                    resultSet.getString("Categoria")                     
    );
        } else {
        return null;
             }
        }
}
    
}
