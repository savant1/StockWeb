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
    private int num_facture;
    private int quantite;
    private double prix;
    private Date dateCommande;
    private Time heureCommande;
    private int idClient;
    private int idProduit;
    private double subtotal;

    public Commande() {
    }

    public Commande(int num_facture, int quantite, double prix, Date dateCommande, Time heureCommande, int idClient, int idProduit, double subtotal) {
        this.num_facture = num_facture;
        this.quantite = quantite;
        this.prix = prix;
        this.dateCommande = dateCommande;
        this.heureCommande = heureCommande;
        this.idClient = idClient;
        this.idProduit = idProduit;
        this.subtotal = subtotal;
    }

    public Commande(int idCommande, int num_facture, int quantite, double prix, Date dateCommande, Time heureCommande, int idClient, int idProduit, double subtotal) {
        this.idCommande = idCommande;
        this.num_facture = num_facture;
        this.quantite = quantite;
        this.prix = prix;
        this.dateCommande = dateCommande;
        this.heureCommande = heureCommande;
        this.idClient = idClient;
        this.idProduit = idProduit;
        this.subtotal = subtotal;
    }

    public Commande(int idCommande, int num_facture, int quantite, double prix, int idClient, int idProduit, double subtotal) {
        this.idCommande = idCommande;
        this.num_facture = num_facture;
        this.quantite = quantite;
        this.prix = prix;
        this.idClient = idClient;
        this.idProduit = idProduit;
        this.subtotal = subtotal;
    }
    

    public int getNum_facture() {
        return num_facture;
    }

    public void setNum_facture(int num_facture) {
        this.num_facture = num_facture;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
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
