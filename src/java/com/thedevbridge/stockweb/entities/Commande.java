/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.entities;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author ferry
 */
public class Commande {
    private int idCommande;
    private int quantite;
    private Date dateCommande;
    private Time heureCommande;
    private int idClient;
    private int idProduit;

    public Commande() {
    }

    public Commande(int idCommande, int quantite, Date dateCommande, Time heureCommande, int idClient, int idProduit) {
        this.idCommande = idCommande;
        this.quantite = quantite;
        this.dateCommande = dateCommande;
        this.heureCommande = heureCommande;
        this.idClient = idClient;
        this.idProduit = idProduit;
    }

    public Commande(int quantite, Date dateCommande, Time heureCommande, int idClient, int idProduit) {
        this.quantite = quantite;
        this.dateCommande = dateCommande;
        this.heureCommande = heureCommande;
        this.idClient = idClient;
        this.idProduit = idProduit;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Time getHeureCommande() {
        return heureCommande;
    }

    public void setHeureCommande(Time heureCommande) {
        this.heureCommande = heureCommande;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }
    
    
}
