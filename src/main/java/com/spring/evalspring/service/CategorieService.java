package com.spring.evalspring.service;

import com.spring.evalspring.exception.SaveCategorieExistException;
import com.spring.evalspring.model.Categorie;
import com.spring.evalspring.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public List<Categorie> getAllCategories() {
        if(categorieRepository.count() == 0) {
            throw new RuntimeException("Aucune categorie n'est disponible");
        }
        return (List<Categorie>) categorieRepository.findAll();
    }

    public Categorie getCategorieById(int id) {
        if(!categorieRepository.findById(id).isPresent()) {
            throw new RuntimeException("La categorie qui à l'id : " + id + " n'existe pas");
        }
        return categorieRepository.findById(id).get();
    }

    public Categorie saveCategorie(Categorie categorie) {
        if(categorieRepository.isExist(categorie)){
            throw new SaveCategorieExistException(categorie);
        }
        return categorieRepository.save(categorie);
    }
}



