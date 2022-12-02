package com.neu.elm_spm.mapper;

import com.neu.elm_spm.po.Business;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BusinessMapper {


    //根据点餐类型查询商家信息
    @Select("select * from business where orderTypeId=#{orderTypeId} order by businessId")
    List<Business> listBusinessByOrderTypeId(Integer orderTypeId);

    @Select("select * from business where businessId=#{businessId}")
    Business getBusinessById(Integer businessId);

    @Select("select * from business where businessId in (SELECT businessId from food where foodname=#{foodname});")
    List<Business> getBusinessByfoodname(String foodname);


}
