package com.zak.tp3.web;

import com.zak.tp3.metier.Produit;

import java.util.ArrayList;
import java.util.List;

public class ProduitModele {
    private String motCle;
    List<Produit> produits = new ArrayList<>();


    public String getMotCle() {
        return motCle;
    }
    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }
    public List<Produit> getProduits() {
        return produits;
    }
    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }



}