package com.neu.elm_spm.mapper;

import com.neu.elm_spm.po.User;
import com.neu.elm_spm.test.BaseTestSupport;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest extends BaseTestSupport {

    @Resource
    private UserMapper userMapper;
    @Test
    void saveUser() {
        User user=new User();
        user.setUserId("neu");
        user.setPassword("neu");
        user.setUserSex(1);
        user.setUserName("东软");
        userMapper.saveUser(user);
    }

    @Test
    void updateUser(){
        User user = new User();
        user.setUserId("1");
        user.setUserName("优雅");
        user.setPassword("456");
        user.setUserSex(0);
        userMapper.updateUser(user);
    }

    @Test
    void getUserByIdAndPwd() {
        User user=new User();
        user.setUserId("neu");
        user.setPassword("neu");
        User u=userMapper.getUserByIdAndPwd(user);
        assertNotNull(u);
    }

    @Test
    void getUserById() {
    }
}