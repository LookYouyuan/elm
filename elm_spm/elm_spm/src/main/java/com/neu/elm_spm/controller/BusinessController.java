package com.neu.elm_spm.controller;

import com.neu.elm_spm.po.Business;
import com.neu.elm_spm.service.BusinessService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/BusinessController")
public class BusinessController {

    @Resource
    private BusinessService businessService;

    @RequestMapping("/listBusinessByOrderTypeId")
    public List<Business> listBusinessByOrderTypeId(Integer orderTypeId){
        return businessService.listBusinessByOrderTypeId(orderTypeId);
    }

    @RequestMapping("/getBusinessById")
    public Business getBusinessById(Integer businessId){
        return businessService.getBusinessById(businessId);
    }

    @RequestMapping("/listBusinessByfoodname")
    public List<Business> listBusinessByfoodname(String foodname){
        return businessService.listBusinessByfoodname(foodname);
    }
}
