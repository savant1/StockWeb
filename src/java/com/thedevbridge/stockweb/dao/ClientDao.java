/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.dao;

import com.thedevbridge.stockweb.entities.Client;
import com.thedevbridge.stockweb.entities.Commande;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author ferry
 */
public class ClientDao {
    
    PreparedStatement pst;
    ResultSet rs ;
    Client cli;
    Commande com;
    
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
    
    public Client saveClient(Client c){
        Connection connexion = DBConnection.connexionDatabase();
        String sql = "INSERT INTO client (nom,adresse,contact) values (?,?,?)";
        try {
            pst = connexion.prepareStatement(sql);
            pst.setString(1, c.getNom());
            pst.setString(2, c.getAdresse());
            pst.setString(3, c.getContact());
            pst.executeUpdate();
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, sqle);
        }finally{
            closeConnexion();
        }
        return c;
    }
    
    public List<Client>  findAllClient(){
        Connection connexion = DBConnection.connexionDatabase();
         List<Client> client = new ArrayList();
        String sql = "SELECT * FROM client";
        try {
            pst = connexion.prepareStatement(sql);
            rs= pst.executeQuery();
            while (rs.next()) {                
                cli = new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                client.add(cli);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            closeConnexion();
        }
        
        return client;
    }
    
    public List<Client> takeAll(HttpServletRequest request){
        List<Client> client = new ArrayList();
        
        return client;
    }
    
    public Client findClientById(int id){
         Connection connexion = DBConnection.connexionDatabase();
        String sql = "SELECT * FROM client WHERE id="+id;
        try {
            pst = connexion.prepareStatement(sql);
            rs= pst.executeQuery();
            while (rs.next()) {    
               cli = new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            closeConnexion();
        }
        return cli;
    }
    
    public Client updateClient(Client c,int id){
        Connection connexion = DBConnection.connexionDatabase();
        String sql = "UPDATE client SET  nom = ?,adresse = ?,contact = ? WHERE id="+id;
        try {
            pst = connexion.prepareStatement(sql);
            pst.setString(1, c.getNom());
            pst.setString(2, c.getAdresse());
            pst.setString(3, c.getContact());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            closeConnexion();
        }
        return c;
    }
    
    public Client deleteClient(Client c,int id){
        Connection connexion = DBConnection.connexionDatabase();
        String sql = "DELETE client WHERE id="+id;
        try {
            pst = connexion.prepareStatement(sql);
            if(id != 0){
                pst.executeUpdate();
            }else{
                System.out.println("Not user found for this id '"+id+"' try again whith the value > 0");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            closeConnexion();
        }
        return c;
    }
    
    //recuperation de la liste ds commandes d'un client
    public List<Commande> listeCommande(){
        Connection connexion = DBConnection.connexionDatabase();
         List<Commande> commandeList = new ArrayList();
        String sql = "SELECT * FROM commande WHERE idclient = 2";
            try {
            pst = connexion.prepareStatement(sql);
            rs= pst.executeQuery();
            while (rs.next()) {    
               com = new Commande(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getDouble(4),rs.getInt(5),rs.getInt(7),rs.getDouble(6));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            System.out.println(com+ "est null");
            closeConnexion();
        }
        return commandeList;
    }
}
