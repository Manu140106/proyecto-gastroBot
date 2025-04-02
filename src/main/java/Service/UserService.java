/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.UserRepository;
import dto.UserDTO;
import exception.InvalidUserDataException;
import java.sql.SQLException;
import validator.UserValidator;

/**
 *
 * @author Carolina
 */
public class UserService {
    
    private UserRepository userRepository = new UserRepository();
    
    public UserDTO getUserById(int id) throws SQLException{
        return userRepository.findById(id);
    }
    
    public void createUser(String nombre, String contrasena, String correo)throws SQLException, InvalidUserDataException{
        if (!UserValidator.validateNombre(nombre)  || !UserValidator.validateCorreo(contrasena)){
            throw new InvalidUserDataException("Invalid user data");
    }
        UserDTO user = new UserDTO ( nombre, correo, contrasena);
        userRepository.save(user);
    }
    
}
