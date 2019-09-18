package com.jk.service;




import com.jk.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value="service-provider")
public interface UserServiceLxx {

    @RequestMapping(value="/queryUserByname")
    User queryUserByname(@RequestParam String username);
}
