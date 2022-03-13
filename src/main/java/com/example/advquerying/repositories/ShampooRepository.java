package com.example.advquerying.repositories;

import com.example.advquerying.entities.Ingredient;
import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ShampooRepository extends JpaRepository<Shampoo, Long> {


    List<Shampoo> findAllByBrand(String brand);

    List<Shampoo> findByBrandAndSize(String brand, Size size);

    List<Shampoo> findBySizeOrderById(Size size);

    //JPA Заявка, която да се използва при извикване
    //на метода
    @Query("SELECT s FROM Shampoo s " +
            "JOIN s.ingredients i " +
            "where i.name in :ingredientNames")
    List<Shampoo> findByIngredientsNames(Set<String> ingredientNames);

    List<Shampoo> findBySizeOrLabelIdOrderByPrice(Size size, long labelId);
}
