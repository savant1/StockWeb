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
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author ferry
 */
public class UserDao {
    PreparedStatement pst;
    ResultSet rs ;
        User u;
    
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
    
    public User connectIt(HttpServletRequest request){
        Connection connexion = DBConnection.connexionDatabase();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sql = "SELECT * FROM utilisateur WHERE username= ? AND password= ? ";
        try {
                pst = connexion.prepareStatement(sql);
                pst.setString(1, username);
                pst.setString(2, password);
                rs= pst.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                if(rs.next()){
                    u = new User(rs.getString("username"),rs.getString("password"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnexion();
        }
        return u;
    }
    
}
