/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.dao;

import com.thedevbridge.stockweb.entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ferry
 */
public class UserDao {
    PreparedStatement pst;
    ResultSet rs ;
    
        //vous utiliserez cette methode pour fermer toute les instances de connexions en cour
    public void closeConnexion(){
        Connection connexion = DBConnection.connexionDatabase();
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                    Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            if (connexion != null) {
                try {
                    connexion.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    
    public boolean connectIt(String username, String password){
        Connection connexion = DBConnection.connexionDatabase();
        User u;
        String sql = "SELECT * FROM user WHERE username="+username +" AND password="+password;
            try {
                pst = connexion.prepareStatement(sql);
                rs= pst.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            u = new User(username,password);
            closeConnexion();
        }
            return true;
    }
    
}
