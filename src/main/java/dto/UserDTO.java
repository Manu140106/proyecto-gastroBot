/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Carolina
 */
public class UserDTO {
    
    private String nombre;
    private String contrasena;
    private String correo;

    public UserDTO(String nombre, String contrasena,String  correo) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getContrasena(){
        return contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
