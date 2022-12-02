package com.neu.elm_spm.service;

import com.neu.elm_spm.po.Food;

import java.util.List;

public interface FoodService {

    List<Food> listFoodByBusinessId(Integer businessId);

    Food getFoodById(Integer foodId);
}
