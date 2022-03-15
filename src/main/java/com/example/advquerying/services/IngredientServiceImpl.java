package com.example.advquerying.services;

import com.example.advquerying.entities.Ingredient;
import com.example.advquerying.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public List<Ingredient> selectNameStartsWith(String start) {
        return this.ingredientRepository.findByNameStartingWith(start);
    }

    @Override
    public List<Ingredient> selectInName(List<String> ingredients) {
        return this.ingredientRepository.findByNameInOrderByPriceAsc(ingredients);
    }

    @Override
    public int deleteByName(String name) {
        return ingredientRepository.deleteByName(name);
    }

    @Override
    public void increasePriceByPercentage(BigDecimal percent) {
        this.ingredientRepository.increasePriceByPercent(percent);
    }

}
