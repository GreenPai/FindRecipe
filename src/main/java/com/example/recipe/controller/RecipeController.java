package com.example.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecipeController {

    @PostMapping("/recipe")
    public String get(@RequestParam(value = "id1", required = false) String id1,
                      @RequestParam(value = "id2", required = false) String id2,
                      @RequestParam(value = "id3", required = false) String id3,
                      @RequestParam(value = "id4", required = false) String id4,
                      @RequestParam(value = "id5", required = false) String id5) {


        return "recipe";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }



}
