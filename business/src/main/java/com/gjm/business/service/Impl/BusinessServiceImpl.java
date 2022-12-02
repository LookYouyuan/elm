package com.gjm.business.service.Impl;

import com.gjm.business.entity.Business;

import com.gjm.business.mapper.BusinessMapper;

import com.gjm.business.service.BusinessService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {
    @Resource
    private BusinessMapper businessMapper;


    @Override
    public Business login(Business business) {
        return this.businessMapper.login(business);
    }
    @Override
    public int updatePassword(Business business){
        return this.businessMapper.updatePassword(business);
    }

    @Override
    public List<Business> queryBusiness(int businessId){
        return this.businessMapper.queryBusiness(businessId);
    }

    @Override
    public int updatedeliveryPrice(Business business){
        return this.businessMapper.updatedeliveryPrice(business);
    }
}
