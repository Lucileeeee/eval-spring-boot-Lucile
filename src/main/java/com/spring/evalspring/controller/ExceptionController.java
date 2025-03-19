package com.spring.evalspring.controller;
import com.spring.evalspring.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class ExceptionController {
    //Exception Produits:
    @ExceptionHandler(ProduitNotFoundException.class)
    public ResponseEntity<Map<String, String>> produitNotFound(ProduitNotFoundException produitNotFound) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("Erreur", produitNotFound.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);
    }

    @ExceptionHandler(NoProduitFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String noLivres(NoProduitFoundException noLivreFound) {
        return noLivreFound.getMessage();
    }

    @ExceptionHandler(SaveProduitExistException.class)
    public ResponseEntity<Map<String, String>> saveLivreExist(SaveProduitExistException saveProduitExistException) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("Erreur", saveProduitExistException.getMessage());
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(errorResponse);
    }

    //Partie catégorie
    @ExceptionHandler(CategorieNotFoundException.class)
    public ResponseEntity<Map<String, String>> categorieNotFoundException(CategorieNotFoundException categorieNotFoundException) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("Erreur", categorieNotFoundException.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);
    }

    @ExceptionHandler(NoCategorieFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String noLivres(NoCategorieFoundException noCategorieFoundException) {
        return noCategorieFoundException.getMessage();
    }

    @ExceptionHandler(SaveCategorieExistException.class)
    public ResponseEntity<Map<String, String>> saveLivreExist(SaveCategorieExistException saveCategorieExistException) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("Erreur",  saveCategorieExistException.getMessage());
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(errorResponse);
    }

}
