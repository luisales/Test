/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Calendar;

/**
 *
 * @author Velasquez
 */
public class Conectar {
    
    private static Connection conn;
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String user ="root";
    private static final String password ="";
    private static final String url ="jdbc:mysql://localhost:3306/examen";
    
    public Conectar()
    {
        conn=null;
        try
        {
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, password);
            if(conn!=null)
            {
                System.out.println("Conexion hecha");
            }
            
     
      
      conn.close(); 
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Error al conectar");
        }     
        
    }
    //create table users (
  //id int unsigned auto_increment not null,
  //first_name varchar(32) not null,
  //last_name varchar(32) not null,
  //date_created timestamp default now(),
  //is_admin boolean,
  //num_points int,
  //primary key (id)
//);
    public Connection getConnection()
    {
        return conn;
    }
    
    public void desconectar()
    {
        conn=null;
        if(conn==null)
        {
            System.out.println("Conexion desconectada");
        }
    }
   
   
      
    
  

}
