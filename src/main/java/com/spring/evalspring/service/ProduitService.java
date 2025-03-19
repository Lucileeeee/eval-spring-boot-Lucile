package com.spring.evalspring.service;

import com.spring.evalspring.exception.SaveProduitExistException;
import com.spring.evalspring.model.Produit;
import com.spring.evalspring.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    //Méthode qui recherche un produit par son id
    public Produit getProduitById(int id) {
        if(!produitRepository.findById(id).isPresent()) {
            throw new RuntimeException("Le produit qui à l'id : " + id + " n'existe pas");
        }
        return produitRepository.findById(id).get();
    }
    //Méthode qui renvois la liste de tous les produits
    public List<Produit> getAllProduits() {
        if(produitRepository.count() == 0) {
            throw new RuntimeException("Aucun produit n'est disponible");
        }
        return (List<Produit>) produitRepository.findAll();
    }

    //Méthode qui ajoute un produit
    public Produit add(Produit produit){
        if(produitRepository.isExist(produit)){
            throw  new SaveProduitExistException(produit);
        }
        return produitRepository.save(produit);
    }
}


