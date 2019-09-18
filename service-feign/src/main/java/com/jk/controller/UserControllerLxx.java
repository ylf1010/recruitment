package com.jk.controller;


import com.jk.model.User;


import com.jk.service.UserServiceLxx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind .annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserControllerLxx {

    @Autowired
    private UserServiceLxx userservice;


    //企业后台登录页面
    @RequestMapping("EnterpriseLoginJsp")
    public String EnterpriseLoginJsp(){
        return "lxx/enterpriselogin";
    }
    //boss直聘登录页面
    @RequestMapping("LoginJsp")
    public String LoginJsp(){
        return "lxx/login";
    }

   //登录方法v
    @RequestMapping("LoginUser")
    @ResponseBody
    public  int  LoginUser(@RequestParam String password, @RequestParam String username, HttpSession session){
        int flag=0;
        User reuser =userservice.queryUserByname(username);
        //System.out.println(reuser.getPassword());
        if (reuser==null){
            return 0;
        }else if(password!=null  &&!"".equals(password)  && password.equals(reuser.getUserpowd())){
            session.setAttribute("user", reuser);
            return 1;
        }

        return 2;
    }

}
