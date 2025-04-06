/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.PreferenciasRepository;
import dto.PreferenciasDTO;
import exception.InvalidPreferenciasDataException;
import java.sql.SQLException;
import validator.PreferenciasValidator;

/**
 *
 * @author Carolina
 */
public class PreferenciasService {
     private PreferenciasRepository repository = new PreferenciasRepository();

    public void createPreferencia(int idPreferencia, int idUsuario, String tipoDieta, boolean sinGluten, boolean sinLactosa,
                                  boolean sinAzúcar, boolean alergico, String nivelPicante, String cocinaFavorita, String restriccionCalorica) throws SQLException {

        // Aquí puedes validar con un Validator si lo tienes, por ahora lo dejamos limpio
        PreferenciasDTO dto = new PreferenciasDTO(idPreferencia, idUsuario, tipoDieta, sinGluten, sinLactosa,
                                                  sinAzúcar, alergico, nivelPicante, cocinaFavorita, restriccionCalorica);

        repository.save(dto); // Asegúrate que este método existe en PreferenciasRepository
    }
}