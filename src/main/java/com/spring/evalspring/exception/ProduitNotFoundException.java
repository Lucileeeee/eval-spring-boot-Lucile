package com.spring.evalspring.exception;

public class ProduitNotFoundException extends RuntimeException {
    public ProduitNotFoundException(Integer id) {
        super("Le produit avec id : " + id + " n'existe pas");
    }
}
