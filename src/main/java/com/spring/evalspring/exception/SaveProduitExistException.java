package com.spring.evalspring.exception;

import com.spring.evalspring.model.Produit;

public class SaveProduitExistException extends RuntimeException{
    public SaveProduitExistException(Produit produit) {
        super("Le livre : " + produit.getNom() + ", " + produit.getPrix() + " existe déjà");
    }
}
