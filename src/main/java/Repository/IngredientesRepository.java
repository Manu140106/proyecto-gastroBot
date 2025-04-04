/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataBase.DatabaseConfig;
import dto.IngredienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Carolina
 */
public class IngredientesRepository {
    
    public IngredienteDTO findById(int idIngrediente) throws SQLException {
    String query = "SELECT * FROM ingredientes WHERE idingrediente = ?"; 
    
    try (Connection connection = DatabaseConfig.getConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {
        
        
        statement.setInt(1, idIngrediente);
        
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                return new IngredienteDTO(
                    resultSet.getInt("idingrediente"),
                    resultSet.getString("nombre"),
                    resultSet.getString("categoria"), 
                    resultSet.getDate("fechaVencimiento"),
                    resultSet.getDouble("cantidad"),
                    resultSet.getInt("idusuario")  
                );  
            } else {
                return null;
            }
        }
    }
}
    
     public void save(IngredienteDTO ingrediente) throws SQLException {
     String query = "INSERT INTO ingrediente  (nombre, idIngrediente ,categoria, fecha_vencimiento, cantidad, idUsuario ) VALUES ('" +ingrediente.getNombre() + "', '" + ingrediente.getIdIngrediente()+  "', '" + ingrediente.getCategoria()+ "," + ingrediente.getFechaVencimiento()+ "," +ingrediente.getCantidad()+"," +ingrediente.getIdUsuario() ;
        try (Connection connection = DatabaseConfig.getConnection();
            Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
            }
    }
}
