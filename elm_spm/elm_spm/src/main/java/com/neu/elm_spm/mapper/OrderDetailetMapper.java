package com.neu.elm_spm.mapper;

import com.neu.elm_spm.po.OrderDetailet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDetailetMapper {
    //同时添加多条明细
    int saveOrderDetailet(@Param("list") List<OrderDetailet> list);

    List<OrderDetailet> listOrderDetailetByOrderId(Integer orderId);
}
