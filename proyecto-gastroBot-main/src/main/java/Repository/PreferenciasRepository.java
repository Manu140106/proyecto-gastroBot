/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import dataBaseConfig.DatabaseConfig;
import dto.PreferenciasDTO;
import dto.RecetaDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Carolina
 */
public class PreferenciasRepository {
    
    public void save(PreferenciasDTO dto) throws SQLException {
        String query = "INSERT INTO preferencias (idPreferencia, idUsuario, tipoDieta, sinGluten, sinLactosa, sinAzúcar, alergico, nivelPicante, cocinaFavorita, restriccionCalorica) " +
                       "VALUES (" + dto.getIdPreferencia() + ", " +
                                dto.getIdUsuario() + ", '" +
                                dto.getTipoDieta() + "', " +
                                dto.isSinGluten() + ", " +
                                dto.isSinLactosa() + ", " +
                                dto.isSinAzúcar() + ", " +
                                dto.isAlergico() + ", '" +
                                dto.getNivelPicante() + "', '" +
                                dto.getCocinaFavorita() + "', '" +
                                dto.getRestriccionCalorica() + "')";

        try (Connection connection = DatabaseConfig.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        }
    }
}
