/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.entities;

import java.util.Date;
import org.apache.tomcat.jni.Time;


/**
 *
 * @author ferry
 */
public class Commande {
    private int idCommande;
    private int num_facture;
    private int idProduit;
    private String reference;
    private double prix;
    private int quantite;
    private double subtotal;
    private int idClient;
    private String dateCommande;
    private String heureCommande;

    public Commande() {
    }

    public Commande(int idCommande, int num_facture, int idProduit, String reference, double prix, int quantite, double subtotal, int idClient, String dateCommande, String heureCommande) {
        this.idCommande = idCommande;
        this.num_facture = num_facture;
        this.idProduit = idProduit;
        this.reference = reference;
        this.prix = prix;
        this.quantite = quantite;
        this.subtotal = subtotal;
        this.idClient = idClient;
        this.dateCommande = dateCommande;
        this.heureCommande = heureCommande;
    }

    public Commande(int num_facture, int idProduit, String reference, double prix, int quantite, double subtotal, int idClient, String dateCommande, String heureCommande) {
        this.num_facture = num_facture;
        this.idProduit = idProduit;
        this.reference = reference;
        this.prix = prix;
        this.quantite = quantite;
        this.subtotal = subtotal;
        this.idClient = idClient;
        this.dateCommande = dateCommande;
        this.heureCommande = heureCommande;
    }
    
    

    public Commande(int num_facture, int quantite, double prix, String dateCommande, String heureCommande, int idClient, int idProduit, double subtotal) {
        this.num_facture = num_facture;
        this.quantite = quantite;
        this.prix = prix;
        this.dateCommande = dateCommande;
        this.heureCommande = heureCommande;
        this.idClient = idClient;
        this.idProduit = idProduit;
        this.subtotal = subtotal;
    }

    public Commande(int idCommande, int num_facture, int quantite, double prix, String dateCommande, String heureCommande, int idClient, int idProduit, double subtotal) {
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getHeureCommande() {
        return heureCommande;
    }

    public void setHeureCommande(String heureCommande) {
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
