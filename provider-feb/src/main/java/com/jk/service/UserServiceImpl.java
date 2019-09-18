package com.jk.service;


import com.jk.dao.UserMapper;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper usermapper;
    @Override
    public User queryUserByname(String username) {
        return usermapper.queryUserByname(username);
    }
}
