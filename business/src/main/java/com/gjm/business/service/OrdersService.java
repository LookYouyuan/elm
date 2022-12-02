package com.gjm.business.service;

import com.gjm.business.entity.Orders;

import java.util.List;

public interface OrdersService {

    int updateOrders(Orders orders);
    Orders queryOrdersById(int orderId);
    List<Orders> queryOrders(int businessId);
}
