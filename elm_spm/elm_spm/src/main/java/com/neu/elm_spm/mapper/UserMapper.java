package com.neu.elm_spm.mapper;

import com.neu.elm_spm.po.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

    int saveUser(User user);

    User getUserByIdAndPwd(User user);

    int getUserById(String userId);

    int updateUser(User user);
}
