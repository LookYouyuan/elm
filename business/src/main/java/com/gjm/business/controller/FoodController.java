package com.gjm.business.controller;

import com.gjm.business.entity.Food;
import com.gjm.business.service.BusinessService;
import com.gjm.business.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class FoodController {
    @Resource
    private FoodService foodService;
    private BusinessService businessService;
    @RequestMapping("queryFood")
    public String queryFood(int businessId, ModelMap modelMap){
        modelMap.put("foods",this.foodService.queryFood(businessId));
        modelMap.put("businessId",businessId);
        return "Food/listFood";
    }

    @RequestMapping("toAddFood")
    public String toAddFood(int businessId, ModelMap modelMap){
        modelMap.put("businessId",businessId);
        return "Food/addFood";
    }

    @RequestMapping("doAddFood")
    public String doAddFood(Food food, ModelMap modelMap){
        this.foodService.addFood(food);
        modelMap.put("foods",this.foodService.queryFood(food.getBusinessId()));
        modelMap.put("businessId",food.getBusinessId());
        return "Food/listFood";
    }

    @RequestMapping("toUpdateFood")
    public String toUpdateFood( int foodId, ModelMap modelMap){
        modelMap.put("food",this.foodService.queryFoodById(foodId));
        modelMap.put("foodId", foodId);
        return "Food/updateFood";
    }

    @RequestMapping("doUpdateFood")
    public String doUpdateFood(  ModelMap modelMap, Food food){
        this.foodService.updateFood(food);
        modelMap.put("foods",this.foodService.queryFood(food.getBusinessId()));
        modelMap.put("businessId",food.getBusinessId());
        return "Food/listFood";
    }

}
