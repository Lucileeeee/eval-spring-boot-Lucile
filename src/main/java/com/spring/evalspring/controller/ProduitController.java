package com.spring.evalspring.controller;
import com.spring.evalspring.exception.ProduitNotFoundException;
import com.spring.evalspring.model.Produit;
import com.spring.evalspring.service.ProduitService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    // Méthode qui retourne tous les objets produits
    @GetMapping("/produits")
    public Iterable<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }

    @GetMapping("/produit/{id}")
    public Produit getProduitById(@PathVariable Integer id) {
        return produitService.getProduitById(id);
        /*orElseThrow(
                () -> new ProduitNotFoundException(id)
        );*/
    }

    // Méthode qui ajoute un Livre
    @PostMapping("/produit")
    @ResponseStatus(HttpStatus.CREATED)
    public Produit saveProduit(@Valid @RequestBody Produit produit) {
        return produitService.add(produit);
    }
}
