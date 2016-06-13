/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.beans;

import com.thedevbridge.stockweb.entities.Client;
import com.thedevbridge.stockweb.entities.Commande;
import java.util.ArrayList;

/**
 *
 * @author ferry
 */
public class ClientBean {
     private int idBean;
    private String nomBean;
    private String adresseBean;
    private String contactBean;
    private ArrayList<Commande> listCommandeBean;
    private ArrayList<Client> listClientBean;

    public int getIdBean() {
        return idBean;
    }

    public void setIdBean(int idBean) {
        this.idBean = idBean;
    }

    public String getNomBean() {
        return nomBean;
    }

    public void setNomBean(String nomBean) {
        this.nomBean = nomBean;
    }

    public String getAdresseBean() {
        return adresseBean;
    }

    public void setAdresseBean(String adresseBean) {
        this.adresseBean = adresseBean;
    }

    public String getContactBean() {
        return contactBean;
    }

    public void setContactBean(String contactBean) {
        this.contactBean = contactBean;
    }

    public ArrayList<Commande> getListCommandeBean() {
        return listCommandeBean;
    }

    public void setListCommandeBean(ArrayList<Commande> listCommandeBean) {
        this.listCommandeBean = listCommandeBean;
    }

    public ArrayList<Client> getListClientBean() {
        return listClientBean;
    }

    public void setListClientBean(ArrayList<Client> listClientBean) {
        this.listClientBean = listClientBean;
    }
    
    
}
