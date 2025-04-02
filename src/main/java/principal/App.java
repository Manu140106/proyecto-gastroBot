/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author paula
 */
    public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/gastrobot";
        String user = "root";
        String password = "pumbolillo1145D";
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
    if (connection != null) {
    System.out.println("Conexión exitosa!");
    }
    } catch (SQLException e) {
    e.printStackTrace();
}
}
}