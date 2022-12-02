package com.neu.elm_spm.service;

import com.neu.elm_spm.test.BaseTestSupport;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

class BusinessServiceTest extends BaseTestSupport {

    @Resource
    private BusinessService businessService;
    @Test
    void listBusinessByOrderTypeId() {
        businessService.listBusinessByOrderTypeId(5);
    }
}