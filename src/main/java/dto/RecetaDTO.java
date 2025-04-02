/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Carolina
 */
public class RecetaDTO {
     private String nombre;
    private String ingredientes;
    private String pasos;
    private String proteinasSeleccionadas;
    
    public RecetaDTO(String nombre, String ingredientes, String pasos, String proteinasSeleccionadas) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
        this.proteinasSeleccionadas = proteinasSeleccionadas;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getIngredientes(){
        return ingredientes;
    }
    
    public String getPasos(){
        return pasos;
    }

    public String getProteinasSeleccionadas() {
        return proteinasSeleccionadas;
    }
    
}
