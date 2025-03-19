package com.spring.evalspring.repository;

import com.spring.evalspring.model.Produit;
import com.spring.evalspring.service.ProduitService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Integer> {
    ProduitService findBy(String nom, Double prix);

    boolean isExist(Produit produit);
}





