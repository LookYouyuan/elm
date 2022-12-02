package com.gjm.business.service;

import com.gjm.business.entity.Food;

import java.util.List;

public interface FoodService {

    int addFood(Food food);
    Food queryFoodById(int foodId);
    int updateFood(Food food);
    List<Food> queryFood(int businessId);
}
