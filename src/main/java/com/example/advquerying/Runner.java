package com.example.advquerying;

import com.example.advquerying.entities.Size;
import com.example.advquerying.repositories.ShampooRepository;
import com.example.advquerying.services.ShampooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Runner implements CommandLineRunner {

    private final ShampooRepository shampooRepository;

    private final ShampooService shampooService;

    @Autowired
    public Runner(ShampooRepository shampooRepository,
                  ShampooService shampooService) {
        this.shampooRepository = shampooRepository;
        this.shampooService = shampooService;
    }



    public void run(String... args) {

        Scanner scan = new Scanner(System.in);


        //1
//        this.shampooService.selectBySizeOrderById(Size.MEDIUM)
//                .forEach(System.out::println);


        //2
        this.shampooService.selectBySizeOrLabel(Size.MEDIUM, 10)
                .forEach(System.out::println);



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
