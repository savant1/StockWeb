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
public class Fournisseur {
    
    private int idFournisseur;
    private String nomSociete;
    private int nomFournisseur;

    public Fournisseur(int idFournisseur, String nomSociete, int nomFournisseur) {
        this.idFournisseur = idFournisseur;
        this.nomSociete = nomSociete;
        this.nomFournisseur = nomFournisseur;
    }

    public Fournisseur() {
    }

    public Fournisseur(String nomSociete, int nomFournisseur) {
        this.nomSociete = nomSociete;
        this.nomFournisseur = nomFournisseur;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public String getNomSociete() {
        return nomSociete;
    }

    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }

    public int getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(int nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }
    
    
}
