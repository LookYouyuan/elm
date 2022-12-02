package com.neu.elm_spm.service.impl;

import com.neu.elm_spm.mapper.FoodMapper;
import com.neu.elm_spm.po.Food;
import com.neu.elm_spm.service.FoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Resource
    private FoodMapper foodMapper;
    @Override
    public List<Food> listFoodByBusinessId(Integer businessId) {
        return foodMapper.listFoodByBusinessId(businessId);
    }

    @Override
    public Food getFoodById(Integer foodId) {

        return foodMapper.getFoodById(foodId);
    }
}
