package com.jk.controller;

import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userservice;

    @RequestMapping("queryUserByname")
    @ResponseBody
    public User queryUserByname(@RequestParam String username){
        System.out.println(username);
        User reuser=userservice.queryUserByname(username);
        return reuser;
    }
}
