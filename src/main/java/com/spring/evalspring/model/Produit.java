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
    private Double price;

   /* @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;*/

    public Produit() {
    }

    public Produit(String nom, Double price) {
        this.nom = nom;
        this.price = price;
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


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

   /* public Categorie getCategorie() {
        return categorie;
    }
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }*/
}