package com.gjm.business.service.Impl;


import com.gjm.business.entity.Orders;
import com.gjm.business.mapper.OrdersMapper;
import com.gjm.business.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> queryOrders(int businessId){
        return this.ordersMapper.queryOrders(businessId);
    }

    @Override
    public Orders queryOrdersById(int orderId){
        return this.ordersMapper.queryOrdersById(orderId);
    }

    @Override
    public int updateOrders(Orders orders){
        return this.ordersMapper.updateOrders(orders);
    }
}
