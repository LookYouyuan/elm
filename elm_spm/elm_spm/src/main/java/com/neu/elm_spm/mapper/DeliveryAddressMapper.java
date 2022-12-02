package com.neu.elm_spm.mapper;

import com.neu.elm_spm.po.DeliveryAddress;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeliveryAddressMapper {

    @Insert("insert into deliveryAddress values(null,#{contactName}," +
            "#{contactSex},#{contactTel},#{address},#{userId})")
    int saveDeliveryAddress(DeliveryAddress deliveryAddress);
    @Delete("delete from deliveryAddress where daId = #{daId}")
    int removeDeliveryAddress(Integer daId);
    @Update("update deliveryAddress set contactName=#{contactName}," +
            "contactSex=#{contactSex},contactTel=#{contactTel}," +
            "address = #{address} where daId = #{daId}")
    int updateDeliveryAddress(DeliveryAddress deliveryAddress);

    @Select("select * from deliveryAddress where userId=#{userId}")
    List<DeliveryAddress> listDeliveryAddressByUserId(String userId);

    @Select("select * from deliveryAddress where daId=#{daId}")
    DeliveryAddress getDeliveryAddressById(Integer daId);



}
