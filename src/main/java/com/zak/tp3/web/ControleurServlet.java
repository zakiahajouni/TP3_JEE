package com.zak.tp3.web;

import com.zak.tp3.metier.ImetierCatalogue;
import com.zak.tp3.metier.MetierImpl;
import com.zak.tp3.metier.Produit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet (name="cs",urlPatterns= {"/controleur"})
public class ControleurServlet extends HttpServlet {
    private ImetierCatalogue metier;
    @Override
    public void init() throws ServletException {
        metier=new MetierImpl();
    }
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String mc=request.getParameter("motCle");
        ProduitModele mod = new ProduitModele();
        mod.setMotCle(mc);
        List<Produit> prods = metier.getProduitsParMotCle(mc);
        mod.setProduits(prods);
        request.setAttribute("modele", mod);
        request.getRequestDispatcher("ProduitsView.jsp").forward(request,response);
    }
}