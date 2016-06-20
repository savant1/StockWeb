/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.dao;

import com.thedevbridge.stockweb.entities.Commande;
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
public class CommandeDao {
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
    
    public Commande saveArticleCommande(Commande c){
        Connection connexion = DBConnection.connexionDatabase();
        String sql = "INSERT INTO commande (num_facture,code_produit,reference,prix_vente,quantite,subtotal,idclient,datecommande,heurecommande)"
                   + " values (?,?,?,?,?,?,?,?,?)";
        try {
            pst = connexion.prepareStatement(sql);
            pst.setInt(1, c.getNum_facture());
            pst.setInt(2, c.getIdProduit());
            pst.setInt(3, c.getIdClient());
            pst.setDouble(4, c.getPrix());
            pst.setInt(5, c.getQuantite());
            pst.setDouble(6, c.getSubtotal());
            pst.setInt(7, c.getIdClient());
            pst.setString(8, c.getDateCommande());
            pst.setString(9, c.getHeureCommande());
            pst.executeUpdate();
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, sqle);
        }finally{
            closeConnexion();
        }
        return c;
    }
}
