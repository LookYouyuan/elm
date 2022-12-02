package com.gjm.business.controller;
import com.gjm.business.entity.Orders;
import com.gjm.business.service.OrdersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class OrdersController {
    @Resource
    private OrdersService ordersService;

    @RequestMapping("queryOrders")
    public String queryOrders(int businessId, ModelMap modelMap){
        modelMap.put("orderss",this.ordersService.queryOrders(businessId));
        modelMap.put("businessId", businessId);
        return "Orders/listOrders";
    }

    @RequestMapping("toUpdateOrders")
    public String toUpdateOrders(int orderId, ModelMap modelMap){
        modelMap.put("orders",this.ordersService.queryOrdersById(orderId));
        modelMap.put("orderId",orderId);
        return "Orders/updateOrders";
    }

    @RequestMapping("doUpdateOrders")
    public String doUpdateOrders(Orders orders, ModelMap modelMap){
        this.ordersService.updateOrders(orders);
        modelMap.put("orderss",this.ordersService.queryOrders(orders.getBusinessId()));
        modelMap.put("businessId",orders.getBusinessId());
        return "Orders/listOrders";
    }

}
