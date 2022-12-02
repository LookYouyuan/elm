package com.neu.elm_spm.controller;

import com.neu.elm_spm.po.DeliveryAddress;
import com.neu.elm_spm.service.DeliveryAddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/DeliveryAddressController")
public class DeliveryAddressController {

    @Resource
    private DeliveryAddressService deliveryAddressService;

    @RequestMapping("/saveDeliveryAddress")
    public int saveDeliveryAddress(DeliveryAddress deliveryAddress){
        return deliveryAddressService.saveDeliveryAddress(deliveryAddress);
    }

    @RequestMapping("/updateDeliveryAddress")
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress){
        return deliveryAddressService.updateDeliveryAddress(deliveryAddress);
    }

    @RequestMapping("/removeDeliveryAddress")
    public int removeDeliveryAddress(Integer daId){
        return deliveryAddressService.removeDeliveryAddress(daId);
    }

    @RequestMapping("/getDeliveryAddressById")
    public DeliveryAddress getDeliveryAddressById(Integer daId){
        return deliveryAddressService.getDeliveryAddressById(daId);
    }

    @RequestMapping("/listDeliveryAddressByUserId")
    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId){
        return deliveryAddressService.listDeliveryAddressByUserId(userId);
    }
}
