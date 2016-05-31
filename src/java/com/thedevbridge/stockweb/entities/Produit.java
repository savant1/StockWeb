/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.entities;

/**
 *
 * @author ferry
 */
public class Produit {
    
    private int idProduit;
    private String reference;
    private String designation;
    private double prix;
    private int idFournisseur;

    public Produit(int idProduit, String reference, String designation, double prix, int idFournisseur) {
        this.idProduit = idProduit;
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
        this.idFournisseur = idFournisseur;
    }

    public Produit(String reference, String designation, double prix, int idFournisseur) {
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
        this.idFournisseur = idFournisseur;
    }

    public Produit() {
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }
    
    
}
