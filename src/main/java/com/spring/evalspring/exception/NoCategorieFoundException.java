package com.spring.evalspring.exception;

public class NoCategorieFoundException extends RuntimeException{
    public NoCategorieFoundException() {
        super("Aucune cateégorie trouvés dans la base de données");
    }
}




