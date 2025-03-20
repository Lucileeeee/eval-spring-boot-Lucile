# Documentation de l'API Eval Spring-Boot Lucile
## 1) <u>Ajout d'un Produit</u> 
### Exemple de requête valide :
```js
meta {
  name: Ajouter un produit
  type: http
  seq: 4
}

post {
  url: http://localhost:9000/api/produit
  body: json
  auth: none
}

body:json {
  {
    "nom":"Outils de Jardinage",
    "prix":"12.99"
  }
}
```
### /!\ Exemple de requête INVALIDE:
```js
meta {
  name: Ajouter un produit
  type: http
  seq: 4
}

post {
  url: http://localhost:9000/api/produit
  body: json
  auth: none
}

body:json {
  {
    "nom":"SO",
    "prix":"0.99"
  }
}
```

## 2) <u>Afficher tous les Produits</u> 
### Exemple de requête valide:
```js
meta {
  name: Afficher tous les produits
  type: http
  seq: 1
}

get {
  url: http://localhost:9000/api/produits
  body: none
  auth: none
}
```
### /!\ Exemple de requête INVALIDE:
```js
meta {
  name: Afficher tous les produits
  type: http
  seq: 1
}

post {
  url: http://localhost:9000/api/produits
  body: none
  auth: none
}
```

## 3) <u>Afficher une categorie par son ID </u> 
### Exemple de requête valide:
```js
meta {
  name: Catégorie par son ID
  type: http
  seq: 3
}

get {
  url: http://localhost:9000/api/categorie/2
  body: none
  auth: none
}
```
### /!\ Exemple de requête INVALIDE:
```js
meta {
  name: Catégorie par son ID
  type: http
  seq: 3
}

put {
  url: http://localhost:9000/api/categorie/2
  body: none
  auth: none
}
```