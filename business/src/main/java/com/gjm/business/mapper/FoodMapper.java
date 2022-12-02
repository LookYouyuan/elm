package com.gjm.business.mapper;

import com.gjm.business.entity.Food;

import java.util.List;

public interface FoodMapper {
    List<Food> queryFood(int businessId);
    Food queryFoodById(int foodId);
    int updateFood(Food food);
    int addFood(Food food);
}
