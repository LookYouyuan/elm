package com.neu.elm_spm.mapper;

import com.neu.elm_spm.po.Business;
import com.neu.elm_spm.test.BaseTestSupport;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BusinessMapperTest extends BaseTestSupport {

    @Resource
    private BusinessMapper businessMapper;
    @Test
    void listBusinessByOrderTypeId() {
        List<Business> list=businessMapper.listBusinessByOrderTypeId(1);
        System.out.println(list);
    }
}