package com.neu.elm_spm.service;

import com.neu.elm_spm.po.Business;

import java.util.List;

public interface BusinessService {

    List<Business> listBusinessByOrderTypeId(Integer orderTypeId);

    Business getBusinessById(Integer businessId);
    List<Business> listBusinessByfoodname(String foodname);
}
