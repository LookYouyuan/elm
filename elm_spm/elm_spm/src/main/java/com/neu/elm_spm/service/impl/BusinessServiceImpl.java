package com.neu.elm_spm.service.impl;

import com.neu.elm_spm.mapper.BusinessMapper;
import com.neu.elm_spm.po.Business;
import com.neu.elm_spm.service.BusinessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Resource
    private BusinessMapper businessMapper;
    @Override
    public List<Business> listBusinessByOrderTypeId(Integer orderTypeId) {
        return businessMapper.listBusinessByOrderTypeId(orderTypeId);
    }

    @Override
    public Business getBusinessById(Integer businessId) {
        return businessMapper.getBusinessById(businessId);
    }
    @Override
    public List<Business> listBusinessByfoodname(String foodname) {
        return businessMapper.getBusinessByfoodname(foodname);
    }
}
