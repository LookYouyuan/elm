package com.neu.elm_spm.mapper;

import com.neu.elm_spm.po.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//必须是
@Mapper
public interface FoodMapper {

    List<Food> listFoodByBusinessId(Integer businessId);

    Food getFoodById(Integer foodId);

}
