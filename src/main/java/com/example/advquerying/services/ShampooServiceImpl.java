package com.example.advquerying.services;

import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.entities.Size;
import com.example.advquerying.repositories.ShampooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ShampooServiceImpl implements ShampooService {

    @Autowired
    private ShampooRepository shampooRepository;

    @Override
    public List<Shampoo> selectBySizeOrderById(Size size) {
       return this.shampooRepository.findBySizeOrderById(size);
    }

    @Override
    public List<Shampoo> selectBySizeOrLabel(Size size, long labelId) {
        //Label label = this.labelRepository.findById(labelId);

        return this.shampooRepository.findBySizeOrLabelIdOrderByPrice(size, labelId);
    }

    @Override
    public List<Shampoo> selectMoreExpensiveThan(BigDecimal price) {
        return this.shampooRepository.findByPriceGreaterThanOrderByPriceDesc(price);
    }

    @Override
    public List<Shampoo> shampoosByPrice(BigDecimal price) {
        return this.shampooRepository.findByPriceLessThan(price);
    }

    @Override
    public List<Shampoo> findByIngredientsCount(int count) {
        return this.shampooRepository.findByIngredientCountLessThan(count);
    }
}
