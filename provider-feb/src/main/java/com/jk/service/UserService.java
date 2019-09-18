package com.jk.service;

import com.jk.model.User;
import org.springframework.web.bind.annotation.RequestMapping;

public interface UserService {
    @RequestMapping(value="/queryUserByname")
    User queryUserByname(String username);
}
