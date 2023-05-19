package com.devb.food.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devb.food.entity.Food;

@RestController
@RequestMapping("/food")
public class FoodResource {
	
	@GetMapping
	public List<Food> getAll(){
		List<Food> food = new ArrayList<>();
		
		return food;
	}

}
