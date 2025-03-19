package com.spring.evalspring.exception;

public class NoProduitFoundException extends RuntimeException{
    public NoProduitFoundException() {
        super("Aucun produit trouvés dans la base de données");
    }
}
