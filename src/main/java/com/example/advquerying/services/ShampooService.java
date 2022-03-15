package com.example.advquerying.services;

import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.entities.Size;

import java.math.BigDecimal;
import java.util.List;

public interface ShampooService {

    List<Shampoo> selectBySizeOrderById(Size size);

    List<Shampoo> selectBySizeOrLabel(Size size, long labelId);

    List<Shampoo> selectMoreExpensiveThan(BigDecimal price);

    List<Shampoo> shampoosByPrice(BigDecimal valueOf);

    List<Shampoo> findByIngredientsCount(int count);
}
