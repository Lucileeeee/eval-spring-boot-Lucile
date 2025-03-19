package com.spring.evalspring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="categorie")
public class Categorie {
   //ATTRIBUTS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "libele", nullable = false, length = 50)
    @NotBlank(message = "Le libele du produit doit être renseigné")
    @Size(min = 2, max = 50, message = "Le libele du produit doit contenir entre 2 et 50 caractères")
    private String libele;
    //CONSTRUCTS
    public Categorie(){}
    public Categorie(String libele) {
        this.libele = libele;
    }
    //GETTER ET SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibele() {
        return libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }
}
