package com.neu.elm_spm.controller;

import com.neu.elm_spm.test.BaseTestSupport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

class BusinessControllerTest extends BaseTestSupport {

    @Resource
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;
    @BeforeEach
    void setUp() {
        mockMvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    void listBusinessByOrderTypeId() throws Exception {
        MockHttpServletRequestBuilder requestBuilder=
                MockMvcRequestBuilders.post("/BusinessController/listBusinessByOrderTypeId")
                .accept(MediaType.ALL)
                .param("orderTypeId","5");
        MvcResult result=mockMvc.perform(requestBuilder).andReturn();
        String str=result.getResponse().getContentAsString();
        System.out.println(str);
    }
}