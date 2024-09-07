package com.example.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RecipeController {

    @PostMapping("/recipe")
    public String get(@RequestParam(value = "id1", required = false) String id1,
                      @RequestParam(value = "id2", required = false) String id2,
                      @RequestParam(value = "id3", required = false) String id3,
                      @RequestParam(value = "id4", required = false) String id4,
                      @RequestParam(value = "id5", required = false) String id5) {

        Map<String, String> recipes = new HashMap<>();

        // 1. 참기름 계란 볶음밥
        recipes.put("참기름 계란 볶음밥", "[1인분] 계란 2개, 참깨 약간, 김(조각) 약간, 참기름 5g(1작은술), 맛다시 약간 ·양념장: 소금 2g(1/3작은술), 간장 5g(1작은술), 다진 마늘 3g(1/2쪽), 후추 약간, 참기름 2g(1/3작은술)");

        // 2. 김치찌개
        recipes.put("김치찌개", "[2인분] 돼지고기 150g, 신김치 200g, 두부 100g, 대파 20g, 물 500ml ·양념장: 고추장 15g(1큰술), 고춧가루 10g(2작은술), 다진 마늘 5g(1쪽), 간장 10g(2작은술), 참기름 5g(1작은술)");

        // 3. 된장찌개
        recipes.put("된장찌개", "[2인분] 된장 30g(2큰술), 두부 100g, 애호박 50g, 감자 50g, 대파 10g, 물 500ml 양념장: 고춧가루 3g(1/2작은술), 다진 마늘 5g(1쪽), 참기름 5g(1작은술)");

        // 4. 불고기
        recipes.put("불고기", "[2인분] 소고기(불고기용) 200g, 양파 50g, 당근 30g, 대파 20g ·양념장: 간장 20g(2큰술), 설탕 10g(2작은술), 참기름 5g(1작은술), 다진 마늘 5g(1쪽), 후추 약간");

        // 5. 오이무침
        recipes.put("오이무침", "[1인분] 오이 100g, 소금 약간, 식초 5g(1작은술), 설탕 5g(1작은술), 고춧가루 3g(1/2작은술) ·양념장: 다진 마늘 2g(1/2쪽), 참기름 2g(1/3작은술), 참깨 약간");


        return "recipe";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }





}
