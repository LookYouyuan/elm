package com.neu.elm_spm.controller;

import com.neu.elm_spm.po.DeliveryAddress;
import com.neu.elm_spm.po.Orders;
import com.neu.elm_spm.service.OrdersService;
import org.aspectj.weaver.ast.Or;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/OrdersController")
public class OrdersController {
    @Resource
    private OrdersService ordersService;

    @RequestMapping("/createOrders")
    public int saveOrders(Orders orders){
        return ordersService.saveOrders(orders);
    }

    @RequestMapping("/getOrdersById")
    public Orders getOrdersById(Integer orderId){
        return ordersService.getOrdersById(orderId);
    }
    @RequestMapping("/listOrdersByUserId")
    public List<Orders> listOrdersByUserId(String userId){
        return ordersService.listOrdersByUserId(userId);
    }

    @RequestMapping("/updateOrderState")
    public int updateOrderState(Integer orderId){
        return ordersService.updateOrders(orderId);
    }
    @RequestMapping("/deleteOrders")
    public int deleteOrders(Integer orderId){
        System.out.println("-----------------------"+orderId);
        return ordersService.deleteOrders(orderId);
    }
    @RequestMapping("/sjjd")
    public int sjjd(Integer orderId){
        return ordersService.sjjd(orderId);
    }
    @RequestMapping("/qsjd")
    public int qsjd(Integer daId){
        return ordersService.qsjd(daId);
    }
    @RequestMapping("/ysd")
    public int ysd(Integer orderId){
        return ordersService.ysd(orderId);
    }
    @RequestMapping("/queryAddress")
    public List<DeliveryAddress> QueryAddress(){
        return ordersService.queryAddress();
    }
    @RequestMapping("/querySending")
    public List<Orders> QuerySending(){
        return ordersService.querySending();

    }
    @RequestMapping("/ddtj")
    public List<Orders> QueryMoney(){return ordersService.querymoney();}
}
