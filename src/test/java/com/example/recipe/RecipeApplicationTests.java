package com.example.recipe;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class RecipeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void Recipe() {
		String str1 = "[1인분]조선부추 50g, 날콩가루 7g(1⅓작은술) ·양념장 : 저염간장 3g(2/3작은술), 다진 대파 5g(1작은술), 다진 마늘 2g(1/2쪽), 고춧가루 2g(1/3작은술), 요리당 2g(1/3작은술), 참기름 2g(1/3작은술), 참깨 약간";
		String str2 = "새우두부계란찜 연두부 75g(3/4모), 칵테일새우 20g(5마리), 달걀 30g(1/2개), 생크림 13g(1큰술), 설탕 5g(1작은술), 무염버터 5g(1작은술) 고명 시금치 10g(3줄기)";
		String str3 = "●방울토마토 소박이 : 방울토마토 150g(5개), 양파 10g(3×1cm), 부추 10g(5줄기) ●양념장 : 고춧가루 4g(1작은술), 멸치액젓 3g(2/3작은술), 다진 마늘 2.5g(1/2쪽), 매실액 2g(1/3작은술), 설탕 2g(1/3작은술), 물 2ml(1/3작은술), 통깨 약간";

		List<String> recipes = new ArrayList<>();

		recipes.add(str1);
		recipes.add(str2);
		recipes.add(str3);

		List<String> foods = new ArrayList<>();
		List<String> name = new ArrayList<>();

		foods.add("부추");
		foods.add("간장");
		foods.add("참기름");
		foods.add("참께");
		foods.add("계란");
		foods.add("라면");

		int cnt = 0;
		for(String recipe : recipes) {
			for (String food : foods) {
				if (recipe.contains(food)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
