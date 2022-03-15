package com.example.advquerying.services;

import com.example.advquerying.entities.Ingredient;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


public interface IngredientService {
    List<Ingredient> selectNameStartsWith(String start);

    List<Ingredient> selectInName(List<String> lavender);

    int deleteByName(String name);

    void increasePriceByPercentage(BigDecimal percent);
}
