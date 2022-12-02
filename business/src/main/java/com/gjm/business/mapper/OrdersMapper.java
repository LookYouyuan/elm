package com.gjm.business.mapper;

import com.gjm.business.entity.Orders;

import java.util.List;

public interface OrdersMapper {

    int updateOrders(Orders orders);
    Orders queryOrdersById(int orderId);

    List<Orders> queryOrders(int businessId);
}
