package com.spring.evalspring.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom", nullable = false, length = 50)
    @NotBlank(message = "Le nom du produit doit être renseigné")
    @Size(min = 3, max = 50, message = "Le nom du produit doit contenir entre 3 et 50 caractères")
    private String nom;

    @Column(name = "prix", nullable = false)
    @NotBlank(message = "Le nom du produit doit être renseigné")
    @Min(value = 1 , message = "Le prix du produit doit être supérieur à zéro")
    private Double prix;

   @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    public Produit() {
    }

    public Produit(String nom, Double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Categorie getCategorie() {
        return categorie;
    }
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

   // public Produit orElseThrow(Object o) {
    //}
}
