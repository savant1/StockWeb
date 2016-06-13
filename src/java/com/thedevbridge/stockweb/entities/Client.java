/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.entities;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ferry
 */
public class Client implements Serializable{
    private int id;
    private String nom;
    private String adresse;
    private String contact;
    private ArrayList<Commande> listCommande;

    public Client() {
    }

    public Client(int id, String nom, String adresse, String contact, ArrayList<Commande> listCommande) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
        this.listCommande = listCommande;
    }

    public Client(String nom, String adresse, String contact, ArrayList<Commande> listCommande) {
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
        this.listCommande = listCommande;
    }

    public Client(String nom, String adresse, String contact) {
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public Client(int id, String nom, String adresse, String contact) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public ArrayList<Commande> getListCommande() {
        return listCommande;
    }

    public void setListCommande(ArrayList<Commande> listCommande) {
        this.listCommande = listCommande;
    }
    
    
}
