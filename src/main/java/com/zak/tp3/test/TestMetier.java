package com.zak.tp3.test;
import com.zak.tp3.metier.MetierImpl;
import com.zak.tp3.metier.Produit;
import java.util.List;
public class TestMetier {
    public static void main(String[] args) {
        MetierImpl metier= new MetierImpl();
        List <Produit> prods = metier.getProduitsParMotCle("Asus");
        for (Produit p : prods)
            System.out.println(p.getNomProduit());
    }
}