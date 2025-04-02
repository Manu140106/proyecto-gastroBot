/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Carolina
 */
public class PreferenciasDTO {
    
    private int idPreferencia;
    private int idUsuario;
    private String tipoDieta;  // Vegana, Vegetariana, Keto, etc.
    private boolean sinGluten;  
    private boolean sinLactosa;  
    private boolean sinAzúcar; 
    private boolean alergico;  
    private String nivelPicante;
    private String cocinaFavorita;  // Italiana, Mexicana, Japonesa, etc.
    private String restriccionCalorica; 

    public PreferenciasDTO(int idPreferencia, int idUsuario, String tipoDieta, boolean sinGluten, boolean sinLactosa, boolean sinAzúcar, boolean alergico, String nivelPicante, String cocinaFavorita, String restriccionCalorica) {
        this.idPreferencia = idPreferencia;
        this.idUsuario = idUsuario;
        this.tipoDieta = tipoDieta;
        this.sinGluten = sinGluten;
        this.sinLactosa = sinLactosa;
        this.sinAzúcar = sinAzúcar;
        this.alergico = alergico;
        this.nivelPicante = nivelPicante;
        this.cocinaFavorita = cocinaFavorita;
        this.restriccionCalorica = restriccionCalorica;
    }

    public int getIdPreferencia() {
        return idPreferencia;
    }

    public void setIdPreferencia(int idPreferencia) {
        this.idPreferencia = idPreferencia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoDieta() {
        return tipoDieta;
    }

    public void setTipoDieta(String tipoDieta) {
        this.tipoDieta = tipoDieta;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isSinLactosa() {
        return sinLactosa;
    }

    public void setSinLactosa(boolean sinLactosa) {
        this.sinLactosa = sinLactosa;
    }

    public boolean isSinAzúcar() {
        return sinAzúcar;
    }

    public void setSinAzúcar(boolean sinAzúcar) {
        this.sinAzúcar = sinAzúcar;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public String getNivelPicante() {
        return nivelPicante;
    }

    public void setNivelPicante(String nivelPicante) {
        this.nivelPicante = nivelPicante;
    }

    public String getCocinaFavorita() {
        return cocinaFavorita;
    }

    public void setCocinaFavorita(String cocinaFavorita) {
        this.cocinaFavorita = cocinaFavorita;
    }

    public String getRestriccionCalorica() {
        return restriccionCalorica;
    }

    public void setRestriccionCalorica(String restriccionCalorica) {
        this.restriccionCalorica = restriccionCalorica;
    }
    
}
