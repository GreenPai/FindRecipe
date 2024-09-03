package com.example.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecipeController {

    @PostMapping("/recipe")
    public String  get(@RequestParam("id1") String id1,
                       @RequestParam("id1") String id2,
                       @RequestParam("id1") String id3,
                       @RequestParam("id1") String id4,
                       @RequestParam("id1") String id5){

        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id3);
        System.out.println(id4);
        System.out.println(id5);

        return "recipe.html";
    }

    @GetMapping("/")
    public String index() {
        return "index";  // index.html을 반환
    }

}
