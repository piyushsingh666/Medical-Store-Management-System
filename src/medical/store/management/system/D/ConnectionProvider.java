/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medical.store.management.system.D;

/**
 *
 * @author RAM
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    public Connection getCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical?useSSL=false","root","Ram@1818");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Properly handle the exception, e.g., log it
            return null;
        }
    }
    public static void main (String args[]){
    }
}