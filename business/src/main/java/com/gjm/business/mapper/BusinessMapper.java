package com.gjm.business.mapper;


import com.gjm.business.entity.Business;


import java.util.List;

public interface BusinessMapper{
    Business login(Business business);
    int updatePassword(Business business);
    int updatedeliveryPrice(Business business);
    List<Business> queryBusiness(int businessId);


}
