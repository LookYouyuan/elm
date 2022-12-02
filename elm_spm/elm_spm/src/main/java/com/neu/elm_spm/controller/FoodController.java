package com.neu.elm_spm.controller;

import com.neu.elm_spm.po.Food;
import com.neu.elm_spm.service.FoodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/FoodController")
public class FoodController {
    @Resource
    private FoodService foodService;
    @RequestMapping("/listFoodByBusinessId")
    public List<Food> listFoodByBusinessId(Integer businessId){
        return foodService.listFoodByBusinessId(businessId);
    }

    @RequestMapping("/getFoodById")
    public Food getFoodById(Integer foodId){
        return foodService.getFoodById(foodId);
    }
}
