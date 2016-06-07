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
    private String code_produit;
    private String reference;
    private String designation;
    private String rangement;
    private double remise;
    private double prix;
    private int stock;
    private int idFournisseur;

    public Produit() {
    }

    public Produit(String code_produit, String reference, String designation, String rangement, double remise, double prix, int stock, int idFournisseur) {
        this.code_produit = code_produit;
        this.reference = reference;
        this.designation = designation;
        this.rangement = rangement;
        this.remise = remise;
        this.prix = prix;
        this.stock = stock;
        this.idFournisseur = idFournisseur;
    }

    public Produit(int idProduit, String code_produit, String reference, String designation, String rangement, double remise, double prix, int stock, int idFournisseur) {
        this.idProduit = idProduit;
        this.code_produit = code_produit;
        this.reference = reference;
        this.designation = designation;
        this.rangement = rangement;
        this.remise = remise;
        this.prix = prix;
        this.stock = stock;
        this.idFournisseur = idFournisseur;
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

    public String getCode_produit() {
        return code_produit;
    }

    public void setCode_produit(String code_produit) {
        this.code_produit = code_produit;
    }

    public String getRangement() {
        return rangement;
    }

    public void setRangement(String rangement) {
        this.rangement = rangement;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
