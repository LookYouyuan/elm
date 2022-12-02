package com.neu.elm_spm.mapper;

import com.neu.elm_spm.po.OrderDetailet;
import com.neu.elm_spm.test.BaseTestSupport;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderDetailetMapperTest extends BaseTestSupport {

    @Resource
    private OrderDetailetMapper orderDetailetMapper;
    @Test
    void saveOrderDetailet() {
        List<OrderDetailet> list=new ArrayList<>();
        OrderDetailet od=new OrderDetailet();
        od.setOrderId(1);//订单编号
        od.setFoodId(1);//商品编号
        od.setQuantity(5);//该商品购买数量
        list.add(od);
        od=new OrderDetailet();
        od.setOrderId(1);
        od.setFoodId(2);
        od.setQuantity(1);
        list.add(od);
        od=new OrderDetailet();
        od.setOrderId(1);
        od.setFoodId(3);
        od.setQuantity(3);
        list.add(od);
        orderDetailetMapper.saveOrderDetailet(list);
    }
}