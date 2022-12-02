package com.neu.elm_spm.service.impl;

import com.neu.elm_spm.mapper.CartMapper;
import com.neu.elm_spm.mapper.OrderDetailetMapper;
import com.neu.elm_spm.mapper.OrdersMapper;
import com.neu.elm_spm.po.Cart;
import com.neu.elm_spm.po.DeliveryAddress;
import com.neu.elm_spm.po.OrderDetailet;
import com.neu.elm_spm.po.Orders;
import com.neu.elm_spm.service.OrdersService;
import com.neu.elm_spm.util.DateUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Resource
    private OrdersMapper ordersMapper;
    @Resource
    private CartMapper cartMapper;
    @Resource
    private OrderDetailetMapper orderDetailetMapper;
    @Override
    public int saveOrders(Orders orders) {

        orders.setOrderDate(DateUtil.getCurrentTime());
        ordersMapper.saveOrders(orders);
        //获取订单编号
        int orderId=orders.getOrderId();
        //从购物车中查询数据
        Cart cart=new Cart();
        cart.setBusinessId(orders.getBusinessId());
        cart.setUserId(orders.getUserId());
        List<Cart> cartList=cartMapper.listCart(cart);
        //把购物车中的数据添加到订单明细中
        List<OrderDetailet> ods=new ArrayList<>();
        for(Cart c :cartList){
            OrderDetailet od=new OrderDetailet();
            od.setFoodId(c.getFoodId());
            od.setQuantity(c.getQuantity());
            od.setOrderId(orderId);
            ods.add(od);
        }
        //保存订单明细
        orderDetailetMapper.saveOrderDetailet(ods);
        //清空购物车
        cartMapper.removeCart(cart);
        return orderId;
    }

    @Override
    public Orders getOrdersById(Integer orderId) {
        return ordersMapper.getOrdersById(orderId);
    }

    @Override
    public List<Orders> listOrdersByUserId(String userId) {
        return ordersMapper.listOrdersByUserId(userId);
    }

    @Override
    public int updateOrders(Integer orderId) {
        return ordersMapper.updateOrders(orderId);
    }
    @Override
    public int deleteOrders(Integer orderId) {return  ordersMapper.deleteOrders(orderId); }

    @Override
    public int sjjd(Integer orderId) {
        return ordersMapper.sjjd(orderId);
    }

    @Override
    public int qsjd(Integer orderId) {
        return ordersMapper.qsjd(orderId);
    }

    @Override
    public int ysd(Integer orderId) {
        return ordersMapper.ysd(orderId);
    }

    @Override
    public List<DeliveryAddress> queryAddress() {
        return ordersMapper.queryAddress();
    }
    @Override
    public List<Orders> querySending() {
        return ordersMapper.querySending();
    }
    @Override
    public  List<Orders> querymoney(){return ordersMapper.querymoney();}
}
