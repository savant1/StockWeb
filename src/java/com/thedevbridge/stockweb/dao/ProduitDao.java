/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.dao;

import com.thedevbridge.stockweb.entities.Client;
import com.thedevbridge.stockweb.entities.Produit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ferry
 */
public class ProduitDao {
    PreparedStatement pst;
    ResultSet rs ;
    Produit pro;
    
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
    public List<Produit>findAllProdut(){
        Connection connexion = DBConnection.connexionDatabase();
         List<Produit> produit = new ArrayList();
        String sql = "SELECT * FROM produit";
        try {
            pst = connexion.prepareStatement(sql);
            rs= pst.executeQuery();
            while (rs.next()) {                
                pro = new Produit(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
                rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9));
                
                produit.add(pro);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            closeConnexion();
        }
        return produit;
    }
}
