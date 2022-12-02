package com.neu.elm_spm.controller;

import com.neu.elm_spm.po.User;
import com.neu.elm_spm.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;

@RestController
@RequestMapping("/UserController")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/saveUser")
    public int userSave(User user){
        return userService.saveUser(user);
    }
    @RequestMapping("/getUserByIdByPass")
    public User getUserByIdAndPwd(User user){
        return userService.getUserByIdAndPwd(user);
    }

    @RequestMapping("/getUserById")
    public int getUserById(String userId){
        return userService.getUserById(userId);
    }

    @RequestMapping("/updateUser")
    public int updateUser(User user){
//        for(int i=0;i<10;i++){
//            System.out.println("--------------------------------------");
//        }
//        System.out.println("user:"+user.getUserId()+" "+user.getUserName()+" "+user.getPassword());
        return userService.updateUser(user);
    }
}
