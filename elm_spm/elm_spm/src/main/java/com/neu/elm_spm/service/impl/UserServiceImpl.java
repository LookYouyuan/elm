package com.neu.elm_spm.service.impl;

import com.neu.elm_spm.mapper.UserMapper;
import com.neu.elm_spm.po.User;
import com.neu.elm_spm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public User getUserByIdAndPwd(User user) {

        return userMapper.getUserByIdAndPwd(user);
    }

    @Override
    public int getUserById(String userId) {

        return userMapper.getUserById(userId);
    }

    @Override
    public int updateUser(User user) {

        return userMapper.updateUser(user);

    }
}
