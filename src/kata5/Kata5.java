/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author usuario
 */
public class Kata5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      //Depende del gestor de bases de datos que estemos usando
      Class.forName("org.sqlite.JDBC");
      //Aqui ponemos nuestra base de datos
      Connection c = DriverManager.getConnection("jdbc:sqlite:KATADB");

      
      
    //Permite realizar consultas
    Statement stmt = c.createStatement();
    //Aqui digo la query que quiero que ejecute
    ResultSet rs = stmt.executeQuery("SELECT * FROM PEOPLE");
      
    while(rs.next()){
        System.out.println("ID = " + rs.getInt("ID"));
        System.out.println("NAME = " + rs.getString("NAME"));
    }
    
      String sql = "CREATE TABLE COMPANY " +
                   "(ID INT PRIMARY KEY     NOT NULL," +
                   " NAME           TEXT    NOT NULL, " ; 
      
      
      rs.close();
      stmt.close();
      c.close();
    }
    
}
