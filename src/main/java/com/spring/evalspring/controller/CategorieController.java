package com.spring.evalspring.controller;

import com.spring.evalspring.model.Categorie;
import com.spring.evalspring.service.CategorieService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    // Méthode qui retourne tous les objets produits
    @GetMapping("/categories")
    public Iterable<Categorie> getAllCategories() {
        return categorieService.getAllCategories();
    }

    @GetMapping("/categorie/{id}")
    public Categorie getCategorieById(@PathVariable Integer id) {
        return categorieService.getCategorieById(id);
        /*orElseThrow(
                () -> new ProduitNotFoundException(id)
        );*/
    }

    // Méthode qui ajoute un Livre
    @PostMapping("/categorie")
    @ResponseStatus(HttpStatus.CREATED)
    public Categorie saveCategorie(@Valid @RequestBody Categorie categorie) {
        return categorieService.saveCategorie(categorie);
    }
}
