/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ferry
 */
public class DBConnection {
   
    public static Connection connection ;
    
    public static Connection connexionDatabase() { 
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(Parameters.HOST_DB, Parameters.USERNAME_DB, Parameters.PASSWORD_DB);
        } catch (ClassNotFoundException | SQLException e)  {
            System.out.println(e.getMessage());
        }
        return connection;
    }

 
   public static void closeConnexion() {
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
