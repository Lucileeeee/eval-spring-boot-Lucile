package com.spring.evalspring.exception;

public class CategorieNotFoundException extends RuntimeException {
    public CategorieNotFoundException(Integer id) {
        super("La ctageorie avec id : " + id + " n'existe pas");
    }
}

