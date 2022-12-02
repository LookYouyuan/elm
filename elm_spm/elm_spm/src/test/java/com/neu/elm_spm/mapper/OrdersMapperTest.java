package com.neu.elm_spm.mapper;

import com.neu.elm_spm.po.DeliveryAddress;
import com.neu.elm_spm.test.BaseTestSupport;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

class OrdersMapperTest extends BaseTestSupport {

    @Resource
    private OrdersMapper ordersMapper;
    @Test
    public void getOrdersById() {
    }


    @Test
    public void sjjd() {
        int row = ordersMapper.sjjd(7);
        System.out.println(row);
    }

    @Test
    public void updateOrders() {
        int row = ordersMapper.updateOrders(22);
        System.out.println(row);
    }

    @Test
    public void queryAddress() {
        List<DeliveryAddress> list = ordersMapper.queryAddress();
        System.out.println(list);
    }
}