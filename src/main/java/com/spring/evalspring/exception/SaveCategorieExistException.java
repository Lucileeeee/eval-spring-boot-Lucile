package com.spring.evalspring.exception;

import com.spring.evalspring.model.Categorie;

public class SaveCategorieExistException extends RuntimeException{
    public SaveCategorieExistException(Categorie categorie) {
        super("La catégorie : " + categorie.getLibele() +  " existe déjà");
    }
}
