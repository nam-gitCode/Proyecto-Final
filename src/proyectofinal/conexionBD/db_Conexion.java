/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.conexionBD;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author kesec
 */
public class db_Conexion {
    Connection cn;
    Statement st;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_refugio","root","9806");
            System.out.println("Conexión Exitosa");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }return cn;
    }
    Statement creatStatement(){
        throw new UnsupportedOperationException("No Soportado");
    }
}
