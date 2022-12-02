package com.gjm.business.controller;

import com.gjm.business.entity.Business;

import com.gjm.business.service.BusinessService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class BusinessController {
    @Resource
    private BusinessService businessService;
    @RequestMapping("queryBusiness")
    public String queryBusiness(int businessId, ModelMap modelMap){
        modelMap.put("businesss",this.businessService.queryBusiness(businessId));
        return "DeliveryPrice/listDeliveryPrice";
    }

    @RequestMapping("toUpdateDeliveryPrice")
    public String toUpdateDeliveryPrice(int businessId, ModelMap modelMap){
        modelMap.put("businesss", this.businessService.queryBusiness(businessId));
        return "DeliveryPrice/updateDeliveryPrice";
    }

    @RequestMapping("doUpdateDeliveryPrice")
    public String doUpdateDeliveryPrice(int businessId, Business business, ModelMap modelMap){
        this.businessService.updatedeliveryPrice(business);
        modelMap.put("businesss",this.businessService.queryBusiness(businessId));
        return "DeliveryPrice/listDeliveryPrice";
    }
}
