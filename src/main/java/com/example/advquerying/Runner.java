package com.example.advquerying;

import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.repositories.ShampooRepository;
import com.example.advquerying.services.IngredientService;
import com.example.advquerying.services.ShampooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

@Component
public class Runner implements CommandLineRunner {

    private final ShampooRepository shampooRepository;

    private final ShampooService shampooService;
    private final IngredientService ingredientService;

    @Autowired
    public Runner(ShampooRepository shampooRepository,
                  ShampooService shampooService, IngredientService ingredientService) {
        this.shampooRepository = shampooRepository;
        this.shampooService = shampooService;
        this.ingredientService = ingredientService;
    }


    @Transactional
    public void run(String... args) {

        Scanner scan = new Scanner(System.in);


        //1
//        this.shampooService.selectBySizeOrderById(Size.MEDIUM)
//                .forEach(System.out::println);


        //2
//        this.shampooService.selectBySizeOrLabel(Size.MEDIUM, 10)
//                .forEach(System.out::println);

        //3
//        this.shampooService.selectMoreExpensiveThan(BigDecimal.valueOf(5))
//                .forEach(System.out::println);

        //4
//        this.ingredientService.selectNameStartsWith("M")
//                .forEach(System.out::println);

        //5
//        this.ingredientService.selectInName(List.of("Lavender", "Herbs", "Apple"))
//                .forEach(System.out::println);

        //6
//        List<Shampoo> shampoos = this.shampooService.shampoosByPrice(BigDecimal.valueOf(8.50));
//        System.out.println(shampoos.size());


        //8
//        this.shampooService.findByIngredientsCount(2)
//                .forEach(System.out::println);

        //9 - Това трие цялата база заради Cascade ALL
        // int deletedCount = this.ingredientService.deleteByName("Nettle");

        //10
        this.ingredientService.increasePriceByPercentage(BigDecimal.valueOf(0.1));

        // System.out.println(deletedCount);

        //        String sizeName = scan.nextLine();
//        Size size = Size.valueOf(sizeName);

//        this.shampooRepository.findBySizeOrderById(size)
//                .forEach(System.out::println);


//        String first = scan.nextLine();
//        String second = scan.nextLine();
//
//        Set<String> names = Set.of(first, second);
//
//        List<Shampoo> ingredientsNames = this.shampooRepository.findByIngredientsNames(names);
//
//        ingredientsNames.forEach(System.out::println);


    }
}
