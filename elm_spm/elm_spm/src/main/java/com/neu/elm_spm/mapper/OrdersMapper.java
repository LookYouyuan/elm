package com.neu.elm_spm.mapper;

import com.neu.elm_spm.po.DeliveryAddress;
import com.neu.elm_spm.po.Orders;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface OrdersMapper {

    Orders getOrdersById(Integer orderId);

    List<Orders> listOrdersByUserId(String userId);

    int saveOrders(Orders orders);

    @Update("update orders set orderState=1 where orderId=#{orderId}")
    int updateOrders(Integer orderId);

    @Delete("delete from orders where orderId = #{orderId}")
    int deleteOrders(Integer orderId);

    @Update("update orders set orderState =2 where daId = #{orderId}")
    int sjjd(Integer orderId);

    @Update("update orders set orderState =3 where daId = #{daId}")
    int qsjd(Integer orderId);

    @Update("update orders set orderState =4 where orderId = #{orderId}")
    int ysd(Integer orderId);

    List<DeliveryAddress> queryAddress();
    List<Orders> querySending();
    List<Orders> querymoney();

}
