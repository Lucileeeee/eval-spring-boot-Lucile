package com.spring.evalspring.repository;
import com.spring.evalspring.model.Categorie;
import com.spring.evalspring.service.CategorieService;
import org.springframework.data.repository.CrudRepository;

public interface CategorieRepository extends CrudRepository<Categorie, Integer> {
    boolean isExist(Categorie categorie);
}
