package com.gjm.business.service.Impl;

import com.gjm.business.entity.Food;
import com.gjm.business.mapper.FoodMapper;
import com.gjm.business.service.FoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Resource
    private FoodMapper foodMapper;

    @Override
    public List<Food> queryFood(int businessId){
        return this.foodMapper.queryFood(businessId);
    }

    @Override
    public Food queryFoodById(int foodId){
        return this.foodMapper.queryFoodById(foodId);
    }

    @Override
    public int updateFood(Food food){
        return this.foodMapper.updateFood(food);
    }
    @Override
    public int addFood(Food food){
        return this.foodMapper.addFood(food);
    }
}
