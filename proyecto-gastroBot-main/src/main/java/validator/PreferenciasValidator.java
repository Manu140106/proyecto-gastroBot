/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validator;

/**
 *
 * @author paula
 */
public class PreferenciasValidator {
    
     public static boolean validarTipoDieta(String tipoDieta) {
        return tipoDieta != null && !tipoDieta.trim().isEmpty();
    }

    public static boolean validarNivelPicante(String nivelPicante) {
        return nivelPicante != null && !nivelPicante.trim().isEmpty();
    }

    public static boolean validarCocinaFavorita(String cocina) {
        return cocina != null && !cocina.trim().isEmpty();
    }

    public static boolean validarRestriccionCalorica(String restriccion) {
        return restriccion != null && !restriccion.trim().isEmpty();
    }
}
