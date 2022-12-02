package com.gjm.business.controller;
import com.gjm.business.entity.Business;
import com.gjm.business.service.BusinessService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Controller
public class IndexController {

    @Resource
    private BusinessService businessService;

    @RequestMapping("login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("index")
    public String toIndex() {
        return "index";
    }

    @RequestMapping("welcome")
    public String toMain() {
        return "welcome";
    }

    @RequestMapping("updatePassword")
    public String updatePassword(String business_name ,ModelMap modelMap){
        modelMap.put("business_name", business_name );
        return "updatePassword";
    }
    @RequestMapping("doUpdatePassword")
    public String doUpdatePassword(Business business,HttpSession session,ModelMap modelMap){
        String forward="";
        int updatePassword = this.businessService.updatePassword(business);
        if(updatePassword != 0){
            session.setAttribute("business",updatePassword);
            forward = "login";
        }else {
            String msg = "对不起，修改密码失败！";
            modelMap.put("msg",msg);
            forward = "updatepassword";
        }
        return forward;
    }


}
