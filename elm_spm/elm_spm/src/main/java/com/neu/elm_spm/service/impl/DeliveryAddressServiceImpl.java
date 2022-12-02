package com.neu.elm_spm.service.impl;

import com.neu.elm_spm.mapper.DeliveryAddressMapper;
import com.neu.elm_spm.po.DeliveryAddress;
import com.neu.elm_spm.service.DeliveryAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {

    @Resource
    private DeliveryAddressMapper deliveryAddressMapper;
    @Override
    public int saveDeliveryAddress(DeliveryAddress deliveryAddress) {
        return deliveryAddressMapper.saveDeliveryAddress(deliveryAddress);
    }

    @Override
    public int removeDeliveryAddress(Integer daId) {
        return deliveryAddressMapper.removeDeliveryAddress(daId);
    }

    @Override
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress) {
        return deliveryAddressMapper.updateDeliveryAddress(deliveryAddress);
    }

    @Override
    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId) {
        return deliveryAddressMapper.listDeliveryAddressByUserId(userId);
    }

    @Override
    public DeliveryAddress getDeliveryAddressById(Integer daId) {
        return deliveryAddressMapper.getDeliveryAddressById(daId);
    }
}
