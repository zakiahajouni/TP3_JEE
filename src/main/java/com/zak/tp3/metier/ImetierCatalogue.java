package com.zak.tp3.metier;
import java.util.List;
public interface ImetierCatalogue {
    public List<Produit> getProduitsParMotCle(String mc);
    public void addProduit(Produit p);
}