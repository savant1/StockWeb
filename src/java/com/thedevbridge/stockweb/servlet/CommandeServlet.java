/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.servlet;

import com.thedevbridge.stockweb.dao.ProduitDao;
import com.thedevbridge.stockweb.entities.Produit;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ferry
 */
public class CommandeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // mettre tout le code de doGet et doPost ici
        //recuperation de l'idclient
        int idClient = Integer.parseInt(request.getParameter("idclient"));
        request.setAttribute("idclient", idClient);
        //generation d'un numero pour la commande
        Date date = new Date();
        SimpleDateFormat dateFormatComp;
        dateFormatComp = new SimpleDateFormat("ddhhmmss");
        String numcommande = dateFormatComp.format(date);
        request.setAttribute("numcommande", numcommande);
        //recuperation de la liste des produits
        ProduitDao produitDao = new ProduitDao();
        List<Produit> conteneurProduit = produitDao.findAllProdut();
        request.setAttribute("listeProduit", conteneurProduit);
        this.getServletContext().getRequestDispatcher("/effectuercommande.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
