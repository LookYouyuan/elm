package com.neu.elm_spm.service;

import com.neu.elm_spm.po.DeliveryAddress;
import com.neu.elm_spm.po.Orders;

import java.util.List;

public interface OrdersService {

    int saveOrders(Orders orders);
    Orders getOrdersById(Integer orderId);
    List<Orders> listOrdersByUserId(String userId);

    int updateOrders(Integer orderId);
    int deleteOrders(Integer orderId);
    int sjjd(Integer orderId);
    int qsjd(Integer orderId);
    int ysd(Integer orderId);

    List<DeliveryAddress> queryAddress();
    List<Orders> querySending();
    List<Orders> querymoney();
}
