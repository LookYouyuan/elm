package com.neu.elm_spm.service;

import com.neu.elm_spm.po.DeliveryAddress;

import java.util.List;

public interface DeliveryAddressService {
    int saveDeliveryAddress(DeliveryAddress deliveryAddress);
    int removeDeliveryAddress(Integer daId);
    int updateDeliveryAddress(DeliveryAddress deliveryAddress);

    List<DeliveryAddress> listDeliveryAddressByUserId(String userId);
    DeliveryAddress getDeliveryAddressById(Integer daId);
}
