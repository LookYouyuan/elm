package com.neu.elm_spm.service;

import com.neu.elm_spm.po.User;

public interface UserService {

    int saveUser(User user);

    User getUserByIdAndPwd(User user);

    int getUserById(String userId);

    int updateUser(User user);
}
