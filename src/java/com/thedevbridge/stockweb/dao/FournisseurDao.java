/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.dao;

import com.thedevbridge.stockweb.entities.Fournisseur;
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
public class FournisseurDao {
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
    
     public Fournisseur saveFournisseur(Fournisseur f){
        Connection connexion = DBConnection.connexionDatabase();
        String sql = "INSERT INTO fournisseur (nomsociete,nomfournisseur) values (?,?)";

        try {
            pst = connexion.prepareStatement(sql);
            pst.setString(1, f.getNomSociete());
            pst.setString(2, f.getNomFournisseur());
            pst.executeUpdate();
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, sqle);
        }finally{
            closeConnexion();
        }
        return f;
    }
}
