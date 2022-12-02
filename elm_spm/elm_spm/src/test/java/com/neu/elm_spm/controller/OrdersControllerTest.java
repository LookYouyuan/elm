package com.neu.elm_spm.controller;

import com.neu.elm_spm.po.DeliveryAddress;
import com.neu.elm_spm.service.OrdersService;
import com.neu.elm_spm.test.BaseTestSupport;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

public class OrdersControllerTest extends BaseTestSupport {

    @Resource
    private OrdersController ordersController;
    @Test
    public void queryAddress() {

        List<DeliveryAddress> list = ordersController.QueryAddress();
        System.out.println(list);
    }
}