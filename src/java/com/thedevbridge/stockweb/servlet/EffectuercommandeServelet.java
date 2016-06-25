/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.servlet;

import com.thedevbridge.stockweb.dao.CommandeDao;
import com.thedevbridge.stockweb.dao.ProduitDao;
import com.thedevbridge.stockweb.entities.Commande;
import com.thedevbridge.stockweb.entities.Produit;
import java.io.IOException;
import java.io.PrintWriter;
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
public class EffectuercommandeServelet extends HttpServlet {

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
        Date date = new Date();
        SimpleDateFormat dateFormatComp,heureFormatComp;
        dateFormatComp = new SimpleDateFormat("dd MM yyyy");
        heureFormatComp = new SimpleDateFormat("hh:mm:ss a");
        String datecommande = dateFormatComp.format(date); 
        String heurecommande = heureFormatComp.format(date);
        CommandeDao commandeDao = new CommandeDao();
        ProduitDao produitDao = new ProduitDao();
        int id = Integer.parseInt(request.getParameter("produit"));
        Produit produit = produitDao.findProduitById(id);
        System.out.println("le prix est : "+produit.getPrix()+" et son id est:"+id);
        Commande commande =  new Commande(
                                Integer.parseInt(request.getParameter("numcommande"))
                                ,Integer.parseInt(request.getParameter("produit"))
                                ,produit.getReference(),
                                 produit.getPrix(),
                                Integer.parseInt(request.getParameter("quantite"))
                                ,(produit.getPrix()*Integer.parseInt(request.getParameter("quantite"))),
                                Integer.parseInt(request.getParameter("idclient"))
                                ,datecommande
                                ,heurecommande
                            );
        commandeDao.saveArticleCommande(commande);
        request.setAttribute("idclient", request.getParameter("idclient"));
        request.setAttribute("numcommande", request.getParameter("numcommande"));
        List<Produit> conteneurProduit = produitDao.findAllProdut();
        request.setAttribute("listeProduit", conteneurProduit);
        this.getServletContext().getRequestDispatcher("/CommandeServlet").forward(request, response);
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
